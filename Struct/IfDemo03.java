package Struct;

import java.util.Scanner;
/*
if语句至多有一个else语句，else语句在所有的else if语句之后；
 if语句可以有若干个else if语句，他们必须在else语句之气那；
 一旦else if其中一个语句检测成ture,其他的else if以及else语句都将跳过执行*/
public class IfDemo03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入成绩");
        int socre=scanner.nextInt();
        if (socre==100){
            System.out.println("满分");
        }else if (socre>=80&&socre<100){
            System.out.println("优秀");
        }else  if (socre>=60&&socre<80){
            System.out.println("及格");
        } else
            { System.out.println("不及格");
        }
        scanner.close();
    }
}
