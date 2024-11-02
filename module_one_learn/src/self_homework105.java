import java.util.Scanner;


public class self_homework105 {
    public static void main(String[] args){
        // 练习   对称字符串
        /*
        * 需求：
        * 键盘接收一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
        *           对称字符串：123321，111
        *           非对称字符串：123123*/



        // 1.键盘；录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        // 2.反转键盘录入的字符串
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        String str2 = sb.toString();  // 记得要将StringBuilder类型变成String类型
        System.out.println(sb);

        // 用链式编程改进代码
        //String result = new StringBuilder().append(str).reverse().toString();

        // 3.比较
        if (str.equals(str2)){
            System.out.println("当前字符串是对称字符串");
        }else {
            System.out.println("当前字符串不是对称字符串");
        }

    }
}
// StringBuilder的使用场景
// 1.字符串的拼接
// 2.字符串的反转
