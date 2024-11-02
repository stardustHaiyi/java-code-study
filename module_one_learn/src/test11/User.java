package test11;

public class User {
    // 私有化成员变量
    private String username;
    private String password;
    private String personID;
    private String phoneNumber;

    // 空参构造和带全部参数的构造方法
    public User(){

    }

    public User(String username,String password,String personID,String phoneNumber){
        this.username = username;
        this.password = password;
        this.personID = personID;
        this.phoneNumber = phoneNumber;
    }

    // get和set方法
    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPersonID(){
        return personID;
    }

    public void setPersonID(String personID){
        this.personID = personID;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
}
