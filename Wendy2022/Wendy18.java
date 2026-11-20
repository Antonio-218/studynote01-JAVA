package Wendy2022;
import java.util.Scanner;
public class Wendy18 { //学生系统
    public static void main(String[] args) {
        int[][] student = new int[3][5];
        String[] name=new String[3];
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("欢迎使用学生管理系统");
            System.out.println("1.录入学生成绩");
            System.out.println("2.查看学生成绩");
            System.out.println("3.退出系统");
            System.out.println("请选择您要的操作（1-3）");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("录入学生成绩");
                    for(int a=0; a <student.length;a++){
                        System.out.println("第"+(a+1)+"个学生");
                        System.out.println("姓名：");
                        String name1 = scanner.next();
                        name[a]=name1 ;
                        for (int i=0;i<student[a].length;i++){
                            Scanner scanner1=new Scanner(System.in);
                            System.out.println("请输入第"+(i+1)+"门成绩；");
                            int b =scanner1.nextInt();
                            student[a][i]=b;
                        }
                    }
                    break;
                case 2:
                    System.out.println("查看学生成绩:");
                    for (int a = 0; a < student.length; a++) {
                        System.out.print(name[a]+"\t");
                        for (int i= 0; i < student[a].length; i++) {
                            System.out.print(student[a][i]+"\t");
                        }
                        System.out.println();
                    }

                    break;
                case 3:
                    System.out.println("退出系统");
                    return;
            }
        }
    }
}
