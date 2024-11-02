public class self_homework96 {
    public static void main(String[] args){
        // 练习  拼接字符串
        // 定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，
        // 调用该方法，并在控制台输出结果。
        // 例如：
        // 数组为 int[] arr = {1,2,3};
        // 执行方法后的输出结果为：[1,2,3]


        // 1.定义一个数组
        int[] arr = {1,2,3};

        String str = arrToString(arr);
        System.out.println(str);


    }

    // 我要干什么？  将数组转化成字符串
    // 我干这件事需要什么？  数组
    // 需要返回值吗？   需要

    // 定义一个方法
    public static String arrToString(int[] arr){
        if (arr == null){  // 判断传入的数组是不是 空
            return "";
        }

        if (arr.length == 0){  // 判断传入的数组里面有没有元素
            return "[]";
        }

        String result = "[";
        // 当代码执行到这里表示什么？
        // 表示数组不是null ，也不是长度为0的
        for (int i = 0; i < arr.length; i++) {
            // i 索引，arr[i] 元素
            if (i < arr.length - 1){
                result = result + arr[i] + ", ";
            }else {
                result = result + arr[i];
            }
        }
        // 此时拼接右括号
        result = result + "]";
        return result;
    }
}
