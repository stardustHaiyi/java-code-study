public class self_homework17 {
    public static void main(String[] args){
        // & 并且
        // 两边都为真，结果才是真
        System.out.println(true & true);
        System.out.println(false & false);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println("--------------------");


        // | 或者
        // 两边都为假，结果才是假
        System.out.println(true | true);
        System.out.println(false | false);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println("--------------------");


        // ^ 异或
        // 相同为false，不同为true
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println("--------------------");


        // ! 逻辑非 取反
        // 注意，取反的感叹号不要写多次，要么不写，要么只写一次
        System.out.println(!false);
        System.out.println(!true);

    }
}
