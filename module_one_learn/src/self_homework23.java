import java.util.Scanner;


public class self_homework23 {
    public static void main(String[] args){
        // switch 语句格式
        /*
        * switch(表达式){   表达式取值：byte，short，int，char，JDK5之后可以为枚举，JDK7之后可以为String
        *   case 值1：
        *       语句体1；
        *       break；
        *   case 值2：     case后面的值只能是字面量，不能是变量
        *       语句体2；
        *       break；
        *   case 值3：     case给出的值不允许重复
        *       语句体3；
        *       break；
        * ......
        *   default:
        *      语句体n+1；
        *      break；
        * }*/

        // 执行流程
        /*
        * 1.首先计算表达式的值。
        * 2.依次和case后面的值进行比较，如果有对应的值，就会执行相应的语句，在执行的
        * 过程中，遇到break就会结束。
        * 3.如果所有case后面的值和表达式的值都不匹配，就会执行default里面的语句体，然后
        * 结束整个switch语句。*/


        // 练习：吃面
        // 兰州拉面，武汉热干面，北京炸酱面，陕西油泼面
        String noodles = "兰州拉面";
        switch(noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:  // 备胎
                System.out.println("吃方便面");
                break;
        }


        // 练习：需求：键盘录入星期数，显示今天的减肥活动。
        /*
        * 周一：跑步
        * 周二：游泳
        * 周三：慢走
        * 周四：动感单车
        * 周五：拳击
        * 周六：爬山
        * 周日：好好吃一顿*/

        // 键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数");
        int week = sc.nextInt();

        // 利用switch对星期进行匹配
        switch(week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("没有这个星期");
                break;


        }

    }
}
