public class self_homework59 {
    public static void main(String[] args){
        // 练习  比较大小
        // 需求：定义方法，比较两个长方形的面积。


        // 方法的调用
        // 调用方法获取长方形的面积，再进行比较
        double area1 = getArea(5.3,1.7);
        double area2 = getArea(2.4,2.7);

        if (area1 > area2){
            System.out.println("第一个长方形更大");
        }else{
            System.out.println("第二个长方形更大");
        }
    }

    // 定义一个方法求长方形的面积
    // 1.我要干什么？  求长方形的面积
    // 2.需要什么？  长 和 宽
    // 3.方法的调用处是否需要继续使用方法的结果。
    public static double getArea(double len,double width){
        double area = len * width;
        return area;
    }


    // 注意：方法与方法之间是平级关系，不能互相嵌套定义
    // return 下面不能编写其他代码，因为永远执行不到，属于无效的代码
    // void 是没有返回值的，可以不写return，但是写上也不算错（return后面不能加任何东西）
}
