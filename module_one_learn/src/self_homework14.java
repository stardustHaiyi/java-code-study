public class self_homework14 {
    public static void main(String[] args){
        // 数字进行运算时，数据类型不一样不能运算，需要转成一样的，才能进行运算
        /*例子：
        * int a = 10;
        * double b = 12.3;*/

        // 取值范围：
        // (min)byte < short < int< long < float < double(max)

        /*类型转换的分类：
        * 第一：隐式转换（自动类型提升）
        * 将取值 范围小 的数值转换为取值 范围大 的数值
        * byte，short，char三种类型的数据在运算时，都会直接提升为int，然后再进行计算
        *
        * 第二：强制转换
        * 将取值 范围大 的数值转换为取值 范围小 的数值
        * 格式：目标数据类型 变量名 = （目标数据类型）被强转的数据*/

        // 例子
        int a = 10;
        double b = a; // 因为类型不同，所以要进行类型转化才能运算，这里的a会自动转化为10.0
        System.out.println(b); // 注意 a还是10
        System.out.println("-------------------------------");

        int x = 300;
        byte y = (byte) x;
        System.out.println(y); // 强制转化会导致数据出现错误
        System.out.println("-------------------------------");

        byte b1 = 10;
        byte b2 = 20;
        int result = b1 + b2;
        System.out.println(result); //30
        // 将上面的result强制转换成byte
        byte result1 = (byte)(b1 + b2);
        System.out.println(result1); //30

        // 转换的数据过大会发生错误
        byte a1 = 100;
        byte a2 = 100;
        byte result3 = (byte)(a1 + a2);
        System.out.println(result3); // -56


    }
}
