package test6;

public class GirlFriendTest {
    public static void main(String[] args){
        // 测试类
        // 1.定义一个数组，来存储女朋友对象
        GirlFriend[] arr = new GirlFriend[4];

        // 2.创建女朋友对象
        GirlFriend gf1 = new GirlFriend("小诗诗",18,'女',"吃零食");
        GirlFriend gf2 = new GirlFriend("小丹丹",19,'女',"玩游戏");
        GirlFriend gf3 = new GirlFriend("小慧慧",20,'女',"看书，学习");
        GirlFriend gf4 = new GirlFriend("憨妹子",21,'女',"睡觉");

        // 3.把对象添加到数组中去
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        // 4.求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // i 表示索引,arr[i]表示元素(女朋友对象)
            GirlFriend gf = arr[i];
            sum = sum + gf.getAge();
        }
        // 当循环结束后，sum中记录的数值就是总年龄

        // 5.用总年龄（求和）来计算平均年龄(平均值)
        int avg = sum / arr.length;

        // 6.统计年龄低于平均值的个数，并打印她们的信息

        // 定义一个计数器
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if (gf.getAge() < avg ){
                System.out.println(gf.getName() + "," + gf.getAge() + "," + gf.getGender() + "," +gf.getHobby());
                count++;
            }

        }
        // 当循环结束后，count中记录的数值就是结果
        System.out.println("年龄低于平均值一共有：" + count + "个");

    }
}
