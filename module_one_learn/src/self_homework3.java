public class self_homework3 {
    //制表符的使用方法
    //制表符的作用是补空格（内容加上空格一共占8位数）
    public static void main(String[] args){
        System.out.println("name"+"age");
        System.out.println("name"+"\t"+"age");
        //name加上制表符（空格）一共有8位
        System.out.println("name"+'\t'+"age");
        //注意制表符的斜线从左向右倾斜。制表符可以用双引号，也可以用单引号
        //制表符只与前面的东西有关联
        System.out.println("-------------------------------");

        System.out.println("Tom"+23);
        System.out.println("Jhon"+"\t"+"10");
        System.out.println("Tom"+"\t"+"23");
        System.out.println("-------------------------------");
        System.out.println("macbook"+'\t'+"1");
        System.out.println("iphone"+'\t'+"1");
        System.out.println("-------------------------------");
        System.out.println("leanou"+'\t'+"me");
        System.out.println("ou"+'\t'+"1222");
        System.out.println("oub"+'\t'+"22");
        System.out.println("oub"+"\t"+"22");
        System.out.println("-------------------------------");
        System.out.println("name"+'\t'+"age");
        System.out.println("tom"+'\t'+"23");//3(制表符前面有3位)
        System.out.println("to"+'\t'+"23");//2
        System.out.println("t"+'\t'+"23"); //1
        System.out.println("-------------------------------");
        System.out.println("timb"+'\t'+"23");//4
        System.out.println("timbl"+'\t'+"23");//5
        System.out.println("timblm"+'\t'+"23");//6
        System.out.println("timblmn"+'\t'+"23");//7
        System.out.println("timblmna"+'\t'+"23");//8
        /*测试得出结论：如果制表符前面的字符串长度小于4，那么补充空格加上字符串长度最多为4
        如果制表符前面的字符串长度大于4小于8，那么补充空格加上字符串长度最多为8，
        如果制表符前面的字符串长度等于8，那么补充空格为4*/

        // 空类型的字面量 null
        System.out.println("null");//null 以字符串的形式

        // 字面量
        // 1.什么是字面量：告诉程序员数据在程序中的书写格式

        //2.java中的字面量有：整数，小数，字符串，字符，布尔，空

        //3.一些特殊字面量；制表符（\t）  空类型(null)








    }
}
