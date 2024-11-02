import java.util.ArrayList;


public class self_homework121 {
    public static void main(String[] args){
        // 练习 《添加数字并遍历》
        /*
        * 需求：定义一个集合，添加数字，并进行遍历。
        * 遍历格式参照：[元素1，元素2，元素3]。注意：数字是基本数据类型*/

        // 基本数据类型对应的包装类
        /*
        * byte      Byte
        * short     Short
        * char      Character
        * int       Integer
        * long      Long
        * float     Float
        * double    Double
        * boolean   Boolean*/


        // 1.创建集合
        ArrayList<Integer> list = new ArrayList<>(); // 包装类
        //ArrayList<Character> list = new ArrayList<>();  // 字符的包装类

        // 2.添加元素
        // jdk5以后 int 和 Integer 之间是可以互相转化的
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
/*        list.add('a');
        list.add('b');
        list.add('c');*/

        // 3.遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i) + ",");
            }
        }
        // 全部打印出来之后在后面补上“]”
        System.out.println("]");

    }
}
