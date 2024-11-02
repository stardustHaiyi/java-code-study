public class self_homework70 {
    public static void main(String[] args){
        // 练习 数组元素的复制
        // 需求：把一个数组中的元素复制到另一个新数组中去


        // 分析：
        // 1.定义一个老数组并存储一些元素
        int[] arr = {1,2,3,4,5};
        // 2.定义一个新数组的长度跟老数组一致
        int[] newArr = new int[arr.length];
        // 3.遍历老数组，得到老数组中的每一个元素，依次存入到新数组当中
        for (int i = 0; i < arr.length; i++) {
            // i 表示老数组中的索引，arr[i]表示老数组中的元素
            newArr[i] = arr[i];
        }

        // 循环结束之后，老数组中的元素就全部复制到了新数组当中
        // 遍历新数组
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);

        }
    }
}
