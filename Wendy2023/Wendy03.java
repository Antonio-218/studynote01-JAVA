package Wendy2023;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Wendy03 {
        public static class User{
            int id;
            String password;
            public User(int id, String password) {
                this.id = id;
                this.password = password;
            }
            public int getId() {
                return id;
            }
            public void setId(int id) {
                this.id = id;
            }
            public String getPassword() {
                return password;
            }
            public void setPassword(String password) {
                this.password = password;
            }
            @Override
            public boolean equals(Object obj) {
                User user =  (User) obj;
                return this.id == user.id;
            }
            @Override
            public String toString() {
                // TODO Auto-generated method stub
                return "账号：" + this.id + "密码：" + this.password;
            }
        }
        static Scanner scanner = new Scanner(System.in);
        static ArrayList<User> users = new ArrayList<User>();


        public static void login(){
            System.out.println("请输入账号");
            int id = scanner.nextInt();
            System.out.println("请输入密码");
            String password = scanner.next();
            boolean isLogin = false;
            Iterator it = users.iterator();
            while(it.hasNext()){
                User user = (User) it.next();
                if(user.id == id && user.password.equals(password)){
                    isLogin = true;
                    System.out.println("登录成功！");
                }else{
                    System.out.println("登录失败！");
                }
            }
        }

        public static void reg(){
            User user = null;
            while(true){
                System.out.println("请输入账号");
                int id = scanner.nextInt();
                user = new User(id,null);
                if(users.contains(user)){
                    System.out.println("已存在该账号！");
                }else{
                    break;
                }
            }
            System.out.println("请输入密码");
            String password = scanner.next();
            user.setPassword(password);
            users.add(user);
            System.out.println("注册成功!");
            System.out.println("当前注册的人员" + users);
        }

        public static void main(String[] args) {
            while(true){
                System.out.println("请选择功能 A（注册） B（登录）");
                String option = scanner.next();
                if("a".equalsIgnoreCase(option)){
                    reg();
                }else if("b".equalsIgnoreCase(option)){
                    login();
                }else{
                    System.out.println("输入有误，请重新输入");
                }
            }
        }

    }
