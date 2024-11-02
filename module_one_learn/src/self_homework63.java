public class self_homework63 {
    public static void main(String[] args){
        // 练习  判断是否存在
        // 定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处

        // 定义一个数组
        int[] arr ={1,5,8,12,56,89,34,67};

        // 判断一个数字在数组中是否存在
        boolean flag = contains(arr,89);
        System.out.println(flag);


    }

    // 1.我要干嘛？  是否存在
    // 2.我干这件事需要什么才能完成？  数组
    // 3.是否返回？  返回 true false
    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;  // 如果为真那么返回true。后面的代码不会再执行了
                // 如果这里写的是一个break，那么会跳出for循环，去执行下面的代码
            }
        }
        // 什么时候才能断定89，在数组中是不存在的？
        // 当数组里面所有的数据全部比较完毕之后，才能断定
        return false;
    }

}

// return 和 break 关键字的区别
// return :其实跟循环没什么关系，跟方法有关的，表示：1.结束方法，2.返回结果
//         如果方法执行到了return，那么整个方法全部结束，里面的循环也会随之结束。
//         就好比地球爆炸了，你还能活吗？

// break关键字
// 其实跟方法没有什么关系，结束循环或者switch的。
