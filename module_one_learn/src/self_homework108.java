import java.util.StringJoiner;  // 导包


public class self_homework108 {
    public static void main(String[] args){
        // 1.创建对象
        StringJoiner sj = new StringJoiner(", ","[","]");

        // 2.添加元素
        sj.add("aaa").add("bbb").add("ccc");

        int len = sj.length();
        System.out.println(len);

        // 3.打印
        System.out.println(sj);  //[aaa, bbb, ccc]

        String str = sj.toString();  // 将容器转变为String
        System.out.println(str);
    }
}

// 总结
/*
* 1.String
*   表示字符串的类，定义了很多操作字符串的方法
* 2.StringBuilder
*   一个可变的操作字符串的容器
*   可以高效的拼接字符串，还可以将容器里面的内容反转
* 3.StringJoiner
*   JDK8出现的一个可变的操作字符串的容器，可以高效，方便的拼接字符串（可以指定间隔符号，开始和结尾符号）*/
