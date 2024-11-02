package test5;
import java.util.Scanner;

public class CarTest {
    public static void main(String[] args){
        // 测试类
        // 1.创建一个数组用来存储3个汽车对象
        Car[] arr = new Car[3];

        // 2.创建汽车对象，数据来源于键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            // 创建汽车对象
            Car c = new Car();  // 因为什么都不知道，所以用空参
            // 录入汽车的品牌
            System.out.println("请输入汽车的品牌");
            String brand = sc.next();  // 用一个变量brand来接收
            c.setBrand(brand); // 把brand设置进去
            // 录入汽车的价格
            System.out.println("请输入汽车的价格");
            int price = sc.nextInt();
            c.setPrice(price);
            // 录入汽车的颜色
            System.out.println("请输入汽车的颜色");
            String color = sc.next();
            c.setColor(color);

            // 把汽车对象添加到数组当中
            arr[i] = c;  // 第一次循环的时候，把汽车对象c放到0索引，然后i++，以此类推
        }



        // 3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            //System.out.println(car);  // test5.Car@7eda2dbb 打印出来的是地址
            System.out.println(car.getBrand() + "," + car.getPrice() + "," + car.getColor());
        }

    }
    // 创建汽车对象的代码不能写在循环的外面，一定要写在循环的里面
}
