package test7;

public class Student {
    // 私有化成员变量
    private int id;
    private String name;
    private int age;


    // 构造方法
    // 空参构造
    public Student(){

    }

    // 带参构造
    public Student(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }



    // get set 方法
    // id
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }


    // name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    // age
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
