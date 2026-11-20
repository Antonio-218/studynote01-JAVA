package JAVA.Struct;

public class DoWhileDemo02 {
    public static void main(String[] args) {
        int a=0;
        while(a<0){
            System.out.println(a);
            a++;
        }
        System.out.println("++++++++++++++");
        do {
            System.out.println(a);
            a++;
        }while (a<9);
        System.out.println("========");
        int sum=0;
        int b=0;
        do {
            sum+=b;
            b++;
        }while(b<=100);
        System.out.println("从1到100的值为"+sum);
    }
}
