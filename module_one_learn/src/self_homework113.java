public class self_homework113 {
    public static void main(String[] args){
        // 练习  《调整字符串》 第二种写法

        // 1.定义两个字符串
        String strA = "abcde";
        String strB = "bcdea";

        // 2.调用方法进行比较
        boolean result = check(strA,strB);

        // 3.打印输出
        System.out.println(result);

    }
    public static boolean check(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)){
                return true;
            }
        }
        // 所有的情况都比较完毕了，还不一样那么直接返回false
        return false;

    }

    // 定义一个方法
    public static String rotate(String str){
        char[] arr = str.toCharArray();
        // 拿到0索引上的字符
        char first = arr[0];
        // 把剩余的字符依次往前挪一个位置
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        // 把原来0索引上的字符放到最后一个索引
        arr[arr.length - 1] = first;

        // 利用字符数组创建一个字符串对象
        String result = new String(arr);
        return result;
    }
}
