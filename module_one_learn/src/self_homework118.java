import java.util.ArrayList; // 导包

public class self_homework118 {
    // self_homework115 -- 117 代码练习没写完
    public static void main(String[] args){
        // 集合： 集合可以自动扩容

        // 数组存储数据的特点：1.可以存储基本数据类型,2.可以存储引用数据类型

        // 结合存储数据的特点：集合可以存储引用数据类型，但是集合不能直接存储基本数据类型，
        // 如果非要存，那么要将它们变成对应的包装类

        /*
        * 集合和数组的对比
        * 1.长度：
        *   数组：数组的长度固定
        *   集合：集合的长度可变（自动伸缩，可长可短）
        *
        * 2.存储的类型：
        *   数组：可以存储基本数据类型，可以存储引用数据类型
        *   集合：可以存储引用数据类型，不能存储基本数据类型，非要存储的话要变成-->包装类
        *   */

        // java 中有很多的集合
        // 1.创建集合对象
        //ArrayList<String> list = new ArrayList<String>();  // 老版本创建方法
        // 尖括号里面写的是泛型(表示只能存储这一种类型的数据)


        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        // 此时我们创建的是ArrayList的对象，而ArrayList是java已经写好的一个类
        // 这个类在底层做了一些处理
        // 打印对象不是地址值，而是集合中存储数据内容
        // 在展示的时候会拿[]把所有的数据进行包裹

        // ArrayList成员方法
        // 增删改查（以后学习容器类的东西时注意这个）

        /*
        * 方法名                         说明
        * boolean add(E e)               添加元素，返回值表示是否添加成功
        * boolean remove(E e)            删除指定元素，返回值表示是否删除成功
        * E remove(int index)            删除指定索引元素，返回被删除的元素
        * E set(int index,E e)           修改指定索引下的元素，返回原来的元素
        * E get(int index)               获取指定索引的元素
        * int size()                     集合的长度，也就是集合中元素的个数
        *  */

        System.out.println("集合");



    }
}
