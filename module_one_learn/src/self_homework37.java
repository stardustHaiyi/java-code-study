import java.util.Scanner;


public class self_homework37 {
    public static void main(String[] args){
        // 练习  求平方根
        /*
        * 需求：键盘录入一个大于等于2的整数x，计算并返回x的平方根
        * 结果只保留整数部分，小数部分将被舍去。*/

        // 在代码中
        // 从1开始循环，拿着数字的平方跟原来的数字进行比较
        // 如果小于的，那么继续往后判断
        // 如果相等，那么当前的数字就是平方根
        // 如果大于的，那么前一个数字就是平方根的整数部分

        // 10的平方根
        // 1 * 1 = 2
        // 2 * 2 = 3
        // 3 * 3 = 9
        // 4 * 4 = 16
        // 推断：10的平方根是在3~4之间

        // 1.键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();

        // 2.从1开始循环判断
        // 开始：1结束 number
        for (int i = 1;i <= number;i++){
            // 用i * i再跟number进行比较
            if (i * i == number){
                System.out.println(i + "就是" + number + "的平方根");
                // 一旦找到了，循环就可以停止了，后面的数字就不需要再找了，提高代码的运行效率
                break;
            }else if(i * i >number){
                System.out.println((i - 1) + "就是" + number + "平方根的整数部分");
                break;
            }
        }

    }
}
