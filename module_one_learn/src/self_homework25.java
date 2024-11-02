public class self_homework25 {
    public static void main(String[] args){
        // case 穿透
        int number = 10;
        switch(number) {
            case 1:
                System.out.println("number的值为1");
                break;
            case 10:
                System.out.println("number的值为10");
                //break;
            case 20:
                System.out.println("number的值为20");
                break;
            default:
                System.out.println("number的值不是1，10或20");
                break;
        }
                // 在写switch语句的时候，千万不能省略break，否则会导致case穿透（case穿透
            // 的结果：你可以将switch语句中的所以break给注释掉，会发现每一条语句都会执行）

        //number的值为10
        //number的值为20  case穿透

        // 使用场景：如果多个case的语句体重复了，那么我们考虑用case穿透去简化代码
    }
}
