public class self_homework82 {
    public static void main(String[] args){
        // 成员变量和局部变量

        // 成员变量：
        /*
        * 定义在方法外面，类的里面*/

        // 局部变量：
        /*
        * 定义在方法里面*/


        // 当成员变量和局部变量名字相同时，就分不清到底是
        // private int age 中的age，还是局部变量中的age
        // 范例：
        /*
        * public class GirlFriend{
        *   private int age1;
        *   public void method(){
        *       int age2 = 10;
        *       System.out.println(age3);
        *   }
        * }
        *
        * age1，age2，age3，都看成是完全一样的age。
        * age1：成员变量
        * age2：局部变量
        * 问：输出语句中的age3究竟是哪个age？是age1还是age2？
        *   答：就近原则，谁离他近就是谁。age2离age3最近，所以输出语句中的age3应该是10
        * 问：如果强行想要使用成员变量age1该怎么办？
        *   答：用this关键字，即在输出语句将age3换成 this.age */


        System.out.println("this关键字");
    }
}
