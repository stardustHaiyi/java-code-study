import java.util.Random;
import java.util.Scanner;


public class self_homework77 {
    public static void main(String[] args) {
        // 练习  双色球系统  《《重要练习》》
        // 需求;
        /*
         * 投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1---33中选择。
         * 蓝色球号码从1---16中选择。*/

        // 1.生成中奖号码
        int[] arr = createNumber();
        System.out.println("============================");
        System.out.println("中奖号码为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("============================");

        // 2.用户输入彩票号码(红球+蓝球)
        int[] userInputArr = userInputNumber();
        // 3.判断用户的中奖情况
        // 红球 蓝球
        int redCount = 0;
        int blueCount = 0;

        // 判断红球
        for (int i = 0; i < userInputArr.length - 1; i++) {
            // 这里面的判断条件一定是 length - 1 ，因为我们值判断红球
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (redNumber == arr[j]) {  // 与顺序无关，只要有这个值就行
                    redCount++;
                    // 如果找到了，那么后面的数字就没必要继续比较了
                    // 跳出内循环，继续判断下一个红球号码是否中奖
                    break;
                }
            }
        }

        // 判断蓝球
        int blueNumber = userInputArr[userInputArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }


        // 根据红球和蓝球的个数来判断中奖情况
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你，中奖1000万");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你，中奖500万");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你，中奖3000");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你，中奖200");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你，中奖10");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你，中奖5");
        } else {
            System.out.println("谢谢参与，谢谢惠顾");
        }
    }



    public static int[] userInputNumber() {
        // 1.创建一个数组，用于添加用户购买的彩票号码
        // 6个红球，1个蓝球 数组的长度为7
        int[] arr = new int[7];

        // 2.利用键盘录入让用户输入
        Scanner sc = new Scanner(System.in);
        // 让用户输入红球号码
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
            // 判断红球号码是否在 1---33 这个范围之内 而且 是唯一不重复的
            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    // 不存在
                    // 有效的，可以添加到数组当中
                    arr[i] = redNumber;
                    i++;  // 添加完成之后，你的索引才能变化
                } else {
                    // 存在
                    System.out.println("当前红球号码已经存在，请重新输入");
                }
            } else {
                System.out.println("当前的红球号码超出范围");
            }
        } // 这个循环结束之后，表示所有的红球已经添加完毕

        // 用户输入蓝球号码
        while (true) {   // 选中这段代码 ctrl + alt + t 用一个while循环将它包裹起来
            System.out.println("请输入蓝球号码");
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;   // 如果为真，就结束while循环
            } else {
                System.out.println("蓝球号码超出范围");
            }
        }  // 当while循环结束后，表示蓝球添加完毕

        // 当红球和蓝球都添加完毕后，就可以直接返回数组
        return arr;
    }


    public static int[] createNumber(){
        // 1.创建数组用于添加中奖号码
        // 6个红球，1个蓝球 数组的长度为7
        int[] arr = new int[7];

        // 2.随机生成号码并添加到数组当中
        // 红球：不能重复的 1，2，3，4，5，6
        // 蓝球：可以跟红球号码重复 5

        // 生成红球号码并添加到数组当中
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            // 获取红球号码
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr,redNumber);
            if (!flag){
                // 把红球号码添加到数组当中
                arr[i] = redNumber;
                i++;  //每次添加完之后，i都要加加
            }
        }

        // 生成蓝球号码并添加到数组当中
        int blueNumber = r.nextInt(16) + 1;
        arr[arr.length - 1] = blueNumber;

        return arr;  // 注意：return返回的类型是数组时，只用写 数组名 即可

    }


    // 创建一个方法,判断是否重复,和《练习  抢红包》中的思路一样
    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
