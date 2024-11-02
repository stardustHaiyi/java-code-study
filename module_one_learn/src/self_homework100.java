public class self_homework100 {
    public static void main(String[] args){
        // 练习   身份证信息查看
        // 最终打印结果为：
        /*
        * 7--14位：出生年月日
        * 17位：性别（奇数男性，偶数女性）
        *
        * 人物信息：
        * 出生年月日：XXXX年X月X日
        * 性别为：男/女
        * */


        // 1.定义一个字符串记录身份证号码
        String id = "321281202001011234";

        // 2.获取出生年月日
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println("人物信息为：");
        System.out.println("出生年月：" + year + "年" + month + "月" + day + "日");

        // 3.获取性别
        char gender = id.charAt(16);  // ’3‘ --- > 3  将字符3变成数字3才能用
        // 利用ASCII码表进行转换
        // '0' ---> 48
        // '1' ---> 49
        // '2' ---> 50
        // '3' ---> 51
        // '4' ---> 52
        // '5' ---> 53
        // '6' ---> 54
        // '7' ---> 55
        // '8' ---> 56
        // '9' ---> 57

        //System.out.println('0' + 0);  // 48

        int num = gender - 48;
        if (num % 2 == 0){
            System.out.println("性别为：女");
        }else {
            System.out.println("性别为：男");
        }



    }
}
