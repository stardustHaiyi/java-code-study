package com.itbaima;

public class GirlFriend {
    // 注意，本代码中的set和get方法中有名字取得不恰当，优化代码参考 《包test1 中的GrilFriend 类》
    private String name;
    private int age;
    private String gender;

    // 针对每一个私有化的成员变量，都提供get和set方法
    // set 方法：给成员变量赋值
    // get 方法：对外提供成员变量的值




    // name
    // 作用：给成员变量name进行赋值的
    public void setName(String n){
        name = n;
    }
    // 我们之前说过，起名字要见名知意，这里的 n 显然不符合规矩

    // 作用：对外提供name属性的
    public String getName(){
        return name;
    }



    // age
    // setAge:给成员变量age赋值
    // getAge:对外提供成员变量age的值
    public void setAge(int a){  // 我们之前说过，起名字要见名知意，这里的 a 显然不符合规矩
        if (a >= 18 && a <= 50){
            age = a;
        }else{
            System.out.println("非法数据");
        }
    }

    public int getAge(){
        return age;
    }



    // gender
    // setGender
    // getGender
    public void setGender(String g){
        gender = g;
    }

    public String getGender(){
        return gender;
    }






    // 行为
    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
}
