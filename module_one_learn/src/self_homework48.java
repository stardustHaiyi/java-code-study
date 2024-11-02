import java.util.Random;


public class self_homework48 {
    public static void main(String[] args){
        // 练习  遍历数组求和  《斯坦福练习》
        /*
        * 需求：生成10个1-100之间的随机数存入数组.
        * 1.求出所有数据的和
        * 2.求出所有数据的平均数
        * 3.统计有多少个数据比平均值小*/

        // 分析
        // 1.定义数组
        int[] arr = new int[10];
        // 2.把随机数存入数组当中
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }

        // 3.求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // 当循环结束之后，sum就是数组所有元素的总和
        System.out.println("总和为：" + sum);

        // 4.求出所有数据的平均数
        int avg = sum / arr.length;
        System.out.println("平均数为：" + avg);

        // 5.统计有多少个数据比平均值小
        // 定义一个计数器
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg){
                count++;
            }
        }
        // 循环结束后count就是结果
        System.out.println("在数组中一共有" + count + "个数据比平均数小");

        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // 把ln删掉就不会换行了，后面加一个空格间隔开
        }

    }
}
