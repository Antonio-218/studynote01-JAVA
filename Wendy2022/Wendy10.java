package Wendy2022;

import javax.swing.*;

public class Wendy10 {
    public static void main(String[] args) {
        int[]arr=new int[9];
        int[]wen=new int[]{2,4,6,7,9,8,1,5,3,};

        for (int i =0;i< wen.length;i++) {
            System.out.print(wen[i]);
          arr[i]=wen[i];


        }

    for (int i =arr.length-1;i>=0;i--){
    System.out.print(wen[i]+"\t");
}

    }
}
