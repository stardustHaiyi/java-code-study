package test8;
import java.util.ArrayList;



public class alself_h1 {
    public static void main(String[] args){
        // 练习  《添加学生对象并遍历》
        /*
         * 需求：
         * 定义一个集合，添加一些学生对象，并进行遍历
         * 学生类的属性为：姓名，年龄*/

        // 1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        // 2.创建学生对象
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);

        // 3.添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);

        // 4.遍历集合
        for (int i = 0; i < list.size(); i++) {
            // i 索引     list.get(i) 元素/学生对象
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
            // 注意：因为这个Student类是我们自己写的，java是没有对它做处理的，
            // 所以直接打印的话会得到一堆地址值,
            // 但是我们要地址值没用处，我们要的是数据，所以要借助地址值找到数据,
            // 所以用get方法

        }
    }
}
