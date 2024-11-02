public class homework2 {
    public static void main(String[] args){
        /*需求：一座寺庙里住着三个和尚，已知他们的身高分别为150cm ,210cm
        ,165cm,请用程序实现获取这三个和尚的最高身高。
         */

        // 1.定义三个变量记录三个和尚的身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        // 2.拿着第一个和尚和第二个和尚进行比较
        // 再拿着结果跟第三个和尚比较即可。
        // 定义一个中间变量，当作容器

        int temp = height1 > height2 ? height1 : height2;
        // height1 大于 height2 吗？ 大于（true）就取值height1，不大于（false）就取值height2
        int max = temp > height3 ? temp : height3;

        // ctrl + alt + L  自动格式化代码

        System.out.println(max);
    }
}
