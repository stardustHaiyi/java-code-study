import java.util.ArrayList;

public class self_homework120 {
    public static void main(String[] args){
        // 练习 《集合的遍历方式》
        /*
        * 需求：
        * 定义一个集合，添加字符串，并进行遍历
        * 遍历格式参照：[元素1，元素2，元素3]。*/

        // 1.创建集合
        ArrayList<String> list = new ArrayList<>();

        // 2.添加元素
        list.add("点赞了吗？");
        list.add("收藏了吗？");
        list.add("投英镑了吗？");
        list.add("转发了吗？");

        // 3.遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1){
                System.out.print(list.get(i)); // 如果是最后一个元素，那么就不加逗号
            }else{
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("]");


    }
}
