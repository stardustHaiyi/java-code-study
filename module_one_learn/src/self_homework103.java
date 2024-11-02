public class self_homework103 {
    public static void main(String[] args){
        // StringBuilder 中的 toString()

        // 1.创建对象
        StringBuilder sb = new StringBuilder();

        // 2.添加字符串
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");

        // 打印
        System.out.println(sb);  //aaabbbcccddd   注意：此时的sb是StringBuilder类型的，不是String类型的
        // 这时的sb只是一个容器，来帮助我们操作字符串的工具


        // 3.再把StringBuilder变回字符串
        String str = sb.toString();  // 变成字符串后，我们就可以使用字符串中的方法了
    }
}
