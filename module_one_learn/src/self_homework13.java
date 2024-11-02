import java.util.Scanner;

public class self_homework13 {
    public static void main(String[] args){
        // 运算符
        // +
        System.out.println(3 + 2);

        // -
        System.out.println(3 - 2);

        // *
        System.out.println(3 * 2);
        System.out.println("--------------------------");

        // 如果在计算时2有小数参与，结果有可能不精确(只是有可能，不是百分之百)
        System.out.println(1.1 + 1.1); // 2.2
        System.out.println(1.1 + 1.01); // 2.1100000000000003
        System.out.println(1.1 - 1.01); // 0.09000000000000008
        System.out.println(1.1 * 1.01); // 1.1110000000000002

        System.out.println("--------------------------");
        System.out.println(10 / 2); // 5
        System.out.println(10 / 3); // 3
        System.out.println(10.0 / 3); // 3.3333333333333335

        System.out.println("--------------------------");
        // 取模和取余实际上也是做除法运算，只不过得到的是余数而已
        System.out.println(10 % 3);
        System.out.println(10 % 2);


        // 练习：数值拆分
        // 键盘录入一个三位数，将其拆分为个位，十位，百位后打印在控制台。
        System.out.println("请输入一个三位数");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int gewei = i % 10;
        int shiwei = i / 10 % 10;
        int baiwei = i / 100;
        //int baiwei = i / 100 % 10;
        System.out.println("个位是："+gewei);
        System.out.println("十位是："+shiwei);
        System.out.println("百位是："+baiwei);

        // 公式总结
        /*
        * 个位：数值 % 10
        * 十位：数值 / 10 % 10
        * 百位：数值 / 100 % 10
        * 千位：数值 / 1000 % 10
        * 。
        * 。
        * 。*/





    }
}
