package test5;

public class GoodsTest {
    public static void main(String[] args){
        // 1.创建一个数组
        Goods[] arr = new Goods[3];

        // 2.创建3个商品对象
        Goods g1 = new Goods("001","华为P40",5999.0,100);
        //点击括号里面，然后 ctrl + p 可以查看参数
        Goods g2 = new Goods("002","保温杯",227.0,50);
        Goods g3 = new Goods("003","枸杞",12.7,70);

        // 3.把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        // 4.遍历数组
        for (int i = 0; i < arr.length; i++) {
            // i 表示索引
            // arr[i] 表示数组中的元素
            Goods goods = arr[i];   //注意：这里的数据类型是Goods
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice() + "," + goods.getCount());
        }

        //System.out.println(g1.getName());   // 华为P40
    }
}
