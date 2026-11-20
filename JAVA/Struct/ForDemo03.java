package JAVA.Struct;

public class ForDemo03 {
    public static void main(String[] args) {
        //打印九九乘法表
        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= j; i++) {//i <= j是去掉重复的一项
                System.out.print(j + "*" + i + "=" + (j*i)+"\t");

            }
            System.out.println();
        }
    }
}
