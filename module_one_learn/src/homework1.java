import java.util.Scanner;
//        导包

public class homework1 {
    public static void main(String[] args){
        /*需求：动物园里有两只老虎，体重分别为通过键盘录入获得，
        请用程序实现判断两只老虎的体重是否相同。
         */

        // 分析：
        // 1.键盘录入两只老虎的体重。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重");
        // new Scanner 在这到题中只用写一次就行
        int weight2 = sc.nextInt();

        // 2.比较
        // true  false
        // 相同   不同
        // System.out.println(weight1==weight2);

        String result = weight1==weight2?"相同":"不同";
        // weight1 等于 weight2 吗？等于（true）就是“相同”，不等于（false）就是“不同”
        System.out.println(result);
    }
}
