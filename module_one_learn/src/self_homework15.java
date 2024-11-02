import java.util.Scanner;

public class self_homework15 {
    public static void main(String[] args){
        // 字符串的 “+” 操作
        /*1.当“+”操作中出现字符串时，这个“+“是字符串的连接符，而不是算术运算符了。
        会将前后的数据进行拼接，并产生一个新的字符串。
        例子：”123“+123----->"123123"

        2.连续进行”+“操作时，从左到右逐个执行。
        例子：1+99+”年黑马----->"100年黑马"“*/

        // 练习1：
        System.out.println(3.7 + "abc"); //3.7abc
        System.out.println("abc" + true); //abctrue
        System.out.println('中' + "abc" + true); //中abctrue
        int age = 18;
        System.out.println("我的年龄是" + age + "岁"); //我的年龄是18岁
        System.out.println("我的年龄是" + "age" + "岁"); //我的年龄是age岁
        System.out.println(1 + 2 + "abc" + 2 + 1); //3abc21
        // 连续加的话 从左到右计算
        System.out.println("------------------------------");


        // 练习2：
        // 数值拆分 ，键盘录入一个三位数，将其拆分为个位，十位，百位后，打印在控制台（结果要便于阅读）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();
        int gewei = number % 10;
        int shiwei = number / 10 % 10;
        int baiwei = number /100 % 10;
        System.out.println("这个数的个位是：" + gewei);
        System.out.println("这个数的十位是：" + shiwei);
        System.out.println("这个数的百位是：" + baiwei);
        System.out.println("------------------------------");

        // 当字符+字符或字符+数字时，会把字符通过ASCII码表查询到对应的数字再进行计算
        System.out.println(1 + 'a'); // 98
        System.out.println('a' + "abc"); // aabc



    }
}
