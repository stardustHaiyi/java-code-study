public class self_homework64 {
    public static void main(String[] args){
        // 练习  复制数组
        // 需求：定义一个方法copyOfRange(int[] arr,int from,int to)
        // 功能：将数组arr中从索引from（包含from）开始。
        // 到索引to（不包含to）结束的元素复制到新数组中，
        // 将新数组返回。

        // 定义原始数组
        int[] arr ={1,2,3,4,5,6,7,8,9};

        // 调用方法
        int[] copyArr = copyOfRange(arr,3,7);

        // 遍历copyArr
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");

        }
    }

    // 定义方法
    public static int[] copyOfRange(int[] arr,int from,int to){  // 3~7  3,4,5,6
        // 1.定义一个数组  动态初始化
        int[] newArr = new int[to - from];

        // 2.把原始数组arr中的from到to上对应的元素，直接拷贝到newArr中
        // 伪造索引的思想（既然下面的newArr没有对应的索引，那么哥们儿就自己造一个）
        int index = 0;
        for (int i = from; i < to; i++) {
            // 格式：数组名[索引] = 数据值;
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
