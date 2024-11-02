public class self_homework24 {
    public static void main(String[] args){
        // default的位置和省略
        /*
        * 1.位置：default不一定是写在最下面的，我们可以写在任意位置
        * ，只不过习惯会写在最下面
        *
        * 2.省略：default可以省略，语法不会有问题，但是不建议省略*/

        int number = 100;
        switch(number) {
            //            default:
//                System.out.println("number的值不是1，10或20");
//                break;
            case 1:
                System.out.println("number的值为1");
                break;
            case 10:
                System.out.println("number的值为10");
                break;
            case 20:
                System.out.println("number的值为20");
                break;
//            default:
//                System.out.println("number的值不是1，10或20");
//                break;
        }

        // ctrl + /  选中代码注释
    }
}
