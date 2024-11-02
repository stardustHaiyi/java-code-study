import java.util.Random;


public class self_homework69 {
    public static void main(String[] args){
        // 练习 开发验证码
        /*
        * 需求：
        * 定义方法实现随机产生一个5位的验证码
        * 验证码格式：
        * 长度5
        * 前四位是大写字母或者小写字母
        * 最后一位是数字*/

        // 解题思路
        /*
        * 在以后，如果我们要在一堆没有什么规律的数据中随机抽取
        * 可以先把这些数据放到数组当中
        * 再随机抽取一个索引*/

        // 分析：
        // 1.大写字母和小写字母都放到数组当中

        // 定义一个数组用来存储a-z的大小写字母
        char[] chs = new char[52];  // 数组的动态定义
        for (int i = 0; i < chs.length; i++) {
            // 数字和字母在ASCII码表中是一一对应的
            if (i <= 25){
                // 添加小写字母
                chs[i] = (char)(97 + i);
            }else {
                // 添加大写字母
                // A------65
                chs[i] = (char)(65 + i -26);
            }
        }
        /*// 遍历
        for (int i = 0;i < chs.length;i++){
            System.out.print(chs[i] + " ");
        }*/

        // 定义一个字符串类型的变量，用来记录最终的结果
        String result = "";  // "" 代表长度为0，什么都没有的字符串

        // 2.随机抽取4次
        // 随机抽取数组中的索引
        Random r = new Random();
        for (int i = 0; i < 4; i++) {  // 4.fori (4点fori)
            int randomIndex = r.nextInt(chs.length);
            // 利用随机索引，获取对应的元素
            //System.out.println(chs[randomIndex]);
            result = result + chs[randomIndex];  //假如索引出来的为 a，那么就是 ”“ + a
        }
        // 当循环结束后，result就是四次循环后的结果
        //System.out.println(result);

        // 3.随机抽取一个数字0~9
        int number = r.nextInt(10);

        // 生成最终的结果
        result = result + number;

        // 打印最终的结果
        System.out.println(result);


    }
}
