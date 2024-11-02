public class self_homework62 {
    public static void main(String[] args){
        // 练习  数组最大值
        // 需求：设计一个方法求数组的最大值，并将最大值返回

        // 定义一个数组
        int[] arr ={1,5,7,3,8,10};

        // 调用方法
        int max = getMax(arr);

        // 打印
        System.out.println(max);
    }

    // 1.我要干嘛？  求最大值
    // 2.我干这件事需要什么才能完成？  数组
    // 3.是否返回？  返回
    public static int getMax(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {  // 可以从0开始，不过有点多此一举
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
