public class self_homework68 {
    public static void main(String[] args){
        // 练习  找质数（素数）
        // 需求：判断101~200之间有多少个素数，并输出所有的素数


        // 思路一：2~99
        // 定义变量i,赋值100
        // 判断i是否为质数


        // 定义一个计数器
        int count = 0;
        for (int i = 101;i <= 200;i++){
            // i 依次表示循环中的每一个数字
            boolean flag = true;  // 刚开始姑且认为 i 是质数
            for (int j = 2;j < i;j++){  // 内循环判断当前数字是不是一个质数
                // j表示2~99之间的每一个数字
                if(i % j == 0){
                    flag = false;
                    break;  // 跳出单层循环，内循环
                }
            }
            if (flag){
                System.out.println("当前数字" + i + "是质数");
                count++;
            }
        }
        // 循环结束后，count的值就是结果
        System.out.println("一共有" + count + "个质数");


        /*int i = 100;
        boolean flag = true;  // 刚开始姑且认为 i 是质数
        for (int j = 2;j < i;j++){
            // j表示2~99之间的每一个数字
            if(i % j == 0){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("当前数字是质数");
        }else{
            System.out.println("当前数字不是一个质数");
        }*/

    }
}
