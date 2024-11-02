public class self_homework61 {
    public static void main(String[] args){
        // 练习 数组遍历
        // 需求：设计一个方法用于数组的遍历，要求遍历的结果是在一行上的。例如：[11,22,33,44,55]

        // 定义一个数组
        int[] arr = {11,22,33,44,55};

        // 调用方法
        printArr(arr);
    }

    // 定义方法用于数组的遍历
    // 1.我要干嘛？  遍历数组
    // 2.我干这件事需要什么才能完成？  数组
    // 3.方法的调用处是否需要继续使用结果？  不需要返回值
    public static void printArr (int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
