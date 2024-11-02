package test5;

public class Goods {
    // 私有化成员变量
    private String id;
    private String name;
    private double price;
    private int count;


    // 构造方法
    // 空参构造
    public Goods(){

    }

    // 有参构造
    public Goods(String id,String name,double price,int count){
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }


    // get set 方法
    // id
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }


    // name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    // price
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }


    // count
    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }
}
