import java.util.Scanner;

public class self_homework19 {
    public static void main(String[] args){
        // if 语句的第一种格式
        /*
        * if (关系表达式) {
        * 语句体；
        * }*/
        // 例子
        int a = 10;
        if (a > 2){
            System.out.println("if语句");
        }
        System.out.println("-------------------------");

        // 练习：键盘录入女婿的酒量，如果大于2斤，老丈人给出回应，反之不回应

        // 1.键盘录入女婿的酒量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量");
        int wine = sc.nextInt();

        // 2.对酒量进行判断
        if (wine > 2){
            System.out.println("小伙子，不错啊");
        }

        // 注意：
        /*
        * 1.大括号的开头可以另起一行写，但是建议写在第一行的末尾
        * 2.在语句体中如果只有一行代码，大括号可以省略不写（建议写上，不要省略）
        * 3.如果对一个布尔类型的变量进行判断，不要用==号*/

        // 例如：
        boolean flag = false;
        if (flag){  // 如果（）里面写 flag == true 容易写成 flag = true
            System.out.println("flag的值为true");
        }
        System.out.println("---------------------------------");


        // 练习
        /*
        * 自动驾驶
        * 汽车无人驾驶会涉及到大量的判断
        * 当汽车行驶的时候遇到了红绿灯，就会进行判断
        * 当红灯亮时，就停止
        * 当黄灯亮时，就减速
        * 当绿灯亮时，就行驶*/

        // 1.定义三个变量表示灯的状态
        // true 亮  false 灭
        boolean isLightGreen = false;
        boolean isLightYellow = false;
        boolean isLightRed = true;

        // 2.判断
        // 当红灯亮时，就停止
        // 当黄灯亮时，就减速
        // 当绿灯亮时，就行驶

        if (isLightGreen){
            System.out.println("GOGOGO");
        }

        if (isLightYellow){
            System.out.println("slow");
        }

        if (isLightRed){
            System.out.println("stop");
        }

    }
}
