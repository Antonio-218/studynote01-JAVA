package Wendy2022;

import java.util.Scanner;

public class Wendy22 {
    public static void main(String[] args) {
        int[][] student = new int[3][5];
        String[] name = new String[3];
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要执行的操作");
            System.out.println("1.登录操作");
            System.out.println("2.注册操作");
            System.out.println("3.退出系统");
            System.out.println("4.输出所有集合对象");
            System.out.println("请选择您要的操作（1-4）");
            int number = scanner.nextInt();
            switch (number) {
            case 1:
                System.out.println("登录操作:");




                break;
            case 2:
                System.out.println("注册操作:");

                    System.out.println();


                break;
            case 3:
                System.out.println("退出系统");
                break;
            case 4:
                System.out.println("请输出所有集合对象：");
                return;
    }
}
    }
}