package StudentSyetem;
        import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;
public class Login {
    /**
     * 测试类
     *
     * @param args
     */
    public static void main(String[] args) {
        Person P = new Person();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("-------------欢迎登录学生信息系统-------------");
            System.out.println("\t\t1       登录");
            System.out.println("\t\t2       注册");
            System.out.print("请选择您要进行的操作：");
            int i = sc.nextInt();
            if (i == 1) {// 登录入口
                System.out.print("请输入账号：");
                String A = sc.next();
                System.out.print("请输入密码：");
                String B = sc.next();
                P.Login(A, B);
            } else if (i == 2) {// 注册入口
                P.register();
            }

        }
    }
}

/**
 * 创建Person类，用于编写是否注册、登录、注销等操作的一系列代码。
 * 使用了map来实现账号与密码的一一对应关系，用tip的数值变化来确定是否有账号是否登录
 *
 * @author Administrator
 *
 */
class Person {
    Map<String, String> Uer = new HashMap<String, String>();// Map"key-value”键值对"接口，HashMap是它的实现类
    int tip = 0;// 判定是否为登陆状态，0为未登陆，1为已有用户登陆；


    /**
     * Login方法判断账户是否登录，若已登陆则注销，若未登录
     *
     * @param uer
     * @param password 使用形参user、password来存储账户密码
     */
    public void Login(String uer, String password) {
        int i = 0;// 判断输入的账户密码是否相同，1为相同，0为不同，不同则不能登录。
        if (tip == 1) {
            System.out.println("账户已登陆");
            StudentList.Option();
        } else {
            // keySet() 返回所有 key 组成的 set 视图
            // for-each 增强for循环每一个账户密码。
            for (String key : Uer.keySet()) {
                if (key.equals(uer) && Uer.get(key).equals(password)) {
                    i = 1;
                }

            }
            if (i == 0) {
                System.out.println("账号或者密码错误");
            } else{
                System.out.println("登录成功！");
                StudentList.Option();
                tip = 1;
            }
        }
    }

    /**
     * register()方法用于存储登录信息，与先前的信息比较，若账户相同则已存在，若账户不同则注册账户
     */
    public void register() {
        int tip = 0;// tip为1时为确定已有账号登录
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入账号：");
        String A = sc.next();
        System.out.print("请输入密码：");
        String B = sc.next();

        for (String key : Uer.keySet()) {
            if (key.equals(A)) {
                System.out.println("账户已存在");
                tip = 1;
                break;
            }
        }
        if (tip == 0) { // tip=0,还未有账户，先注册账户。
            Uer.put(A, B);
            System.out.println("注册成功！");
            tip = 0;
        } else { // 若是没有注册账户成功，则重新确认是否已有账户
            register();
        }
    }

}