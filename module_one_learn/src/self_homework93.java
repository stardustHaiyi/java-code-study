import java.util.Scanner;


public class self_homework93 {
    public static void main(String[] args){
        // 练习 用户登录
        // 需求：已知正确的用户名和密码，请用程序实现模拟用户登录
        // 总共给3次机会，登录之后，给出相应的提示。


        // 1.定义两个变量记录正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";


        Scanner sc = new Scanner(System.in);
        for (int i = 0;i < 3;i++){
            // 键盘录入用户名和密码
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();

            // 3.比较
            if (username.equals(rightUsername) && password.equals(rightPassword)){
                System.out.println("用户登录成功");
                break;
            }else {
                if (i == 2){
                    System.out.println("账户：" + username + "被锁定，请联系官方");
                }else{
                    System.out.println("用户登录失败，用户名或密码有误，您还剩下：" + (2 - i) + "次机会");
                }

            }
        }

    }
}
