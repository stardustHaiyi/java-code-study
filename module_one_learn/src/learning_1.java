import java.util.Scanner;

public class learning_1 {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println(3);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        int a = sc.nextInt();  //注意数据类型
        System.out.println(a);
        int number_1 = 10;
        int number_2 = 30;
        int number_3 = 27;
        int mid = number_1 > number_2?number_1:number_2; //三元比较
        int max = mid > number_3?mid:number_3;
        System.out.println(max);

    }
}
