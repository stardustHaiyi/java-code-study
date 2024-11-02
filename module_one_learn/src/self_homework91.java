public class self_homework91 {
    public static void main(String[] args){
        // String概述：
        // Java.lang.String类代表字符串，java程序中的所有字符串文字（例如：“abc”）都为此类的对象
        // String是java定义好的一个类。定义在java.lang包中，所以使用的时候不需要导包

        // String的注意点
        // 字符串的内容是不会发生改变的，它的对象在创建后不能被更改
        // 字符串拼接产生一个新的字符串

        // 创建String对象的两种方式
        /*
        * 1.直接赋值：String name = "尼古拉斯-阿伟";
        *
        * 2.new
        * 构造方法                              说明
        * public String()                       创建空白字符串，不含任何内容
        * public String(String original)        根据传入的字符串，创建字符串对象
        * public String(char[] chs)             根据字符数组，创建字符串对象
        * public String(byte[] chs)             根据字节数组，创建字符串对象*/


        // 1.使用直接赋值的方式来获取一个字符串对象  能复用，代码简单，节约内存
        String s1 = "abc";
        System.out.println(s1);


        // 2.使用new的方式来获取一个字符串对象   不会复用
        // 空参构造：可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!");  // s2 什么都没有


        // 传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象（脱裤子放屁）
        String s3 = new String("abc");
        System.out.println(s3);


        // 传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象  《掌握》
        // 需求：我要修改字符串的内容。 abc --> qbc
        // abc -- > {'a','b','c'} -- >{'q','b','c'} -- > "qbc"  数组可以改变
        char[] chs = {'a','b','c','d'};
        String s4 = new String(chs);
        System.out.println(s4);  // 会拿着数字去ASCII码表里面查


        // 传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象  《掌握》
        byte[] bytes = {97,98,99,100};
        String s5 = new String(bytes);
        System.out.println(s5);
        // 应用场景，在网络中传递的信息都是字节信息（就是数字，如上面的）,我们一般要把字节信息
        // 进行转换，转成字符串，此时就要用到这个构造了

    }
}

// 栈 跟方法有关，调用方法要进栈
// 堆 跟对象有关，只要是new出来的，都在这里
// 方法区 class字节码文件（临时存储）
// StringTable(串池) 字符串常量池，只有直接赋值创建出来的字符串对象才在这里
/*
* 当使用双引号直接赋值的时候，系统会检查该字符串在串池中是否存在。
* 不存在：创建新的
* 存在：复用*/
