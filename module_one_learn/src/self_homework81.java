public class self_homework81 {
    public static void main(String[] args){
        // 面向对象的三大特征：封装，继承，多态

        // 封装
        /*
        * 1.告诉我们，如何正确的设计对象的属性和方法
        * 2.对象代表什么，就得封装对应的数据，并提供数据对应的行为
        *   例如：人画圆，画圆的方法应该写在圆的类里面，而不是人的类里面
        *           因为画圆需要知道圆的半径，而半径是圆的属性。
        *           人画圆，圆是自己画的，而不是人画的，人只是调用了画圆的方法而已
        *           如：人关门，张三拿刀砍了李四（李四自己凉了）
        * 3.降低我们的学习成本，可以少学，少记，或者说压根不用学，不用记对象有哪些方法，有需要时去找就行了
        * 4.让编程变得简单，有什么事，找对象，调方法就行。
        * */


        // private关键字
        /*
        * 1.是一个权限修饰符
        * 2.可以修饰成员（成员变量和成员方法）
        * 3.被private修饰的成员只能在本类中才能访问（在其他的类里面是不能被使用的）
        *
        * */

        // 范例：
        /*
        * public class GirlFriend{
        *   private int age;
        *   // set（赋值）
        *   public void setAge(int a){
        *
        *       if(a >= 18 && a <= 50){
        *           age = a;
        *       }else{
        *           System.out.println("非法数据");
        *       }
        * }
        *
        *
        * // get（获取）
        * public int getAge(){
        *       return age;
        *   }
        *
        * }*/


        // 测试类就是其他类

        // 针对每一个私有化的成员变量，都提供get和set方法
        // set 方法：给成员变量赋值  用public修饰
        // get 方法：对外提供成员变量的值  用public修饰

        System.out.println("封装，private，get，set方法");
    }
}
