public class self_homework4 {
    public static void main(String[] args){
        // 变量
        // 变量的定义格式
        // 数据类型 变量名 = 数据值
        /* 数据类型：为空间中存储的数据，加入类型（限制）整数？小数？。。。
        * 变量名：为空间（小箱子）起的名字
        * 数据值：存在空间里的数值*/
        int a = 10;
        System.out.println(a);

        //1.基本用法
        //定义变量，再进行输出
        int b = 20;
        System.out.println(b);  //20

        //2.变量参与计算
        int c = 30;
        int d = 16;
        System.out.println(c+d); //46

        //3.修改变量记录的值
        a = 50;
        System.out.println(a); //50
        a = 80;
        System.out.println(a); //80

        // 变量注意事项
        /*
        * 1.只能存一个值
        * 2.变量名不允许重复定义
        * 3.一条语句可以定义多个变量
        * 4.变量在使用之前一定要进行赋值
        * 5.变量的作用域范围*/
        System.out.println("----------------------------");

        // 一行定义多个变量
        int x = 100,y = 200, z = 300;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // 变量在使用之前一定要先赋值
        int g;
        g = 2000;
        System.out.println(g);
        // 建议在定义变量的时候直接赋值，不要把赋值分开写


        // 类名一定要和文件的名字保持一致
    }
}
