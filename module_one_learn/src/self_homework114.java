import java.util.Random;


public class self_homework114 {
    public static void main(String[] args){
        // 键盘输入任意字符串，打乱里面的内容

        // 1.键盘输入任意字符串
        String str = "abcdefg";

        // 2.打乱里面的内容
        // 修改字符串里面的内容：
        // 1.subString
        // 2.变成字符数组

        char[] arr = str.toCharArray();
        // ['a','b','c','d','e','f','g']

        // 3.打乱数组里面的内容
        // 从0索引开始，跟一个随机索引进行位置的交换
        // 当数组里面的每一个元素都跟一个随机的索引进行交换完毕之后，那么内容就打乱了
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);  // 每次都要生成新的随机索引
            char temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;   // 交换位置要引入第三个变量
        }

        // 4.把字符数组再变回字符串
        String result = new String(arr);

        // 5.打印输出
        System.out.println(result);
    }
}
