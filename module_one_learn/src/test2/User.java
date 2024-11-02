package test2;

public class User {
    // 成员变量 （私有化）
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    // 构造方法
    // 空参构造
    public User(){

    }

    // 带参构造
    public User(String username,String password,String email,String gender,int age){
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;

    }


    // get 和 set 方法
    // username
    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    // password
    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    // email
    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    // gender
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    // age
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    // 快捷键位 alt + insert
    // 或者是 alt + fn + insert  按下shift不松，然后全选，或者ctrl + a 全选
    // 插件 PTG 1秒生成标准的JavaBean  file-->settings-->Plugins-->MarketPlace-->搜索ptg
}
