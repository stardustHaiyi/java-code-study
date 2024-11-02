package test1;

import com.itbaima.GirlFriend;

public class GirlFriendTest {
    public static void main(String[] args){
        // 测试类
        // 创建实例化对象
        com.itbaima.GirlFriend gf1 = new GirlFriend();

        // 赋值  因为是私有化成员变量,所以不能直接赋值，需要调用 get 和 set 方法
        gf1.setAge(18);
        gf1.setName("小诗诗");
        gf1.setGender("女");

        System.out.println(gf1.getAge());
        System.out.println(gf1.getName());
        System.out.println(gf1.getGender());

        gf1.sleep();

    }
}
