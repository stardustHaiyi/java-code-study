import java.util.Scanner;


public class self_homework20 {
    public static void main(String[] args){
        // if语句的第二种格式
        /*
        * 格式：
        * if（关系表达式）{
        *   语句体1；
        * }else {
        *   语句体2；
        * }*/

        // 执行流程
        /*
        * 1.首先计算关系表达式的值
        * 2.如果关系表达式的值为true，就执行语句体1
        * 3.如果关系表达式的值为false，就执行语句体2
        * 4.继续执行后面的其他语句
        *
        * 注意：
        * 如果成功执行语句体1，那么将不会再执行语句体2，会直接结束if语句
        * 同理，如果成功执行语句体2，那么也不会再回去执行语句体1，会直接结束if语句*/


        // 练习：吃饭
        /*
        * 键盘录入一个整数，表示身上的钱，
        * 如果大于等于100块钱，就吃网红餐厅
        * 否则，就吃经济实惠的沙县小吃*/



        // 键盘录入一个整数，表示身上的钱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身上的钱");
        int money = sc.nextInt();

        // 对钱进行判断（二选一）
        if (money >= 100){
            System.out.println("吃网红餐厅");
        }else{
            System.out.println("吃经济实惠的沙县小吃");
        }
        System.out.println("------------------------");



        // 练习：商品付款 《斯坦福练习》
        /*
        * 在实际开发中，如果需要根据两种不同的情况来执行不同的代码，就需要用到if的第二种格式
        * 需求：
        * 假设用户在超市实际购买，商品总价为600元。
        * 键盘录入一个整数表示用户实际支付的钱。
        * 如果付款大于等于600，表示付款成功。否则付款失败。*/


        // 键盘输入一个整数，表示用户实际支付的钱
        System.out.println("请输入你实际支付的钱");
        int money1 = sc.nextInt();

        // 判断
        if (money1 >= 600){
            System.out.println("付款成功");
        }else{
            System.out.println("付款失败");
        }
        System.out.println("------------------------");


        // 练习：影院选座 《斯坦福练习》
        /*
        * 在实际开发中，点影院选座也会用到if判断
        * 假设某影院售卖了100张电影票，票的序号为1--100.
        * 其中，奇数票号坐左侧，偶数票号坐右侧。
        * 键盘录入一个整数表示电影票的票号。
        * 根据不同情况，给出不同的提示：
        * 如果票号为奇数，那么打印坐左边。
        * 如果票号为偶数，那么打印坐右边。*/

        // 1.键盘录入一个整数表示票号
        //Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个票号");
        int ticket = sc.nextInt();
        // 只有当ticket在0--100之间，才是真实有效的票
        if (ticket >= 0 && ticket <= 100){
            // 判断票号是奇数还是偶数
            if (ticket % 2 == 1){
                System.out.println("坐左边");
            }else{
                System.out.println("坐右边");
            }
        }


    }
}
