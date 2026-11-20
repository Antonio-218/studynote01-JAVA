package Array;

public class ArrayDemo01 {

        //变量的类型 变量的名字  =变量的值;
        //数组类型
        public static void main(String[] args) {
            int [] nums;//1.声明一个数组
            //1.数组类型[] 数组标识符;  2.数组类型 数组标识[] ;

          nums = new int [10];//2.创建一个数组 （这里面可以存放10个int类型的数字
             int [] nums2 =new int [10];//声明和创建一起
            //int boy[]={2,3,4,5}等同于int boys[]=new int [5]

            //3.给数组元素中赋值
            nums[0]=1;
            nums[1]=2;
            nums[2]=3;
            nums[3]=4;
            nums[4]=5;
            nums[5]=6;
            nums[6]=7;
            nums[7]=8;
            nums[8]=9;
            nums[9]=10;
            // System.out.println(nums[9]);
            //计算数组所有元素的和
            int sum=0;
            for (int i = 0; i < nums.length; i++) {
                sum=sum+nums[i];

            }
            System.out.println("总和为"+sum);
        }
}
