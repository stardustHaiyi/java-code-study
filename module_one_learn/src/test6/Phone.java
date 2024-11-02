package test6;

public class Phone {
    // 私有化成员变量
    private String brand;
    private double price;
    private String color;



    // 构造方法
    // 空参构造
    public Phone(){

    }

    // 带参构造
    public Phone(String brand,double price,String color){
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
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
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
