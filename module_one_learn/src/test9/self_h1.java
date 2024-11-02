package test9;

import java.util.ArrayList;
import java.util.Scanner;

public class self_h1 {
    public static void main(String[] args){
        // 练习 《添加用户对象并判断是否存在》 解法

        // 1.创建集合
        ArrayList<User> list = new ArrayList<>();

        // 2.创建三个用户对象
       User u1 = new User("heima001","zhangsan","123456");
       User u2 = new User("heima002","lisi","12345678");
       User u3 = new User("heima003","wangwu","1234qwer");

       // 3.把用户对象添加到集合
        list.add(u1);
        list.add(u2);
        list.add(u3);

        // 4.调用方法查看id是否存在
        boolean flag = contains(list,"heima001");

        // 5.打印结果
        System.out.println(flag);

        }

        // 定义方法
        // 1.我要干嘛？  根据id查找用户
        // 2.我干这件事需要什么才能完成？  id list
        // 3.调用处是否需要使用方法的结果？ 返回

    public static boolean contains(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            //list.get(i).getId().equals(id);
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)){
                // 如果找到了，直接返回true
                return true;
            }
        }
        // 当循环结束表示集合里面所有元素都已经比较完毕，还没有一样的，那么返回false就可以了
        return false;
    }





}
