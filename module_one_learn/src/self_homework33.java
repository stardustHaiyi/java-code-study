public class self_homework33 {
    public static void main(String[] args){
        // 练习 求商和余数
        /*
        * 需求：给定两个整数，被除数和除数（都是正数，且不超过int的范围）。
        * 将两数相除，要求不使用乘法，除法和%运算符。
        * 得到商和余数*/

        // 1.定义变量记录被除数
        int dividend = 100;
        // 2.定义变量记录除数
        int divisor = 37;
        // 3.定义一个变量用来统计相减了多少次
        int count = 0;
        // 4.循环while
        // 只要被除数是大于等于除数的，那么就一直循环
        while(dividend >= divisor){
            dividend = dividend - divisor;
            // 只要减一次,那么统计变量就自增一次
            count++;
        }
        // 当循环结束之后dividend变量记录的就是余数
        System.out.println("余数为：" + dividend);
        // 当循环结束之后count变量记录的就是商
        System.out.println("商为：" + count);
    }
}
