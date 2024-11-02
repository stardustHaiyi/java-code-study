public class self_homework60 {
    public static void main(String[] args){
        // 方法的重载
        /*
        * 1.在同一个类中，定义了多个同名的方法，这些同名的方法具有同种的功能。
        * 2.每个方法具有不同的参数类型或参数个数，这些同名的方法，就构成了重载关系
        *
        * 简单记忆：
        * 同一个类中，方法名相同，参数不同的方法。与返回值无关。
        * 参数不同：个数不同，类型不同，顺序不同*/


        // 练习  方法重载
        // 需求：使用方法重载的思想，设计比较两个整数是否相同的方法。
        // 要求：兼容全整数类型（byte，short，int，long）

        compare(10,20);
    }

    public static void compare(byte b1,byte b2){
        System.out.println("byte");
        System.out.println(b1 == b2);
    }

    public static void compare(short s1,short s2){
        System.out.println("short");
        System.out.println(s1 == s2);
    }

    public static void compare(int i1,int i2){
        System.out.println("int");
        System.out.println(i1 == i2);
    }

    public static void compare(long n1,long n2){
        System.out.println("long");
        System.out.println(n1 == n2);
    }

}
