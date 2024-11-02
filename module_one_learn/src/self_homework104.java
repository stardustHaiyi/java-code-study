import java.util.Scanner;


public class self_homework104 {
    public static void main(String[] args){
        // 链式编程
        // 当我们在调用一个方法的时候，不需要用变量接收它的结果，可以继续调用其他方法


        // 调用方法
        int len = getString().substring(1).replace("A","Q").length();
        System.out.println(len);




        System.out.println("===============================");
        // StringBuilder
        // 1.创建对象
        StringBuilder sb = new StringBuilder();

        // 2.添加字符串
        sb.append("aaa").append("bbb").append("ccc").append("ddd");
        System.out.println(sb);
    }

    // 定义一个方法
    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        return str;
    }
}
