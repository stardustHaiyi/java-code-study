import java.util.Scanner;

public class self_homework17_1 {
    public static void main(String[] args){
        // 短路逻辑运算符
        // && 短路与 结果和 & 相同，但有短路的效果
        // || 短路或 结果与 | 相同，但有短路的效果

        System.out.println(true && true); // true
        System.out.println(false && false); // false
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println("------------------------");

        System.out.println(true || true); // true
        System.out.println(false || false); // false
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println("------------------------");

        // 短路逻辑运算符具有短路的效果
        // 简单理解：当左边的表达式能确定最终的结果，那么右边就不会参与运行
        // 例子：
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b <5;
        System.out.println(result);
        System.out.println(a); // 11
        System.out.println(b); // 10  由此可见 ++b 根本就没有执行
        System.out.println("-----对比-----");

        // 对比普通逻辑运算符
        int a1 = 10;
        int b1 = 10;
        boolean result1 = ++a1 < 5 & ++b1 <5;
        System.out.println(result1);
        System.out.println(a1); // 11
        System.out.println(b1); // 11 由此可见普通的逻辑运算符，左右两边都会进行执行
        // 为了提高效率。我们在开发中会经常使用 短路运算符
        // 以后最常用的逻辑运算符有三个 && ，|| ，！
        System.out.println("-----------------------");


        // 练习
        /*数字6  《斯坦福练习题》
        * 数字6是一个真正伟大的数字，键盘录入两个整数
        * 如果其中一个为6，最终结果输出true
        * 如果他们的和为6的倍数，最终结果输出true
        * 其他情况都为false*/

        System.out.println("请输入第一个整数");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = sc.nextInt();
        boolean result2 =number1 == 6 || number2 == 6 || (number1+number2) % 6 == 0;
        System.out.println(result2);



    }
}
