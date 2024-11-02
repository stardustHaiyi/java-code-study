import java.util.Scanner;


public class self_homework71 {
    public static void main(String[] args){
        // 练习  评委打分
        // 需求：
        /*
        * 在歌唱比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。
        * 选手的最后得分为：去掉最高分，最低分后的4个评委的平均分，请完成上述过程
        * 并计算出选手的得分。*/


        // 分析
        // 1.定义一个数组，用来存储6名评委的打分（0-100）
        int[] scoreArr = getScores();
        for (int i = 0;i < scoreArr.length;i++){
            System.out.println(scoreArr[i]);
        }

        // 2.求出数组中的最大值
        int max = getMax(scoreArr);
        // 3.求出数组中的最小值
        int min = getMin(scoreArr);
        // 4.求出数组中6个分数的总和
        int sum = getSum(scoreArr);
        // 5.(总和 - 最大值 - 最小值)/4
        int avg = (sum - max - min) / (scoreArr.length - 2);
        // 在写代码的时候，值 能不写死就不要写死

        // 打印结果
        System.out.println("平均分为：" + avg);
    }


    // 定义方法用来求和
    public static int getSum(int[] scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        // 当循环结束后，sum的值就是结果
        return sum;
    }


    // 定义一个方法，求数组的最大值
    public static int getMax(int[] scoreArr){
        int max = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] > max){  // 大于最大，小于最小
                max = scoreArr[i];
            }
        }
        return max;
    }



    // 定义方法求数组的最小值
    public static int getMin(int[] scoreArr){  // 快捷键：先选中max然后按 shift+F6 ，再改成min
        int min = scoreArr[0];
        for (int i = 0; i < scoreArr.length; i++) {
            if (scoreArr[i] < min) {
                min = scoreArr[i];
            }
        }
        return min;

    }

    // 我要干什么？  定义一个数组，用来存储6名评委的打分（1-100）
    // 干这件事我需要什么？  都不需要
    // 干完这件事，是否需要返回？  必须返回

    // 定义一个方法
    public static int[] getScores(){
        // 定义一个数组  动态
        int[] scores = new int[6];
        // 使用键盘录入的形式，输出分数：0~100
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length;) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){  //只有录入的数据满足要求了，i才会加加
                scores[i] = score;
                i++;
            }else {
                System.out.println("成绩超出了范围，继续录入，当前的i为："+i);
            }
        }
        return scores;

    }
}
