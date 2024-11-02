public class self_homework57 {
    public static void main(String[] args){
        // 练习  人肉计算机2
        // 需求：定义一个方法，求圆的面积，将结果在方法中进行打印。

        // 调用方法getArea()
        getArea(1.5);
    }

    // 1.我要干什么？   求圆的面积
    // 2.我干这件事，需要什么才能完成？   半径
    public static void getArea(double radius){
        double result = radius * radius * 3.14;
        System.out.println(result);
    }

}
