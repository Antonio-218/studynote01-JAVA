package Wendy2023;

import java.util.Scanner;

public class Wendy02 {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
           Scanner scanner=new Scanner(System.in);//从键盘jieshouz
            final String ACCOUNT ="admin";
            int password=123456;
            boolean kaiguan=true;//登录开关
            boolean flag = true;//业务状态
            int i=5;

            /********************************登录模块**********************************/
            while (kaiguan) {
                System.out.println("请输入账号：");
                String zhanghao= scanner.next();
                System.out.println("请输入密码");
                int mima = scanner.nextInt();
                System.out.println("账号："+zhanghao+"密码："+mima);

                if(ACCOUNT.equals(zhanghao)&&password==mima){
                    System.out.println("账号和密码信息输入正确");
                    kaiguan=false;
                }else {
                    System.out.println("账号和密码信息输入错误次数:"+i);
                }
                i--;
            }
            /********************************后台管理模块**********************************/
            if(flag == true) {
                kaiguan=true;//开关开启循环
                String name="";//姓名
                int age=0;//年龄
                String sex="";//性别
                long sjh=1836543216;//手机号
                outer:do {
                    System.out.println("|*********************************************************************************************|");
                    System.out.println("|    【1】添加学生         【2】修改学生         【3】删除学生           【4】查询学生    【5】退出系统 |");
                    System.out.println("|*********************************************************************************************|");
                    System.out.println("请输入你操作的指令：");

                    int zhiling = scanner.nextInt();//获取键盘的指令
                    switch(zhiling) {
                        case 1: System.out.println("请输入学生姓名：");
                            name = scanner.next();//获取键盘的指令
                            System.out.println("请输入学生年龄：");
                            age = scanner.nextInt();
                            System.out.println("请输入学生性别:");
                            sex=scanner.next();
                            System.out.println("请输入学生手机号:");
                            sjh=scanner.nextLong();
                            break;
                        case 2: System.out.println("请输入修改学生姓名：");
                            name = scanner.next();//获取键盘的指令
                            System.out.println("");
                            break;

                        case 3: System.out.println("请输入要删除学生的名字：");
                            String name01 = scanner.next();//获取键盘的指令
                            if(name01.equals(name)) {
                                name=" ";
                                age=0;
                                sex=" ";
                                System.out.println("删除学生成功：");
                            }else {
                                System.out.println("该学生不存在：");
                            }
                            break;
                        case 4: System.out.println("学生姓名："+name +"   年龄:"+age+"  性别:"+sex+"  手机号:"+sjh);break;
                        case 5: System.out.println("退出循环"); break outer;//跳出循环
                        default: System.out.println("指令输入错误：");
                    }
                    System.out.println("操作完成");
                }while(kaiguan);

            }else {
                System.out.println("流程结束！！！！！！！");
            }

        }
}
