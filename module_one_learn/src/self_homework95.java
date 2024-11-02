import java.util.Scanner;


public class self_homework95 {
    public static void main(String[] args){
        // 练习  统计字符次数
        // 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数
        // (不考虑其他字符)


        // 1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();


        // 2.统计---计数器思想
        // 定义三个计数器
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            // i 依次表示字符串中的每一个索引
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z'){
                // char类型的变量在参与计算时自动类型提升为int 查询ASCII码表
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;   // 0~9在ASCII码表里面也有对应的东西存在
            }
        }
        // 输出打印
        System.out.println("小写字母有：" + smallCount + "个");
        System.out.println("大写字母有：" + bigCount + "个");
        System.out.println("数字字母有：" + numberCount + "个");
    }
}
