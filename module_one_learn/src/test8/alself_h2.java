package test8;

import java.util.ArrayList;
import java.util.Scanner;

public class alself_h2 {
    public static void main(String[] args){
        // 练习2 《添加学生对象并遍历》
        /*需求：
         * 定义一个集合，添加一些学生对象，并进行遍历
         * 学生类的属性为：姓名，年龄。
         * 要求：对象的数据来自键盘录入*/

        // 1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        // 2. 键盘录入学生的信息并添加到集合当中
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            Student s = new Student();

            System.out.println("请输入学生的姓名");
            String name = sc.next();
            System.out.println("请输入学生的年龄");
            int age = sc.nextInt();

            // 把name和age赋值给学生对象
            s.setName(name);
            s.setAge(age);

            // 把学生对象添加到集合当中
            list.add(s);
        }

        // 集合里面是否有学生对象？
        // 有？ 没有？
        //System.out.println(list.size());  //3

        // 3.遍历
        for (int i = 0; i < list.size(); i++){
            // i 是索引 ,list.get(i) 元素/学生对象
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge());
        }


        // 注意
        // 如果把 Student s = new Student(); 放到循环外面，那么最先输入的会被覆盖，
        // 因为之创建了一次学生对象
        // 所以：创建学生对象你不能写在循环的外面（要写在里面）



    }
}
