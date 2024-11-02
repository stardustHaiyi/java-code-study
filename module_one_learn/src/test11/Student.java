package test11;

public class Student {
    // 1.私有化成员变量
    private String id;
    private String name;
    private int age;
    private String address;

    // 2.空参构造和带全部参数的构造方法
    public Student(){

    }

    public Student(String id,String name,int age,String address){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 3.get和set方法
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
