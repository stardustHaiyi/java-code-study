import java.util.Scanner;


public class self_homework28 {
    public static void main(String[] args){
        // switch 练习
        // 在实际开发中，如果我们需要在多种情况下选择其中一个，就可以使用switch语句。
        /*
        * 当我们拨打了某些服务电话时，一般都会有按键选择。
        * 假设现在我们拨打了一个机票预订电话。
        * 电话中语音提示：
        * 1.机票查询
        * 2.机票预订
        * 3.机票改签
        * 4.退出服务
        * 其他按键也是退出服务，请使用switch来模拟该业务逻辑*/


        // 1.键盘录入一个整数表示我们的选择
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的选择");
        int choose = sc.nextInt();

        // 2.根据选择执行不同代码
        switch(choose){
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预订");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            case 4:
                System.out.println("退出服务");
                break;
            default:
                System.out.println("退出服务");
                break;
        }
        System.out.println("--------------------------");


        // 简化代码，写法2
        System.out.println("请输入你的选择");
        int choose1 = sc.nextInt();
        switch(choose1){
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票查询");
            case 3 -> System.out.println("机票查询");
            default -> System.out.println("机票查询");
        }

    }
}
