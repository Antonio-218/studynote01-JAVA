package Wendy2023;

import Wendy2023.Student;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class StudentSystem {
    /* 1.用输出语句完成主界面的编写；
       2.用Scanner实现键盘录入的数据；
       3.用switch语句完成操作的选项；
       4.用循环完成再次回到主界面；
    * */
    public static void main(String[] args) {
        ArrayList<Student>array=new ArrayList<Student>();
        while (true) {
            System.out.println("欢迎登录学生成绩管理系统");
            System.out.println("请输入要执行的操作：");
            System.out.println("1.查询所有学生");
            System.out.println("2.添加学生");
            System.out.println("3.修改学生");
            System.out.println("4.删除学生");
            System.out.println("5.返回上一级");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine();
            switch (number) {
                case "1":
                   // System.out.println("查询所有学生：");
                    findAllStudent(array);
                    break;
                case "2":
                   // System.out.println("添加学生：");
                    addStudent(array);
                    break;
                case "3":
                   // System.out.println("修改学生：");
                    updateStudent(array);
                    break;
                case "4":
                    System.out.println("删除学生：");
                    break;
                case "5":
                    System.out.println("返回上一级");
                    return;
            }
        }
    }
    public static void addStudent(ArrayList<Student> array){
        Scanner sc  =new Scanner(System.in);
        System.out.println("请输入学生学号");
        int id =sc.nextInt();
        System.out.println("请输入学生姓名：");
        String name=sc.nextLine();

        Student s =new Student();
        s.setId(id);
        s.setName(name);
        array.add(s);
        System.out.println("添加学生成绩成功");
    }
   /* public static void findAllStudent(ArrayList<Student>array){
        System.out.println("成绩编号\t\t\t学生姓名");
        for (int i = 0; i < array.size(); i++) {
            Student s= array.get(i);
            System.out.println(s.getId()+"\t"+s.getName());
        }*/
        public static void findAllStudent(ArrayList<Student> array){
            if (array.size()==0){
                System.out.println("无信息，请先添加信息再查询");
                return;
            }
                System.out.println("成绩编号\t\t\t学生姓名");
                for (int i = 0; i < array.size(); i++) {
                    Student s = array.get(i);
                    System.out.println(s.getId() + "\t" + s.getName());

                }
            }
            public static void updateStudent(ArrayList<Student> array){
            Scanner sc=new Scanner(System.in);
                System.out.println("请输入你要修改的学生的学号：");
                int id=sc.nextInt();
                System.out.println("请录入学生新姓名：");
                String name =sc.nextLine();
                Student s=new Student();
                s.setId(id);
                s.setName(name);
                for (int i = 0; i < array.size(); i++) {
                 Student  student =  array.get(i);
                    if (!Objects.equals(student.getId(), id)) {
                        array.set(i,s);
                        break;
                    }

                }
                System.out.println("修改学生成功！");
            }
    }



