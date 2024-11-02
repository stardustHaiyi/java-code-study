import java.util.Scanner; // 步骤一：导包

public class self_homework11 {
    public static void main(String[] args){
        // 练习：键盘输入数字并求和
        // 键盘录入两个整数，并求出它们的和打印出来

        // 步骤二：创建对象
        Scanner sc = new Scanner(System.in);

        // 步骤三：开始使用（开始录入数据）
        System.out.println("请输入第一个整数");
        int number1 =sc.nextInt(); // 录入第一个数据

        System.out.println("请输入第二个整数");
        int number2 =sc.nextInt(); // 录入第二个数据

        // 注意，如果要多次录用数据，那么步骤一和步骤二不用再写一次，只用把步骤三再写一次即可

        // 求和并输出
        System.out.println(number1+number2);


    }
}
