import java.util.Scanner;

public class self_homework22 {
    public static void main(String[] args){
        // 练习 商品的价格 《斯坦福练习》
        /*
         * 在实际开发中，多种情况判断时，会用到if的第三种格式：
         * 需求：
         * 商场都会有VIP会员制，根据不同的会员有不同的折扣。
         * 假设商品的总价为1000。
         * 键盘录入会员的级别，并计算出实际支付的钱。
         * 会员1级：打9折。
         * 会员2级：打8折。
         * 会员3级：打7折。
         * 非会员：不打折。
         * */

        // 1.定义变量记录总价
        int price = 1000;

        // 2.键盘录入会员的级别
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员的级别");
        int vip = sc.nextInt();

        // 3.根据级别来计算实际要支付的钱
        if (vip == 1){
            System.out.println("实际支付的钱为"+(price*0.9));
        } else if (vip == 2){
            System.out.println("实际支付的钱为"+(price*0.8));
        } else if (vip == 3) {
            System.out.println("实际支付的钱为"+(price*0.7));
        } else {
            System.out.println("实际支付的钱为"+price);
        }
        System.out.println("-----------------------------");

        // if的第一种格式：单条件判断
        // if的第二种格式：双条件判断
        // if的第三种格式：多条件判断

        // 练习
        /*
         * 自动驾驶
         * 汽车无人驾驶会涉及到大量的判断
         * 当汽车行驶的时候遇到了红绿灯，就会进行判断
         * 当红灯亮时，就停止
         * 当黄灯亮时，就减速
         * 当绿灯亮时，就行驶*/

        boolean isLightGreen = false;
        boolean isLightYellow = false;
        boolean isLightRed = true;

        if (isLightGreen){
            System.out.println("GOGOGO");
        } else if (isLightYellow) {
            System.out.println("slow");
        } else if (isLightRed) {
            System.out.println("stop");
        }


    }
}
