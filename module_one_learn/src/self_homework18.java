public class self_homework18 {
    public static void main(String[] args){
        // (三元运算符/三元表达式)格式
        // 格式： 关系表达式 ？ 表达式1 ：表达式2；

        // 练习：
        // 1.定义两个变量记录两个整数
        int number1 = 10;
        int number2 = 20;

        // 2.使用三元运算符获取两个整数的较大值
        // 整个三元运算符的结果必须被使用
        int result = number1 > number2 ? number1 : number2;
        System.out.println(result);
        System.out.println(number1 > number2 ? number1 : number2);
    }
}
