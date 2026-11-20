package ArrayList;

import java.util.ArrayList;

/*Arraylist的构造方法；
       public ArrayList(); ----创建一个新的集合对象

       Arraylist的添加方法；
       public boolean add(E e),将指定的元素追加到此集合的末尾
       public void add(int index,E element),在此集合内的指定位置插入指定的元素。
       * */
public class Arraylist01 {
    public static void main(String[] args) {

         // public ArrayList(); ----创建一个新的集合对象
      //  ArrayList<String>array =new ArrayList<>();
        ArrayList<String>array =new ArrayList<String>();


        //public boolean add(E e),将指定的元素追加到此集合的末尾
       // System.out.println(array.add("hello"));---这个有些复杂
         array.add("hello");
         array.add("world");
         array.add("java");


       // public void add(int index,E element),在此集合内的指定位置插入指定的元素。
        array.add(1,"javase");
        array.add(3,"javaee");

        //输出集合
        System.out.println("array"+array);
    }
}
