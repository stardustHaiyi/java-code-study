public class self_homework58 {
    public static void main(String[] args){
        // 带返回值的方法的定义和调用
        // 格式：
        /*
        * public static 返回值的类型 方法名（参数）{
        *   方法体;
        *   return 返回值;
        * }*/

        // 范例：
        /*
        * public static int getSum(int a,int b){
        *   int c = a + b;
        *   reture c;
        * }*/

        // 带返回值的方法的调用
        // 直接调用：   方法名（实参）;
        // 赋值调用：   整数类型 变量名 = 方法名（实参）;
        // 输出调用：   System.out.println(方法名（实参）);



        // 练习：  人肉计算机
        // 需求：定义一个方法，求一家商场每个季度的营业额。
        // 根据方法的结果再计算出全年营业额。


        // 方法的调用
        // 1.直接调用  常用于没有返回值的方法
        // getSum(10,20,30);

        // 2.赋值调用
        // int sum = getSum(10,20,30);
        // System.out.println(sum);

        // 3.输出调用
        // System.out.println(getSum(10,20,30));


        // 1.先计算第一季度的营业额
        int sum1 = getSum(10,20,30);
        // 2.第二季度的营业额
        int sum2 = getSum(20,30,40);
        // 3.第三季度的营业额
        int sum3 = getSum(20,30,40);
        // 4.第四季度的营业额
        int sum4 = getSum(20,30,40);

        // 求全年的总营业额
        int sum = sum1 + sum2 + sum3 + sum4;
        System.out.println(sum);
    }

    // 定义一个方法
    public static int getSum(int num1,int num2,int num3){
        int result = num1 + num2 + num3;
        return result;  // 返回给方法的调用处

    }
}
