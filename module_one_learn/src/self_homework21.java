import java.util.Scanner;


public class self_homework21 {
    public static void main(String[] args){
        // if 的第三种格式
        /*格式：
        * if（关系表达式1）{
        *   语句体1；
        * }else if（关系表达式2）{
        *   语句体2；
        * }
        * ...
        * else{
        * 语句体 n+1；
        * }*/

        // 执行流程：
        /*
        * 1.首先计算关系表达式1的值
        * 2.如果true就执行语句体1；如果为false就计算关系表达式2的值
        * 3.如果true就执行语句体2；如果为false就计算关系表达式3的值
        * ...
        * 4.如果所以的关系表达式的结果都为false，就执行语句体n+1。*/
        // 从上到下依次判断，只要有一个判断为真，就执行对应的语句体，
        // 如果所有的判断都为假，就执行else的语句体


        // 练习：根据不同的分数送不同的礼物
        /*
        * 如果是95--100分，送自行车一辆
        * 如果是90--94分，游乐场玩一天
        * 如果是80--89分，送变形金刚一个，
        * 如果是80分，揍一顿。*/

        // 1.键盘录入小明的考试成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数表示小明的成绩");
        int score = sc.nextInt();

        // 2.对异常数据进行判断校验
        if (score > 0 && score <= 100){
            // 3.根据不同的考试成绩，给出不同的奖励
            if (score >= 95 && score <= 100){
                System.out.println("送自行车一辆");
            } else if (score >= 90 && score <= 94) {
                System.out.println("游乐场玩一天");
            }else if(score >= 80 && score <= 89){
                System.out.println("送变形金刚一个");
            }else{
                System.out.println("揍一顿");
            }
        }else{
            System.out.println("当前录入的数据不合法");
        }

    }
}
