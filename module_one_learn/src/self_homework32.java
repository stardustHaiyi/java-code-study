public class self_homework32 {
    public static void main(String[] args){
        //练习：  回文数
        /*
        * 需求：给你一个整数x
        *   如果x是一个回文数，打印true，否则，返回false。
        * 解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
        * 例如：121是回文数，而123不是。*/


        // 核心思路：把数字倒过来跟原来的数字进行比较
        // 1.定义数字
        int x = 12321;
        int temp = x;  //定义一个临时变量用于记录x原来的值，用于最后的比较
        int num = 0; // 记录倒过来之后的结果
        // 2.利用循环开始
        while(x != 0){
            // 从右往左获取每一位数字
            int ge = x % 10;
            // 修改一下x记录的值
            x = x / 10;  // java中整数除以整数得到的还是整数
            // 把当前获取到的数字拼接到最右边
            num = num * 10 + ge;
        }

        // 3.打印num
        System.out.println(num);
        System.out.println(x);  // 0（因为while中在不断修改x的值）  所以才要定义一个 temp

        // 4.比较
        System.out.println(num == temp);
    }
}
