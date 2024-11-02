public class self_homework92 {
    public static void main(String[] args){
        // java的常用方法（比较）
        // ==号比的到底是什么？
        /*
        * 1.基本数据类型  比较的是数据值
        *
        * 2.引用数据类型  比较的是地址值*/

        // 字符串比较
        /*
        * 1.boolean equals(要比较的字符串)  完全一样结果才是true，否则为false
        * 2.boolean equalsIgnoreCase(要比较的字符串)  忽略大小写的比较*/

        // 1.创建两个字符串对象
        String s1 = new String("abc");
        String s2 = "Abc";

        // 2.==号比较
        // 基本数据类型  比较的是数据值
        // 引用数据类型  比较的是地址值
        System.out.println(s1 == s2);  // false


        // 3.比较字符串对象中的内容是否相等
        boolean result1 = s1.equals(s2);
        System.out.println(result1);   // false

        // 4.比较字符串对象中的内容是否相等,忽略大小写
        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println(result2);  // true
    }
}

// 注意： 键盘录入一个abc 和 直接赋值一个abc 比较的结果是false
// 键盘录入的那个字符串是 new 出来的
