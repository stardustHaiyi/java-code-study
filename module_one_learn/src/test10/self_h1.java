package test10;

import java.util.ArrayList;

public class self_h1 {
    public static void main(String[] args){
        // 练习

        // 1.创建集合对象
        ArrayList<Phone> list = new ArrayList<>();

        // 2.创建对象
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子",2999);

        // 3.将手机对象加入到集合里面
        list.add(p1);
        list.add(p2);
        list.add(p3);

        // 4.调用方法
        ArrayList<Phone> phoneInfoList = getPhoneInfo(list);

        // 5.遍历集合
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone phone = phoneInfoList.get(i);
            System.out.println(phone.getBrand() + "," + phone.getPrice());

        }

    }

    // 1.我要干嘛？  将价格低于3000的手机信息返回(查询手机信息)
    // 2.我干这件事需要什么东西？  list
    // 3.调用处需要返回值吗？  需要

    // 技巧：
    // 如果我们要返回多个数据，可以把这些数据先放到一个容器当中，再把容器返回
    // 容器如 ： 集合 数组      集合在添加的时候不需要考虑长度的问题

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        // 定义一个集合，用于存储价格低于3000的手机对象
        ArrayList<Phone> resultList = new ArrayList<>();
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            // i 是索引  list.get(i)是元素/手机对象
            Phone p = list.get(i);
            int price = p.getPrice();
            // 如果当前手机的价格低于3000，那么就把手机的对象添加到resultList中
            if (price < 3000){
                resultList.add(p);
            }
        }
        // 当循环结束后
        return resultList;  // 注意：返回的是一个集合

    }
}
