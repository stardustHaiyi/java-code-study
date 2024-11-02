import java.util.Scanner;
// 导入包含 Scanner 的包 （导包）

public class self_homework1 {
    public static void main(String[] args){
        // 用键盘录入数字，并且输出对应的星期。如：用户键盘输入 1，对应输出星期一。

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1--7之间的任意数字");
        int number = sc.nextInt();

        // 用switch case 分支
        switch(number){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("非法数据");
        }




    }
}
