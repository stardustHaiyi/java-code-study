package test11;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentSystem {
    public static void startStudentSystem(){
        // 把main(String[] args)  改为 startStudentSystem()
        ArrayList<Student> list = new ArrayList<>();
       loop: while (true) {
            System.out.println("--------------------欢迎来到黑马学生管理系统------------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            // 这里用next（） 而不用nextInt（） 是因为next（）容错率高一些
            switch(choose){
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                    //System.exit(0);  // 停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }
        }


    }


    // 添加学生
    public static void addStudent(ArrayList<Student> list){
        // 利用空参构造先创建学生对象
        Student s = new Student();

        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            System.out.println("请输入学生的id");
            id = sc.next();
            boolean flag = contains(list,id);
            if (flag){
                // 表示id已经存在，需要重新录入
                System.out.println("id已经存在，请重新录入");
            }else{
                // 表示id不存在，表示可以使用
                s.setId(id);
                break;     // 跳出循环
            }
        }

        System.out.println("请输入学生的姓名");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生的家庭住址");
        String address = sc.next();
        s.setAddress(address);

        // 把学生对象添加到集合当中
        list.add(s);

        // 提示一下用户
        System.out.println("学生信息添加成功");


    }

    // 删除学生
    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的id");
        String id = sc.next();
        // 查询id在集合中的索引
        int index = getIndex(list,id);
        // 对index进行判断
        // 如果是大于等于0的，表示存在，直接删除
        // 如果是-1，就表示不存在，结束方法，回到初始菜单
        if (index >= 0){
            // 如果是大于等于0的，表示存在，直接删除
            list.remove(index);
            System.out.println("id为：" + id + "的学生删除成功");
        }else{
            System.out.println("id不存在，删除失败");
        }
    }

    // 修改学生
    public static void updateStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的id");
        String id = sc.next();
        int index = getIndex(list,id);
        if (index == -1){
            System.out.println("要修改的id" + id + "不存在，请重新输入");
            return;
        }else {

        }

        // 当代码执行到这里，表示什么？表示当前的id是存在的。
        // 获取要修改的学生对象
        Student stu = list.get(index);

        // 输入其他的信息并修改
        System.out.println("请输入要修改的学生的姓名");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入要修改的学生的年龄");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入要修改的学生的家庭住址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("学生信息修改成功");
    }


    // 查询学生
    public static void queryStudent(ArrayList<Student> list){
        if (list.size() == 0){  // 集合长度为0，表示里面没有数据
            System.out.println("当前无学生信息，请添加后再查询");
            // 结束方法
            return;
        }

        // 打印表头信息
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        // 当代码执行到这里，表示集合中是有数据的
        for (int i = 0; i < list.size(); i++) {
            // i 表示索引  list.get(i) 表示元素/学生对象
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" +stu.getAddress());

        }
    }

    // 判断id在集合中是否存在
    public static boolean contains(ArrayList<Student> list,String id){
        // 循环遍历集合得到里面的每一个学生对象
        // 拿到学生对象后，获得id并进行判断
        // 存在 true   不存在 false
        for (int i = 0; i < list.size(); i++) {
            // i 表示索引   list.get(i) 表示元素/学生对象
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)){
                return true;
            }
        }
        // 当循环结束之后如果没有找到一样的，那么就是不存在相同的id
        return false;

    }

    // 通过id获取索引的方法
    public static int getIndex(ArrayList<Student> list,String id){
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            // 得到每一个学生对象
            Student stu = list.get(i);
            // 得到每一个学生对象的id
            String sid = stu.getId();
            // 拿着集合中的学生id跟要查询的id进行比较
            if (sid.equals(id)){
                // 如果一样，那么就返回索引
                return i;
            }
        }
        // 当循环结束之后还没有找到，就表示不存在，返回-1
        return -1;
    }
}

/*next() 不管什么都能接收，而 nextInt() 只能接收int类型的数据，如果用户传入“abc”，那么nextInt()
将会报错，而next()则没事。*/

/*
* switch后面括号内的数据类型要和case后面的数据类型一样，否则会匹配不上*/

/*我们写代码时要养成一个习惯，就是写一部分测一部分*/

// 用 ctrl + alt + t 快捷加将选中的部分用while循环包裹住

// break 既可以跳出while 又可以跳出 switch。
// 当循环嵌套了，或while中嵌套switch的话（像本项目这样），那么break只能跳出单层的

/*注意：while前面的  loop： 是标号，相当于给这个while循环起了一个名字。这时 break loop;
* 将会结束整个while循环 */

// system.exit(0)  表示停止虚拟机运行（相当于点击idea页面右上角的 x号）
