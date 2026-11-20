package Struct;

public class ForDemo02 {
    public static void main(String[] args) {
        //练习1；计算0到100之前的奇数的和 和 偶数的和
        int jishu=0;
        int oushu=1;
        for (int i = 0; i < 100; i++) {
            if (i%2==1){        //奇数
             oushu+=i;
            }else{         //偶数
               jishu+=i;
            }

        }
        System.out.println("奇数的和:"+jishu);
        System.out.println("偶数的和:"+oushu);
    }
}
