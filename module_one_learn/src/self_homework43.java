public class self_homework43 {
    public static void main(String[] args){
        // 数组的遍历
        // 数组的遍历：将数组中所有的内容取出来，取出来之后可以（打印，求和，判断...）
        // 注意：遍历指的取出数据的过程，不要局限理解为，遍历就是打印

        // 1.定义数组
        int[] arr = {1,2,3,4,5};
        // 2.获取数组里所有的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("-----------------------------");


        // 利用循环改进代码
        // 开始条件：0
        // 结束条件：数组的长度 - 1（最大索引）
        for (int i = 0;i < 5;i++){
            // i     0,1,2,3,4
            System.out.println(arr[i]);
        }
        System.out.println("-----------------------------");


        // 在java当中，关于数组的一个长度属性：length
        // 调用方式：数组名.length
        // System.out.println(arr.length);
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }


        // 扩展
        // 自动的快速生成数组的遍历方式
        // idea提供的
        // 数组名.fori
        /*for (int i = 0; i < arr.length; i++) {
            把剩下的补全
        }
*/


        // 练习 ： 遍历数组并求和
        // 定义一个数组，存储1，2，3，4，5
        // 遍历数组得到每一个元素，求数组里面所有的数据的和

        // 求和变量
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // i依次表示数组里的每一个索引
            // arr[i]依次表示数组里面的每一个元素
            sum = sum + arr[i];
        }
        // 循环结束之后，sum的值就是累加之后的结果
        System.out.println(sum);

    }
}
