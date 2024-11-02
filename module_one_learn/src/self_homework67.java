import java.util.Scanner;

public class self_homework67 {
    public static void main(String[] args){
        // 练习 卖飞机票（代码优化）题目查看self_homework66

        // 1.我要干什么？   根据舱位和折扣来计算最终的票价
        // 2.我干这件事需要什么才能完成？   原价，舱位，头等舱的折扣，经济舱的折扣
        // 3.方法的调用处是否需要继续使用这个结果？  需要
        // 分析：
        // 1.键盘录入机票原价，月份，头等舱或经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前的月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的仓位 0 头等舱 1 经济舱");
        int seat = sc.nextInt();


        // 2.先判断月份是旺季还是淡季
        if (month >= 5 && month <= 10){
            // 旺季  3.继续判断当前的机票是经济舱还是头等舱

            // 调用方法
            ticket = getPrice(ticket,seat,0.9,0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            // 淡季
            ticket = getPrice(ticket,seat,0.7,0.65);
        }else {
            // 键盘录入的月份不合法
            System.out.println("键盘录入的月份不合法");
        }
        // 4.根据实际情况计算出对应的价格
        System.out.println(ticket);
    }

    // 定义方法
    public static int getPrice(int ticket,int seat,double v0,double v1){
        if (seat == 0){
            // 头等舱
            ticket = (int)(ticket * v0);
        } else if (seat == 1) {
            // 经济舱
            ticket = (int)(ticket * v1);
        }else {
            // 输入的座位是非法数据
            System.out.println("没有这个舱位");
        }
        return ticket;
    }
}

// ctrl + x 剪贴

// ctrl + alt + M  自动抽取方法
// 选中你想要写成方法的那段代码，然后用快捷键  ctrl + alt + M
