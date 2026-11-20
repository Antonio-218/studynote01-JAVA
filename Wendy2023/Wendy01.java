package Wendy2023;

import java.util.Scanner;

public class Wendy01 {

    public static void main(String[] args) {

        String[][] UserData = new String[3][5];
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要执行的操作");
            System.out.println("1.登录操作");
            System.out.println("2.注册操作");
            System.out.println("3.输出所有集合对象");
            System.out.println("4.退出系统");
            System.out.println("请选择您要的操作（1-4）");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("登录操作:");

                    System.out.println("请输入用户名：");
                    String name = scanner.nextLine();
                    System.out.println("请输入密码：");

                    String password = scanner.nextLine();
                    for (int i = 0; i < UserData.length; i++) {
                        if (UserData[i][0] != null && name.equals(UserData[i][0]) && password.equals(UserData[i][1])) {
                            System.out.println("登陆成功！");
                        break;}
                        else {
                            System.out.println("账号或密码有误，登陆失败！");
                            break;
                        }
                    }
                        case 2:
                            System.out.println("注册操作:");
                            System.out.println("请输入用户名：");
                            String inputname=scanner.next();
                            System.out.println("请输入密码：");
                            String inputpassword=scanner.next();
                            for(int i=0;i<UserData.length;i++) {//利用循环来往空的二维数组中存入数据
                                if(UserData[i][0]==null) {
                                    UserData[i][0]=inputname;
                                    UserData[i][1]=inputpassword;
                                    break;
                                }
                            }break;
                        case 3:
                            System.out.println("输出所有集合对象");
                            System.out.println("用户名\t"+"密码");
                            for(int i=0;i<UserData.length;i++) {
                                System.out.println(UserData[i][0]+"\t"+UserData[i][1]);
                                System.out.println();
                            }
                            break;
                        case 4:
                            System.out.println("退出系统");
                            return;




}
        }
    }
}


