package JAVA.Struct;

public class BreakDemo {
    public static void main(String[] args) {
        int i=0;
        while(i<50){
            i++;
            System.out.println(i);
            if (i==30){
                break;
            }
        }
        System.out.println("123");
    }
}
