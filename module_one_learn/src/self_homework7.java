public class self_homework7 {
    public static void main(String[] args){
        //数据类型
        //整数
        /*
        * byte:-128--127 内存占用：1
        * short:-32768--32767 内存占用：2
        * int:-2147483648--2147483647(10位数) 内存占用：4
        * long:-9223372036854775808--9223372036854775807(19位数) 内存占用：8*/

        //浮点数
        /*
        * float:-3.401298e-38--3.402823e+38 内存占用：4
        * double:-4.9000000e-324--1.797693e+308 内存占用：8*/

        //字符
        //char:0--65535 内存占用：2

        //布尔
        //boolean:true,false 内存占用：1

        byte b =10;
        short s = 20;
        int i =30;
        // 如果要定义long类型的变量，要在数据值后面加上L(可以大写也可以小写)
        long n = 9999999999L;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(n);

        float t = 10.1F;
        //在定义float类型的变量的时候，数据值后面要加上F后缀（可以大写也可以小写）
        System.out.println(t);

        double d = 20.2;
        System.out.println(d);

        char c = '中';
        System.out.println(c);

        boolean o = true;
        System.out.println(o);


        //总结
        /*
        * 1.java语言的数据类型分为：基本数据类型，引用数据类型
        *
        * 2.基本数据类型又有四类八种：
        * 整数（byte，short，int，long）
        * 浮点数（float，double）
        * 字符（char）
        * 布尔（boolean）
        *
        * 3.byte的取值范围
        * -128--127
        *
        * 4.整数和小数取值范围大小关系：
        * double>float>long>int>short>byte
        *
        * 5.long类型变量：需要加入L标识（大小都可以）
        * float类型变量：需要加入F标识（大小都可以）*/
    }
}
