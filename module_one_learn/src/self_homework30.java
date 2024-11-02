import java.util.Scanner;


public class self_homework30 {
    public static void main(String[] args){
        // 练习5 求和
        /*
        * 需求：在实际开发中，如果要获取一个范围中的每一个数据时，也会用到循环。
        * 比如：求1-5之间的和*/
        int sum = 0;
        for (int i = 1;i <= 5;i++){
            sum += i; // sum = sum + i;
            // 可以把得到的每一个数字累加到变量sum当中
        }
        // 当循环结束后，表示已经把1-5累加到变量sum当中了
        System.out.println(sum);
        System.out.println("---------------------");


        // 练习6 求1-100累加的和
        int sum1 = 0;  // 变量的作用范围属于大括号 sum1 的作用范围属于大括号（main）
        for (int i = 1;i <= 100;i++){
            sum1 += i;
        }
        System.out.println(sum1);
        // 求和的变量不能定义在循环的里面，因为变量只在所属的大括号中有效
        System.out.println("---------------------");


        // 练习7 求和
        /*
        * 需求：在实际开发中，如果要获取一个范围中的每一个数据，会用到循环。
        * 但是此时，大多数情况下，不会获取所有的数据，而是获取其中符合要求的数据。
        * 此时就需要循环和其他的语句结合使用了。
        * 比如：求1-100之间的偶数和*/
        int sum2 = 0;

        // 获取1-100之间的所有数
        for (int i = 1;i <= 100;i++){
            // 累加求和（先判断，在求和）
            if (i % 2 == 0){
                sum2 += i;
            }
        }
        // 打印sum2
        System.out.println(sum2);
        System.out.println("---------------------");


        // 练习8 统计满足条件的数字
        /*
        * 需求：键盘录入两个数字，表示一个范围。
        * 统计这个范围中。
        * 技能被3整除，又能被5整除的数字有多少个？*/

        // 键盘录入两个数，表示范围
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1个数");
        int number1 = sc.nextInt();
        System.out.println("请再次输入1个数");
        int number2 = sc.nextInt();

        // 比较两个数的大小来确定这个范围的起始于结束
        int max = number1 > number2 ? number1 : number2;
        int min = number1 < number2 ? number1 : number2;

        // 定义一个计数器
        int counter = 0;

        // 得到这个范围内的每一个数字
        for (int i = min;i <= max;i++){
            // 判断并记录需要数字个数
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("满足条件的数字是" + i);
                counter++;
            }
        }
        System.out.println("个数为：" + counter);
    }
}
