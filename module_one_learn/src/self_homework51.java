public class self_homework51 {
    public static void main(String[] args) {
        // 空三集 P22 P38 P62

        // 方法
        // 1.什么是方法
        // 方法（method）是程序中最小的执行单元

        // 2.在实际开发中，什么时候用到方法？
        // 重复的代码，具有独立功能的代码可以抽取到方法中

        // 3.实际开发中，方法有什么好处？
        // 可以提高代码的复用性
        // 可以提高代码的可维护性


        //方法的格式  把一些代码打包在一起，用到的时候就调用
        // 1.方法定义
        // 把一些代码打包在一起，该过程称为方法定义。

        // 2.方法调用
        // 方法定义后并不是直接运行的，需要手动调用才能执行，该过程称为方法调用

        // 调用方法   方法要先定义再2调用
        playGame();
    }


    // 第一：最简单的方法的定义和调用
    // 格式：
        /*public static void 方法名（）{
            方法体（就是打包起来的代码）
        }*/
    // 范例：
    public static void playGame() {
        System.out.println("打游戏");
        System.out.println("对线");
        System.out.println("顺风聊家常");
        System.out.println("崩盘");
        System.out.println("逆风骂队友");
        System.out.println("不是我的错，错的都是队友");
        System.out.println("送人头");
        System.out.println("GG");
    }

    // 注意方法的定义一定要写在 类的里面   ， main（）的外面

    // 方法的调用
    // 格式：   方法名（）；
}



