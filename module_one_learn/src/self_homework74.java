public class self_homework74 {
    public static void main(String[] args){
        // 练习  请将加密后的数据解密出来
        // 本练习接续self_homework74 和 self_homework73
        // 比如：1983加密之后变成8346，解密之后变成1983


        // 1.定义数组记录解密之后的结果
        int[] arr ={8,3,4,6};
        // 2.反转
        for (int i = 0,j = arr.length - 1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // 3.由于加密是通过对10取余的方式进行获取的
        // 所有在加密的时候就需要判断，0~4之间+10  5~9数字不变
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4){
                arr[i] = arr[i] +10;
            }
        }

        // 4.每一位减5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }

        // 5.获取数组里面的每一位数字拼接成最终的结果
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }

        // 打印最终结果
        System.out.println(number);


        /*for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/


    }
}
