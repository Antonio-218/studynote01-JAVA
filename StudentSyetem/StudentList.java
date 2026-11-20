package StudentSyetem;

import java.util.ArrayList;
import java.util.Scanner;
public class StudentList {
    static Scanner sc = new Scanner(System.in);
    int total;
    /**
     * Option()方法是显示《学生信息管理》以及为用户提供选择并根据用户的输入跳转到对于步骤的方法
     */
    public static void Option() { // static关键字用于方便其他方法调用
        ArrayList<Students> stud = new ArrayList<Students>();// 创建集合，并未集合添加元素，如下：
        for (int i = 1; i < stud.size(); i++) {
        }
        stud.add(new Students("202031167", "张三","2班", "65", "55","75"));
        stud.add(new Students("202031164", "李四","2班", "75", "66","89"));
        stud.add(new Students("202031178", "王五","4班", "72", "77","86"));
        /**
         * 显示主页面 while循环用于与《学生信息管理》界面进行交互
         */
        boolean isFlag = true; // 定义一个布尔型变量flag并初始化为真(true)。
        // 判断语句中使用布尔值作为判断式，只有在boolean为true时才会执行，值为false则跳过，不执行。
        while (isFlag) {
            System.out.println("---------------------学生信息管理---------------------");
            System.out.println("1    添 加 学 生");
            System.out.println("2    修 改 学 生 ");
            System.out.println("3    删 除 学 生 ");
            System.out.println("4    查 找 学 生 ");
            System.out.println("5    显 示 学 生 列 表");
            System.out.println("6    退    出 ");
            System.out.println("----------------------------------------------------");
            System.out.print(  "       请选择（1-6）：");

            char selection = menuSelection();
            // 调用Tools类下的menuSelection（）方法来从键盘获取值
            switch (selection) {
                case '1':
                    addNewStudent(stud);
                    break;// 终止语句
                case '2':
                    changeStudent(stud);
                    break;
                case '3':
                    removeStudent(stud);
                    break;
                case '4':
                    findStudent(stud);
                    break;
                case '5':
                    listStudent(stud);
                    break;
                case '6':
                    System.out.print("是否确认退出（Y/N）：");
                    char isyn = confirmSelection();
                    // 掉用Tools类下的confirmSelection（）方法，将'Y'或'N'赋值给isyn
                    if (isyn == 'Y') {
                        isFlag = false;// 结束循环
                    }
            }
        }
    }
    public static void addNewStudent(ArrayList<Students> stud) {
        // 将ArrayList<Students> stud放在括号中才能调用stud。
        System.out.println("-----------------添加学生-----------------");
        int q = 0;// q是用来检验的，如果发现了重复元素，则q自加
        System.out.print("请输入学号：");
        String id = sc.nextLine(); // 将输入的学号赋值给id
        if (id.length() == 9) { // 判断学号位数是否为9位，不是九位就退出添加，是就继续添加。
            for (int i = 0; i < stud.size(); i++) { // 对已经存储的学号进行遍历
                Students s = stud.get(i);
                // 与已经添加集合的元素进行对比，如果相同则输出相应内容
                if (s.getId().equals(id)) {
                    // 元素的id变量与刚获取的进行比较，相同则执行花括号里的内容
                    System.out.print("输入的学号有重复，请检查后重新输入！");
                    q++;
                    break;
                }
            }
            if (q == 0) { // 如果学号不相同，则开始录入学生信息
                System.out.print("请输入姓名：");
                String name = sc.nextLine();
                System.out.print("请输入班级：");
                String classroom =sc.nextLine();
                System.out.print("web成绩：");
                String majorWeb = sc.nextLine();
                 System.out.print("java成绩：");
                 String majorJava = sc.nextLine();
                 System.out.print("计算机成绩：");
                 String majorComputer =sc.nextLine();
                 Students s = new Students();
                 // 创建类的实例获取Students的set方法进行赋值存储
                    s.setId(id);
                    s.setName(name);
                    s.setClassroom(classroom);
                    s.setMajorWeb(majorWeb);
                    s.setMajorJava(majorJava);
                    s.setMajorComputer(majorComputer);
                    stud.add(s);

            }
        } else {
            System.out.println("学号输入错误");
            return;
        }
    }
    private static void changeStudent(ArrayList<Students> stud) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------修改学生-----------------");
        System.out.print("请输入要修改的学生学号：");
        String id = sc.next();
        // 遍历集合，用新的学生信息替换掉旧的
        for (int i = 0; i < stud.size(); i++) {
            Students s = stud.get(i);
            if (s.getId().equals(id)) {
                // 键盘录入新的学生信息
                System.out.print("姓名（" + s.getName() + "）：");
                String name = sc.next();
                System.out.print("班级（" + s.getClassroom() + "）：");
                String classroom = sc.next();
                System.out.print("web成绩（" + s.getMajorWeb() + "）：");
                String majorWeb = sc.next();
                System.out.print("java成绩（" + s.getMajorJava() + "）：");
                String majorJava = sc.next();
                System.out.print("计算机成绩（" + s.getMajorComputer() + "）：");
                String majorComputer= sc.next();
                Students s1 = new Students();

                s1.setId(id);
                s1.setName(name);
                s1.setClassroom(classroom);
                s1.setMajorWeb(majorWeb);
                s1.setMajorJava(majorJava);
                s1.setMajorComputer(majorComputer);
                stud.set(i, s1); // set() 方法用于替换动态数组中指定索引的元素。
                System.out.print("是否确认修改（Y/N）：");
                char isyn = confirmSelection();
                // 掉用Tools类下的confirmSelection（）方法，将'Y'或'N'赋值给isyn
                if (isyn == 'Y') {
                    System.out.println("修改成功！");
                    return;
                } else {
                    System.out.println("修改失败");
                    return;
                }
            }
        }
        System.out.println("学号不存在");
    }
    public static boolean removeStudent(ArrayList<Students> stud) {
        System.out.println("-----------------删除学生-----------------");
        System.out.println("请输入你要删除的对象的学号：");
        String getNumber = sc.next();

        for (int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId().equals(getNumber) == true) {
                // 这里是集合的元素的类的成员方法的比较，比较存入的学生学号是否与输入的相同
                System.out.print("是否确认退出（Y/N）：");
                char isyn = confirmSelection();
                // 掉用Tools类下的confirmSelection（）方法，将'Y'或'N'赋值给isyn
                if (isyn == 'Y') {
                    stud.remove(i);
                    System.out.println("删除成功");
                    return true;
                } else {
                    System.out.println("删除失败");
                    return false;
                }
            }
        }
        System.out.println("学号不存在");
        return false;

    }
    public static boolean findStudent(ArrayList<Students> stud) {
        System.out.println("-----------------查找学生-----------------");
        System.out.println("请输入你要查找的对象的学号：");
        String getNumber = sc.next();
        for (int i = 0; i < stud.size(); i++) {
            if (stud.get(i).getId().equals(getNumber)) {
                // 这里是集合的元素的类的成员方法的比较，比较存入的学生学号是否与输入的相同
                System.out.println("查找成功！！！");
                System.out.println("学号\t\t\t学生姓名\t\t班级\t\tweb成绩\tjava成绩\t计算机成绩");
                System.out.println(stud.get(i).getId() + "\t" + stud.get(i).getName() +"\t\t"
                        +stud.get(i).getClassroom()+
                        "\t\t" + stud.get(i).getMajorWeb() + "\t\t" + stud.get(i).getMajorJava()+"\t\t"
                        +stud.get(i).getMajorComputer());
                // 找到了就将里面的信息打印出来
                return true; // 方法返回值是boolean，所以程序就要求什么情况都要返回一个布尔型。
            }
        }
        System.out.println("查找失败！！");
        return false;
    }
    public static void listStudent(ArrayList<Students> stud) {
        System.out.println("-----------------显示学生列表-----------------");
        System.out.println("学号\t\t\t姓名\t\t班级\t\tweb成绩\tJava成绩\t计算机成绩");
        for (int i = 0; i < stud.size(); i++) { // 按顺序打印学生列表
            Students s = stud.get(i);
            System.out.println(s.getId() + "\t" + s.getName() +"\t\t"+ s.getClassroom()+"\t\t" +
                    s.getMajorWeb() +"\t\t"+ s.getMajorJava()+"\t\t"+s.getMajorComputer());

        }
    }
    /**
     * 用于界面菜单的选择。该方法读取键盘，如果用户键入’1’-’6’中的任意字符，
     * 则方法返回。返回值为用户键入字符。
     */
    public static char menuSelection() {
        char c;
        for (;;) {
            String str = keyBoard(1);// keyboard()方法限制输入数字的长度，此处限制为1个字符
            c = str.charAt(0);// 返回字符串中某个字符在给定或指定索引处的 char 值。
            // 因为c是字符型，所以要用单引号,但双引号是String类型
            if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6') {
                System.out.print("选择错误，请重新输入：");
            } else
                break;
        }
        return c;
    }

    /**
     * keyBoard用来限制输入的数字的长度
     *
     * @param limit
     * @return
     */
    private static String keyBoard(int limit) {
        String line = ""; // 因为此方法需要返回值，因此就line定义在循环外面。

        while (sc.hasNextLine()) {
            // 还有下一行的时候就会返回true，
            // 其他情况返回的是false；但是当多次回车之后，循环体还是不会退出。
            line = sc.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.println("输入错误，请退出！");
                continue;
            }
            break;
        }
        return line;
    }

    /**
     * 用于确认选择的输入。该方法从键盘读取‘Y’或’N’，并将其作为方法的返回值。
     */
    public static char confirmSelection() {
        char c;
        for (;;) {
            String str = keyBoard(1).toUpperCase();
            // toUpperCase() 方法将字符串小写字符转换为大写。
            c = str.charAt(0); // 将str转化为字符
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("选择错误，请重新输入：");
            }
        }
        return c;
    }
}
