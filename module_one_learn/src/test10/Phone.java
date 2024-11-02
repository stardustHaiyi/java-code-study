package test10;

public class Phone {
    // 1.创建私有化成员变量
    private String brand;
    private int price;

    // 2.空参构造和带全部参数的构造方法
    public Phone(){

    }

    public Phone(String brand,int price){
        this.brand = brand;
        this.price = price;
    }

    // 3.get和set方法
    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}
