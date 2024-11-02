package test3;

public class t_self_homework1 {
    public static void main(String[] args){
        // 练习 《文字版格斗游戏》    《重点》
        /*格斗游戏，每个游戏角色的姓名，血量，都不相同，在选定人物的时候（new对象的时候），这些
        * 信息就应该被确定下来。
        *
        * 姓名为：乔峰
        * 血量为：100
        *
        * 姓名为：鸠摩智
        * 血量为：100
        *
        * 乔峰举起拳头打了鸠摩智一下，造成了xxx点伤害，鸠摩智还剩下xxx点血
        * 鸠摩智举起拳头打了乔峰一下，造成了xxx点伤害，乔峰还剩下xxx点血
        * ......
        * 乔峰K.0了鸠摩智*/
        System.out.println("文字格斗游戏");


    // 参考代码
    // 1.普通代码 test3--> Role 和 GameTest


    // 2.改进代码 test4--> Role 和 GameTest
        // 增加男女，长相，攻击招式




    /*
    * 两部分参数
    * 第一部分参数：要输出的内容 %s (占位),记住挖坑就要填
    * 第二部分参数：填充的数据*/
    System.out.printf("你好啊%s","张三"); // printf 不会自动换行
    System.out.println();  // 换行
    System.out.printf("%s你好啊%s","张三","李四");
    }
}
