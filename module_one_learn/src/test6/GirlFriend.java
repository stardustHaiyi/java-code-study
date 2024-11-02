package test6;

public class GirlFriend {
    // 私有化成员变量
    private String name;
    private int age;
    private char gender;
    private String hobby;



    // 构造方法
    // 空参构造
    public GirlFriend(){

    }

    // 带参构造
    public GirlFriend(String name,int age,char gender,String hobby){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }



    // get set 方法
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


    // gender
    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }


    // hobby
    public String getHobby(){
        return hobby;
    }

    public void setHobby(String hobby){
        this.hobby = hobby;
    }

}
