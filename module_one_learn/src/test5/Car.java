package test5;

public class Car {
    // 私有化成员变量
    private String brand;
    private int price;
    private String color;


    // 构造方法
    // 空参构造
    public Car(){

    }

    // 有参构造
    public Car(String brand,int price,String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }


    // get set 方法
    // brand
    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }


    // price
    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }


    // color
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
