public class self_homework55 {
    public static void main(String[] args){
        // 目标：掌握带参数方法定义的格式和调用的格式

        // 方法的调用  getSum()
        getSum(10,20);  // 必须是int，并且个数为2

        // 形参：全称形式参数，是指方法定义中的参数
        // 实参：全称实际参数，方法调用中的参数
        // 注意：方法调用时，形参和实参必须一一对应，否则程序将报错

        // 方法定义的小技巧
        // 1.我要干什么？   方法体
        // 2.我干这件事需要什么才能完成？   形参
    }


    // 定义方法  getSum()
    public static void getSum(int num1,int num2){
        int result = num1 + num2;
        System.out.println(result);
    }
}
