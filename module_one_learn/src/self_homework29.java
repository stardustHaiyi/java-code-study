public class self_homework29 {
    public static void main(String[] args){
        // for循环
        /*
        * 格式：
        * for （初始化语句；条件判断语句；条件控制语句）{
        *   循环体语句；
        * }*/

        // 执行流程
        /*
        * 1.执行初始化语句
        * 2.执行条件判断语句，看其结果是true还是false
        *   如果是false，循环结束
        *   如果是true，执行循环体语句
        * 3.执行条件控制语句
        * 4.回到2继续执行条件判断语句*/

        // 练习1 打印5次 HelloWorld
        for (int i = 1;i < 6;i++){
            System.out.println("HelloWorld");
        }
        System.out.println(("-------------------------"));


        // 练习2 输出数字 需求：打印1-5
        int a = 1;
        for (a = 1;a <= 5;a++){
            System.out.println(a);
        }
        System.out.println(("-------------------------"));


        // 练习3 倒着输出数字 需求：打印5-1
        for (int i = 5;i > 0;i--){
            System.out.println(i);
        }
        System.out.println(("-------------------------"));


        // 练习4 断线重连
        /*
        * 在实际开发中，需要重复执行的代码，会选择循环实现。
        * 比如：在玩游戏的时候，如果网不好那么会经常断线重连。
        * 那么断线重连这个业务逻辑就需要重复执行。
        * 假设现在公司要求，断线重连的业务逻辑最多只写5次。
        * 请用代码实现。
        * 备注：断线重连的业务逻辑可以用输出语句代替。*/

        for (int i = 1;i <= 5;i++){
            System.out.println("第" + i + "次执行断线重连业务逻辑");
        }
    }
}
