import java.util.Scanner;

public class self_homework111 {
    public static void main(String[] args) {
        // 练习   《转换罗马数字》  第二种代码写法
        /*
         * 键盘录入一个字符串，
         * 要求1：长度为小于等于9
         * 要求2：只能是数字
         * 将内容变成罗马数字
         * 下面是阿拉伯数字跟罗马数字的对比关系：
         * Ⅰ-1、Ⅱ-2、Ⅲ-3、Ⅳ-4、Ⅴ-5、Ⅵ-6、Ⅶ-7、Ⅷ-8、Ⅸ-9
         * 注意点：
         * 罗马数字里面是没有0的
         * 如果键盘录入的数字包含0，可以变成“”（长度为0的字符串）*/

        // 1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个字符串");
            str = sc.next();

            // 2.校验字符串是否满足规则
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("当前的字符串不符合规则，请重新输入");
                continue;   // ctrl + alt + t 用循环包住
            }
        }

        // switch
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String s = changeLuoMa(c);
            sb.append(s);
        }
        System.out.println(sb);

    }


    // 定义一个方法，让数字跟数据对应
    public static String changeLuoMa(char number) {
        String str;
        switch (number){
            case '0' -> str = "";
            case '1' -> str = "Ⅰ";
            case '2' -> str = "Ⅱ";
            case '3' -> str = "Ⅲ";
            case '4' -> str = "Ⅳ";
            case '5' -> str = "Ⅴ";
            case '6' -> str = "Ⅵ";
            case '7' -> str = "Ⅶ";
            case '8' -> str = "Ⅷ";
            case '9' -> str = "Ⅸ";
            default -> str = "";
        }

        return str;
    }

    // 定义一个方法，来校验输入的字符串是否满足要求
    public static boolean checkStr(String str) {
        // 要求1：长度小于等于9
        if (str.length() > 9) {
            return false;   // 如果长度大于9，那么直接不满足条件
        }

        // 要求2：只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        // 只有当字符串里面所有的字符全都判断完毕了，我才能认为当前的字符串是符合规则的
        return true;
    }
}
