import java.util.Scanner;

public class self_homework16 {
    public static void main(String[] args){
        int a = 10;
        int b = a++; //先用后加
        System.out.println(b);

        int a1 = 10;
        int b1 = ++a1; //先加后用
        System.out.println(b1);
        System.out.println("---------------------------");

        // ++和--无论是放在变量的前边还是后边，单独写一行结果是一样的。

        //赋值运算符
        // += , -= , *= , /= , %= 的底层都隐藏了一个强制类型转换
        short s = 1;
        s += 1;
        // 它等价于 s = s + 1; 吗？（答案是不等于）
        // s += 1;应该等价于 s = (short)(s+1); 括号里面的类型由等号左边的变量类型来决定
        System.out.println(s);
        System.out.println("------------------------------");


        // 关系运算符/比较运算符
        int x = 10;
        int y = 10;
        int z = 20;
        System.out.println(x == y);
        System.out.println(x == z);
        System.out.println(x >= y);
        System.out.println(x >= z);
        System.out.println(x != y);
        System.out.println(x != z);
        System.out.println(x > y);
        System.out.println(x > z);
        System.out.println(x < y);
        System.out.println(x < z);
        System.out.println("-------------------------");

        // 练习：《斯坦福练习题》
        /*您和您的约会对象在餐厅里正在约会。
        * 键盘录入两个整数，表示您和您的约会对象的衣服的时髦程度。
        * （手动录入0--10之间的整数，不能录入其他的）
        * 如果你的时髦程度大于你对象的时髦程度，相亲就成功，输出true。否则输出false。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你衣服的时髦程度");
        int myFashion = sc.nextInt();
        System.out.println("请输入你对象的衣服的时髦程度");
        int girlFashion = sc.nextInt();

        // 把我们衣服的时髦度和女孩衣服的时髦度进行对比
        boolean result = myFashion > girlFashion;

        // 打印结果
        System.out.println(result);




    }
}
