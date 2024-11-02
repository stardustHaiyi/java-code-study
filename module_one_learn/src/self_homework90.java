import java.util.Scanner;


public class self_homework90 {
    public static void main(String[] args){
        // API (application programming interface)：应用程序接口
        // 简单理解：API就是别人已经写好的东西，我们不需要自己编写，直接用即可
        // Java API:指的就是JDK中提供的各种功能的java类
        // 这些类将底层的实现封装了起来，我们不需要关心这些类是如何实现的，只需要学习这些类是如何使用即可
        // 如之前的Scanner 和 Random 就是API


        // 键盘接收一个小数
        // 创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小数");
        // 接收一个小数
        double result = sc.nextDouble();
        // 输出打印
        System.out.println(result);
    }
}
