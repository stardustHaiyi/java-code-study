package test9;

import java.util.ArrayList;

public class self_h2 {
    public static void main(String[] args){
        // 练习
        /*需求：
         * 1. main方法中定义一个集合，存入三个用户对象。
         * 用户属性为：id，username，password
         * 2. 要求：定义一个方法，根据id查找对应的用户信息。
         * 如果存在，返回索引
         * 如果不存在，返回-1*/

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

        //4.查找索引
        int index = getIndex(list,"heima002");

        // 5.打印结果
        System.out.println(index);

    }

    public static int getIndex(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)){
                return i;
            }

        }
        return -1;
    }
}
