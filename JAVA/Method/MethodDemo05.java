package JAVA.Method;

public class MethodDemo05 {
    public static void main(String[] args) {
        //调用可变参数的方法
        printMAX(34,3,5,8);
        printMAX(new double[]{2,8,9});
    }
    public static void printMAX(double...numbers){
        if (numbers.length==0){
            System.out.println("No argument passed");
            return;
        }double result=numbers[0];
        //排序
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]>result){
                result=numbers[i];
            }

        }
        System.out.println("The max value is "+result);
    }
}
