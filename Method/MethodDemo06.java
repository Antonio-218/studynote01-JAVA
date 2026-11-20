package Method;

public class MethodDemo06 {
    public static void main(String[] args) {
        System.out.println(f(4));
    }//递归
    //2！ 2*1
    //3！3*2*1
    //2 2*f（1）
    //3 3*f(2)
    public static int f(int n){
        if(n==1) {
            return 1;
        }else {
            return n*f(n-1);
        }

    }
}
