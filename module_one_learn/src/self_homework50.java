import java.util.Random;


public class self_homework50 {
    public static void main(String[] args){
        // 练习 打乱数组中的数据
        // 需求：定义一个数组，存入1-5.要求打乱数组中所有数据的顺序


        // 1.定义数组存储1-5
        int[] arr ={1,2,3,4,5};
        // 2.循环遍历数组，从0索引开始打乱数据的顺序
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];   // 核心思想就是两个数交换值
            arr[randomIndex] = temp;
        }
        // 当循环结束之后，那么数组中所有的数据已经打乱顺序了
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
