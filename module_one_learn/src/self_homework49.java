public class self_homework49 {
    public static void main(String[] args){
        // 练习 交换数组中的数据
        /*
        * 需求：定义一个数组，存入1，2，3，4，5.按照要求交换索引对应的元素。
        * 交换前：1，2，3，4，5
        * 交换后：5，4，3，2，1*/

        // 1.定义数组存储数据
        int[] arr = {1,2,3,4,5};
        // 2.利用循环去交换数据
        for (int i = 0,j = arr.length - 1;i < j;i++,j--){
            // i从左往右移动，j从右往左移动
            // 交换变量i和变量j指向的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // 当循环结束之后，那么数组中的数据就实现了头尾交换
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
