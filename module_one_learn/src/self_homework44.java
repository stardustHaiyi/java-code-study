public class self_homework44 {
    public static void main(String[] args){
        // 练习 统计个数
        // 定义一个数组，存储1，2，3，4，5，6，7，8，9，10
        // 遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字

        // 定义一个数组
        // int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        // 定义一个计数器
        int count = 0;

        //
        for (int i = 0; i < arr.length; i++) {
            // i 表示数组里面的每一个索引
            // arr[i] 表示数组里面的每一个元素
            if (arr[i] % 3 == 0){
                // System.out.println(arr[i]);
                count++;
            }
        }

        // 循环结束之后count的值就是结果
        System.out.println("数组中能够被3整除的数字一共有" + count + "个");
    }
}
