public class Phone {
    // 私有化成员变量，有 prive 的时候就有 get 和 set 方法
    private String name;
    private String brand;
    private double price;

    // 构造方法 1.空参构造  2.全参构造
    public Phone(){}

    public Phone(String name,String brand,double price){
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // get 和 set 方法
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    // 这种写法是标准的JavaBean类：私有化成员变量，空参构造全参构造，get_set方法

}
