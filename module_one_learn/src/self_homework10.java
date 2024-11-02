import java.util.Scanner; // 导包

public class self_homework10 {
    public static void main(String[] args){
        // 键盘录入
        // java帮我们写好了一个类叫Scanner，这个类可以接收键盘输入的数字
        /*
        * 步骤1.导包----Scanner这个类在哪里
        * import java.util.Scanner;
        * 导包的动作必须出现在类定义的上边
        *
        * 步骤2.创建对象----表示我开始要使用Scanner这个类了
        * Scanner sc = new Scanner(System.in);
        * 上面这个格式里面，只有sc是变量名，可以变，其他的都不允许
        *
        * 步骤3.接收数据----真正开始干活了
        * int i = sc.nextInt();
        * 上面的这个格式里面，只有i是变量名，可以变，其他的都不允许变*/

        // 2.创建对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入数据");

        // 3.接收数据
        int i = sc.nextInt();
        System.out.println(i);


    }
}
