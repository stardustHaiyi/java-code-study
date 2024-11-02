public class self_homework2 {
    public static void main(String[] args){
        // 关于++  （先++）与（后++）

        // 先定义一个变量 x
        int x = 10;
        // 后++ 即：x++
        // 先把 x 变量中的值拿出来用，赋值给 y ，然后再进行自增
        int y = x++;  // x = 11  y = 10
        System.out.println(x);
        System.out.println(y);
        System.out.println("=======================================");



        // 后++ 即：++x
        // 先把 x 进行自增，然后把自增后的结果赋值给左边的变量
        // 先把 x 自增，变成12，然后再把结果12赋值给 z
        int z = ++x;  // x = 12  z = 12
        System.out.println(x);
        System.out.println(z);
    }



}
