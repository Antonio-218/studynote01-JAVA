package JAVA.Struct;

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个内容");
        String S = scanner.nextLine();
        //equals:判断字符串是否相等
        if (S.equals("HELLO")) ;
        {
            System.out.println(S);
        }
            System.out.println("END");

            scanner.close();
        }
    }

