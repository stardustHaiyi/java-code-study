package test1;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;


    // name get set 方法
    public void setName(String name){
        this.name = name;   // 名字要见名知意，所以这里右边起名为name，而不是n
    }

    public String getName(){
        return name;
    }


    // age get set 方法
    public void setAge(int age){
        if (age >= 18 && age <= 50){
            this.age = age;
            // age = age;  表示自己赋值给了自己，前面的成员变量还是默认的初始化值 0
        }else{
            System.out.println("非法数据");
        }
    }

    public int getAge(){
        return age;
    }



    // gender get set 方法
    public void setGender(String gender){
        // 局部变量表示测试类中调用方法传递过来的数据
        // 等号的左边：就表示成员位置的gender （开头的private String gender;）
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }


}
