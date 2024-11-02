package test1;

public class Student {
    private String name;
    private int age;


    // 构造方法
    // 如果我们没有写任何构造方法，那么虚拟机会给我们加上一个空参构造方法

    // 空参构造
    public Student(){   // 注意：不能写void，因为没有任何类型的返回,只能写 修饰符 + 方法名（方法名要和类名完全一致）
        System.out.println("看看我执行了吗");
    }

    // 有参构造
    public Student(String name,int age){  // 把成员变量全写进括号里
        this.name = name;
        this.age = age;
    }


    // name get set
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;  // 返回不写this
    }



    // age get set
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
