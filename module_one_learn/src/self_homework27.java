import java.util.Scanner;


public class self_homework27 {
    public static void main(String[] args){
       // switch与if的第三种格式的使用场景
        // if的第三种格式：一般用于对范围的判断
        // switch:把有限个数据一一列举出来，让我们选择其一


        // 练习：休息日和工作日
        // 需求：键盘录入星期数，输出工作日，休息日。
        // (1-5)工作日，（6-7）休息日。

        // 1.键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数，表示星期数");
        int week = sc.nextInt();

        //利用switch语句来进行选择
        switch(week){
            case 1:
                System.out.println("工作日");
                break;
            case 2:
                System.out.println("工作日");
                break;
            case 3:
                System.out.println("工作日");
                break;
            case 4:
                System.out.println("工作日");
                break;
            case 5:
                System.out.println("工作日");
                break;
            case 6:
                System.out.println("休息日");
                break;
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个选项");
                break;
        }
        System.out.println("-------------------------------------");


        // 简化代码，写法2
        System.out.println("请输入星期数");
        int week1 = sc.nextInt();
        //int week1 = 2;
        switch(week1){
            case 1 -> System.out.println("工作日");
            case 2 -> System.out.println("工作日");
            case 3 -> System.out.println("工作日");
            case 4 -> System.out.println("工作日");
            case 5 -> System.out.println("工作日");
            case 6 -> System.out.println("休息日");
            case 7 -> System.out.println("休息日");
            default -> System.out.println("没有这个选项");
        }
        System.out.println("-------------------------------------");


        // 简化代码，写法3
        System.out.println("请输入星期数");
        int week2 = sc.nextInt();
        switch(week2) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个选项");
                break;
        }
        System.out.println("-------------------------------------");


        // 简化代码，写法4
        System.out.println("请输入星期数");
        int week3 = sc.nextInt();
        switch(week3) {
            case 1,2,3,4,5:
                System.out.println("工作日");
                break;
            case 6,7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个选项");
                break;
        }
        System.out.println("-------------------------------------");


        // 简化代码，写法5
        System.out.println("请输入星期数");
        int week4 = sc.nextInt();
        switch(week4){
            case 1,2,3,4,5 -> System.out.println("工作日");
            case 6,7 -> System.out.println("休息日");
            default -> System.out.println("没有这个选项");
        }



    }
}
