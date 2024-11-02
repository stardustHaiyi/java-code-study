public class self_homework73 {
    public static void main(String[] args){
        // 练习
        // 需求：把整数上的每一位都添加到数组当中
        // 反向推导

        // 1.计算出数组的长度
        int number =12345;
        // 定义一个变量临时记录number的值，就是为了第三步的时候再次使用
        int temp = number;

        // 定义一个变量进行统计
        int count = 0;
        while(number != 0){
            // 每一次循环就去掉右边的一个数字
            number = number / 10;
            // 去掉一位计数器就自增一次
            count++;
        }

        // 2.定义数组
        // 动态初始化
        int[] arr = new int[count];

        // 3,把整数上的每一位都添加到数组当中
        //System.out.println(temp);
        int index = arr.length - 1;
        while(temp != 0){  // 12345
            // 获取temp里面的每一位数字
            int ge = temp % 10;
            // 再去掉右边的那位数字
            temp = temp / 10;
            // 把当前获取到的个位添加到数组当中
            arr[index] = ge;
            index--;
        }
        // 验证结果  1 2 3 4 5
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }
}

// 反向推导思想
// 先判断结果会是什么样子的，然后一步一步往前推
