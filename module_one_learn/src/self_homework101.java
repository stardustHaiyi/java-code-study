public class self_homework101 {
    public static void main(String[] args){
        // 练习   敏感词替换

        // String replace(旧值，新值) 替换
        // 注意点：字符串本身不会变，只有返回值才是替换之后的结果

        // 1.获取到说的话
        String talk = "你玩的真好，以后不要再玩了，TMD,CNM";

        // 2.定义一个敏感词库
        String[] arr = {"TMD","CNM","SB","MLGB"};

        // 3.循环得到数组中的每一个敏感词，依次进行替换
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
            // 第一次循环：你玩的真好，以后不要再玩了，***,CNM
        }

        // 2.把里面的敏感词“TMD”替换成***
        String result = talk.replace("TMD","***");

        // 3.打印结果
        System.out.println(result);
    }
}
