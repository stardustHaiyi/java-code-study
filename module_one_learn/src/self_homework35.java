public class self_homework35 {
    public static void main(String[] args){
        // 练习1 小老虎吃包子
        // 小老虎吃包子，第三个包子有虫子，跳过

        // 1.跳过某一次循环
        for (int i = 1;i <= 5;i++){
            if(i == 3){
                // 结束本次循环，继续下次循环。
                continue;
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }
        System.out.println("-----------------------");


        // 练习2 小老虎吃包子
        // 小老虎吃包子，吃完第三个就饱了。
        for (int i = 1;i <= 5;i++){
            System.out.println("小老虎在吃第" + i + "个包子");
            if (i == 3){
                // 结束整个循环
                break;
            }
        }

    }
}
