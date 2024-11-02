public class GirlFriendTest {
    public static void main(String[] args){
        // 创建女朋友的对象
        GirlFriend gf1 = new GirlFriend();
        gf1.name = "小诗";
        gf1.age = 18;
        gf1.gender = "萌妹子";

        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);

        gf1.eat();
        gf1.sleep();
        System.out.println("-------------------------------");

        // 创建第二个女朋友
        GirlFriend gf2 = new GirlFriend();
        gf2.name = "小丹丹";
        gf2.age = 19;
        gf2.gender = "萌妹子";

        System.out.println(gf2.name);
        System.out.println(gf2.age);
        System.out.println(gf2.gender);
        // 按住鼠标滚轮，竖着选 或者 按住 alt + 鼠标左键

        gf2.eat();
        gf2.sleep();
    }
}
