import java.util.Random;  // 导包


public class self_homework39 {
    public static void main(String[] args){
        // 练习  猜数字小游戏
        // 需求：程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少？


        // 获取随机数
        // java帮我们写好了一个类叫Random，这个类就可以生成一个随机数。

        // 使用步骤：
        /*
        * 1.导包：Random这个类在哪里
        * import Java.util.Random;
        * 导包的动作必须出现在类定义的上边。
        *
        * 2.创建对象---表示我要开始用Random这个类了
        * Random r = new Random();
        * 上面这个格式里面，只有r是变量名，可以变，其他的都不允许变。
        *
        * 3.生成随机数---真正开始干活了
        * int number = r.nextInt(随机数的范围);
        * 上面这个格式里面，只有number是变量名，可以变，其他的都不允许变。*/

        // 1.导包
        // 2.创建对象
        Random r = new Random();
        // 3.生成随机数
        // 判断技巧
        // 在校括号中，书写的是生成随机数的范围
        // 这个范围一定是从0开始的。
        // 到这个数 -1 结束
        // 口诀：包头不包尾，包左不包右
        for (int i = 0;i < 100;i++){
            int number = r.nextInt(10);  // 0~9
            System.out.println(number);
        }

        // 假如我要生成7~15之间的随机数
        // 秘诀：
        /*
        * 1.让这个范围头尾都减去一个值，让这个范围从0开始   -7      0~8
        * 2.尾巴 +1    8 + 1 = 9
        * 3.最终的结果再加上第一步减去的值*/

        /*Random r = new Random();
        int number = r.nextInt(9) + 7;*/

        //    续续续
    }
}
