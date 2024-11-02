public class self_homework97 {
    public static void main(String[] args){
        // 练习  字符串反转
        /*
        * 定义一个方法，实现字符串的反转。
        * 键盘录入一个字符串，调用该方法后，在控制台输出结果
        * 例如：键盘录入abc，输出结果cba*/
       String result = reverser("abc");
       System.out.println(result);
    }

    // 定义一个方法
    // 我要干什么？  字符串的反转
    // 我干这件事需要什么？  字符串
    // 需要返回值吗？   需要

    public static String reverser(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            // i 依次表示字符串中的每一个索引（倒着的）
            char c = str.charAt(i);   // 倒着遍历
            result = result + c;
        }
        return result;
    }
}
