import java.util.Scanner;


public class self_homework94 {
    public static void main(String[] args){
        // 练习 遍历字符串
        // 需求：键盘录入一个字符串,使用程序实现在控制台遍历该字符串


        /*
        * public char charAt(int index):根据索引返回字符
        * public int length():返回此字符串的长度
        * 数组的长度：数组名.length
        * 字符串的长度：字符串对象.length()     “钢门123吹小雪”  长度 8
        * 后面的length是一个方法，所以要加上括号*/


        // 1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        // 2.进行遍历
        for (int i = 0; i < str.length(); i++){
            // i 依次表示字符串的每一个索引
            char c = str.charAt(i);
            System.out.println(c);
        }


    }
}
