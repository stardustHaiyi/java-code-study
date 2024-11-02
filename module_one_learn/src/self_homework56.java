public class self_homework56 {
    public static void main(String[] args){
        // 练习  人肉计算机1
        // 需求：定义一个方法，求长方形的周长，将结果在方法中进行打印。

        // 调用方法getLength()
        getLength(5.2,1.3);
    }


    // 1.我要干什么？   求长方形的周长
    // 2.我干这件事，需要什么才能完成？   长和宽
    public static void getLength(double len,double width){
        double result = (len + width) * 2;
        System.out.println(result);
    }
}
