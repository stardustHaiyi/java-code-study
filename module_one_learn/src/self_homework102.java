public class self_homework102 {
    public static void main(String[] args){
        // StringBuilder 概述
        // StringBuilder可以看成是一个容器，创建之后里面的内容是可变的  重点：内容可变
        /*
        * 作用：提高字符串的操作效率
        *
        * StringBuilder构造方法
        * 方法名                                         说明
        * public StringBuilder()                  创建一个空白可变字符串对象,不含任何内容
        * public StringBuilder(String str)        根据字符串的内容，来创建可变字符串对象
        * 例子：
        *       StringBuilder sb = new StringBuilder("abc");
        *
        * StringBuilder()常用方法
        * 方法名                                    说明
        * public StringBuilder append(任意类型)      添加数据，并返回对象本身
        * public StringBuilder reverse()            反转容器中的内容
        * public int length()                       返回长度（字符出现的个数）
        * public String toString()                  通过toString()就可以实现把StringBuilder转换成String*/


        // 1.创建对象
        StringBuilder sb = new StringBuilder("abc");

        // 2.添加元素
        /*sb.append(1);
        sb.append(2.3);
        sb.append(true);*/

        // 容器的反转
        sb.reverse();  // 原来是abc，反转之后就是cba。它是在容器内部直接反转的
        // 不像String，String本身是不会发生变化的

        // 获取长度
        int len = sb.length();
        System.out.println(len);

        // 打印
        /*
        * 科普：打印StringBuilder出现的不是地址值，这是因为StringBuilder是java已经写好的类
        * java在底层对它做了一些特殊处理，打印对象不是地址值而是属性值。*/
        System.out.println(sb);
    }
}
