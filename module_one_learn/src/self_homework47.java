public class self_homework47 {
    public static void main(String[] args){
        // 练习：求最值
        // 需求：已知数组元素为{33,5,22,44,55}
        // 请找出数组中最大值并打印在控制台


        // 1.定义一个数组用来存储5个值
        int[] arr = {33,5,22,44,55};
        // 2.定义一个变量用来存储最大值
        // 临时认为0索引的数据是最大的
        int max = arr[0];
        // 3.循环获取数组中的每一个元素
        // 拿着每一个元素跟max进行比较
        for (int i = 0; i < arr.length; i++) {
            // i表示索引  arr[i]表示元素
            if (arr[i] > max){
                max = arr[i];
            }
        }
        // 4.当循环结束后，max记录的就是数组中的最大值
        System.out.println(max);
        System.out.println("--------------------------");


        // 注意：
        /*
        * 1.为什么max要记录arr[0]的值，默认值不能是0吗？
        * 默认值不能写0，要是数组中都是负数，那么就不能比较出最值
        * max的初始化值一定要是数组中的值
        *
        * 2.循环的开始条件可以不是从0开始，从0开始的话相当于第一次循环是自己跟自己比较
        * 虽然结果一样，但是效率低，所以可以从1开始，即：int i = 1*/



        // 练习2  求最小值
        int[] arr1 = {1,2,3,45,6};
        int min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < min){
                min = arr1[i];
            }
        }
        System.out.println(min);

    }
}
