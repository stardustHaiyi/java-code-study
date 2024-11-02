import java.util.ArrayList;

public class self_homework119 {
    public static void main(String[] args){
        // 练习 集合的增删改查

        // 1.创建一个集合
        ArrayList<String> list = new ArrayList<>();

        // 2.添加元素
        boolean result = list.add("aaa"); // add 不管添加什么都是可以添加进去的,所以可以不用管返回值
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");

/*        // 3.删除元素
        boolean result2 = list.remove("aaa"); // 存在返回true，不存在返回false
        // 根据索引删除
        String str = list.remove(0);  // 将被删除的元素（索引元素）返回
        System.out.println(list);*/

/*        // 4.修改元素
        String result2 = list.set(1,"ddd"); // 将索引1上的元素覆盖
        System.out.println(result2);

        System.out.println(list);*/

/*        // 5.查询元素
        String s = list.get(0);
        System.out.println(s);*/

        // 6.遍历  list.fori
        for (int i = 0; i < list.size(); i++) {
            // i 索引
            // list.get(i) 元素
            String str = list.get(i);
            System.out.println(str);

        }

        System.out.println(list);




    }
}
