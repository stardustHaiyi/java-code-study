import java.util.Random;
import java.util.Scanner;

public class self_homework40 {
    public static void main(String[] args){
        // 接续 "self_homework39"
        // 练习  猜数字小游戏
        // 需求：程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少？

        // 分析
        // 1.生成一个1-100之间的随机数字
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        // 2.猜这个数字是多少
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("请输入你要猜的数字");
            int guessNumber = sc.nextInt();
            // 3.判断两个数值给出不同的提示
            // 猜的数字大了，给出提示 大了
            // 猜的数字小了，给出提示 小了
            // 猜的数字一样，提示猜中了
            // 用while循环的理由：1.一般不用do-while  2.for循环要知道循环的次数(这里不知道)
            if (guessNumber > number){
                System.out.println("大了");
            }else if(guessNumber < number){
                System.out.println("小了");
            }else{
                System.out.println("恭喜你猜中了");
                break;  // 如果猜中了，直接结束while循环
            }
        }



        // 练习 增加一个需求，在上面的条件不变的情况下，增加一个保底机制
        // 需求：如果3次猜不中，系统直接提示猜中了

        // 计数器
        // 用来统计当前已经猜了多少次了
        /*int count = 0;

        while(true){
            System.out.println("请输入你要猜的数字");
            int guessNumber = sc.nextInt();
            // 3.判断两个数值给出不同的提示
            // 猜的数字大了，给出提示 大了
            // 猜的数字小了，给出提示 小了
            // 猜的数字一样，提示猜中了
            // 用while循环的理由：1.一般不用do-while  2.for循环要知道循环的次数(这里不知道)

            count++;
            if (count == 3){
                System.out.println("恭喜你，猜中了");
                break;  // 如果3次猜不中，直接保底，然后结束循环
            }

            if (guessNumber > number){
                System.out.println("大了");
            }else if(guessNumber < number){
                System.out.println("小了");
            }else{
                System.out.println("恭喜你猜中了");
                break;  // 如果猜中了，直接结束while循环
            }
        }*/



    }
}
