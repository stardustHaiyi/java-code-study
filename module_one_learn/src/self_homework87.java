import java.util.Scanner;


public class self_homework87 {
    public static void main(String[] args){
        // 练习 《对象数组1》   代码在test5中
        /*
        * 定义数组存储3个商品对象。
        * 商品的属性：商品的id，名字，价格，库存。
        * 创建3个商品对象，并把商品对象存入到数组当中。*/



        // 练习 《对象数组2》
        /*
        * 定义数组存储3部汽车对象。
        * 汽车属性：品牌，价格，颜色。
        * 创建三个汽车对象，数据通过键盘录入而来，并把数据存入到数组当中。*/

        // 键盘录入注意点
        /*第一套体系
        * nextInt()   接收整数
        * nextDouble  接收小数
        * next()      接收字符串
        * 遇到空格，制表符，回车就停止接收。这些符号后面的数据就不会接收了
        *
        * 第二套体系
        * nextLine()  接收字符串
        * 可以接收空格，制表符，遇到回车才停止接收数据*/


        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");  // 我输入123 456
        int num1 = sc.nextInt();  // 接收123
        System.out.println(num1);
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();  // 接收456  会直接接收内存中剩余的456
        System.out.println(num2);
        System.out.println("=======================================");

        System.out.println("请输入第一个字符串");  // 输入abc def
        String str1 = sc.next();    // 接收abc
        System.out.println(str1);
        System.out.println("请输入第二个字符串");
        String str2 = sc.next();    // 接收def
        System.out.println(str2);*/



        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串");  // 输入abc def
        String line1 = sc.nextLine();  // 接收abc def
        System.out.println(line1);
        System.out.println("请输入第二个字符串");  // 输入sfcvbnm hjk
        String line2 = sc.nextLine();   // 接收sfcvbnm hjk
        System.out.println(line2);


        // 键盘录入的两套体系不能混用
        // 弊端：先用nextInt 后用 nextLine 会导致下面的nextLine 接收不到数据
        // 所以，建议还是使用第一套体系；牵扯到类型转换的话，用第二套体系
    }
}
