public class self_homework26 {
    public static void main(String[] args){
        // switch 新特性  JDK12
        // 需求：1 2 3--> 一 二 三
        /*int number = 1;
        switch(number){
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
            default:
                System.out.println("没有这种选项");
                break;
        }*/

        int number = 1;
        switch(number) {
            case 1 -> {
                System.out.println("一");
            }
            case 2 -> {
                System.out.println("二");
            }
            case 3 -> {
                System.out.println("三");
            }
            default -> {
                System.out.println("没有这种选项");
            }
        }
            // 这种 ”->“ 写法你可以不用写break语句，并且不会触发case穿透。相当于利用大括号将break简化了
            // 如果case里面的代码只有一行，那么大括号也可以省略

            // 例如：
            int number1 = 10;
            switch(number1){
                case 10 -> System.out.println("十");
                case 11 -> System.out.println("十一");
                case 12 -> System.out.println("十二");
                case 13 -> System.out.println("十三");
                default -> System.out.println("没有这个选项"); // JDK12新特性
            }
    }

    // ctrl + shift +/ 只有开头和结尾有注释符号
}
