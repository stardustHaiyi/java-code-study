public class Student {

    // 私有化成员变量
    private String id;
    private String name;
    private int age;
    private String gender;

    // 构造方法 1.空参构造  2.全参数构造
    public Student(){}

    public Student(String id,String name,int age,String gender){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // get 和 set 方法
    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }
}
