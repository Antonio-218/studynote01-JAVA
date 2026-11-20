package Method;

public class MethodDemo03 {
    public static void main(String[] args) {//命令行传参
        //arg.length 数组长度
        for (int i = 0; i < args.length; i++) {
            System.out.println("args["+i+"]:"+args[i]);

        }
    }
}