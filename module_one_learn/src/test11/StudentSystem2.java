package test11;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class StudentSystem2 {
    public static void main(String[] args){
        // 练习：升级学生管理系统，增加注册，登录，忘记密码功能

        // 定义一个容器去存储注册的信息，这里我们用ArrayList集合
        // 注意：ArrayList集合不能写在下面定义的3个方法里面，要写在main()里面
        // 因为如果写在下面定义的3个方法中的任意一个里面，那么只有那个方法可以用（作用域）

        ArrayList<User> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);  // 创建对象没有必要每次都去创建
        loop:while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1登录 2注册 3忘记密码");
            String choose = sc.next();
            switch(choose){
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> forgetPassword(list);
                case "4" -> {
                    System.out.println("谢谢使用");
                    break loop;
                    //System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    private static void login(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        String personID;
        String phoneNumber;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            // 判断用户名是否存在
            boolean flag = contains(list,username);
            if (!flag){
                System.out.println("用户名：" + username + "未注册，请先注册再登录");
                return;
            }

            // 如果代码执行到这一步，表示用户已经注册
            System.out.println("请输入密码");
            String password = sc.next();

            while (true) {
                String rightCode = getCode();
                System.out.println("当前正确的验证码为：" + rightCode);
                System.out.println("请输入正确的验证码");
                String code = sc.next();
                // 验证码的书写是忽略大小写的
                if (code.equalsIgnoreCase(rightCode)){
                    System.out.println("验证码正确");
                    break;
                }else{
                    System.out.println("验证码错误");
                    continue;
                }
            }

            // 验证用户名和密码是否正确
            // 集合中是否包含用户名和密码
            // 定义一个方法验证用户名和密码是否正确

            // 封装思想的应用:
            // 我们可以把一些零散的数据，封装成一个对象
            // 以后传递参数的时候，只要传递一个整体就可以了，不需要管这些零散的数据。
            User useInfo = new User(username,password,personID = null,phoneNumber = null);
            boolean result = checkUserInfo(list,useInfo);
            if (result){
                System.out.println("登录成功，可以开始使用学生管理系统了");
                // 创建对象调用方法，启动学生管理系统
                StudentSystem ss = new StudentSystem();
                ss.startStudentSystem();
                break;
            }else{
                System.out.println("登录失败，用户名或密码错误");
                if (i == 2){
                    System.out.println("当前账号" + username + "被锁定，请联系客服：xxx-xxxx");
                    // 当前账号被锁定之后，直接结束方法即可
                    return;
                }else{
                    System.out.println("用户名或密码错误，还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }

    private static boolean checkUserInfo(ArrayList<User> list,User useInfo){
        // 遍历集合，判断用户是否存在，如果存在登录成功，如果不存在登录失败
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(useInfo.getUsername())  && user.getPassword().equals(useInfo.getPassword())){
                return true;
            }
        }
        // 当循环结束后还是没有一样的，那么就登录失败
        return false;
    }

    private static void register(ArrayList<User> list){
        // 先写注册，只有注册完后才能 登录 和 忘记密码

        // 把用户，密码，身份证号码，手机号码放到用户对象中
        // 把用户对象添加到集合中

        // 1.键盘录入用户名
        // 虽然在main()里面写过了一次，但在其他的函数里面还要再写一次
        Scanner sc = new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("请输入你的用户名");
            username = sc.next();
            // 开发细节：先验证格式是否正确，再验证是否唯一
            //          因为在以后所有的数据，都是存在数据库中的，如果我们要校验，需要使用到网络资源

            boolean flag1 = checkUsername(username);
            if (!flag1) {  // 如果不满足，我就提示，然后continue回到上面（while那里）重新输入
                System.out.println("用户名格式不满足条件，需要重新输入");
                continue;
            }

            // 校验用户名唯一
            // username到集合中判断是否有存在
            boolean flag2 = contains(list, username);
            if (flag2) {
                // true 用户名已存在，那么当前用户名无法注册，需要重新输入
                System.out.println("用户名" + username + "已存在，请重新输入");

            } else {
                // false 不存在，表示当前用户名可用，可以继续录入下面的其他数据
                System.out.println("用户名" + username + "可用");
                break;
            }
        }

        // 2.键盘录入密码
        // 密码键盘录入两次，两次一致才可以进行注册
        String password;
        while (true) {
            System.out.println("请输入要注册的密码");
            password = sc.next();
            System.out.println("请再次输入要注册的密码");
            String againPassword = sc.next();
            if (!password.equals(againPassword)) {
                System.out.println("两次的密码输入不一致，请重新输入");
                continue;
            } else {
                System.out.println("两次密码一致，继续录入其他数据");
                break;
            }
        }

        // 3.键盘录入身份证号码
        String personID;
        while (true) {
            System.out.println("请输入身份证号码");
            personID = sc.next();
            boolean flag = checkPersonID(personID);
            if (flag){
                System.out.println("身份证号码满足要求");
                break;
            }else{
                System.out.println("身份证号码格式有误，请重新输入");
                continue;  // 可以省略
            }
        }

        // 4.键盘录入手机号码
        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号码");
            phoneNumber = sc.next();
            boolean flag3 = checkPhoneNumber(phoneNumber);
            if (flag3){
                System.out.println("手机号码格式正确");
                break;
            }else{
                System.out.println("手机号码格式有误，请重新输入");
                continue;
            }
        }

        // 把用户名，密码，身份证号码，手机号码放到用户对象中
        User u = new User(username,password,personID,phoneNumber);


        // 把用户对象添加到集合中
        list.add(u);
        System.out.println("注册成功");

        // 遍历集合
        printList(list);
    }

    private static void printList(ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            // i 表示集合中的索引   list.get(i) 表示集合中的元素/用户对象
            User user = list.get(i);
            System.out.println(user.getUsername() + ", " + user.getPassword() + ", " + user.getPersonID() + ", " + user.getPhoneNumber());

        }

    }

    private static boolean checkPhoneNumber(String phoneNumber){
        //长度为11位
        if (phoneNumber.length() != 11){
            return false;
        }
        //不能以0为开头
        if (phoneNumber.startsWith("0")){  // startsWith的括号里面写的是字符串0
            return false;
        }
        //必须都是数字
        for (int i = 0; i < phoneNumber.length(); i++) {
            // i 表示索引   phoneNumber.charAt(i) 表示元素
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')){
                return false;
            }
        }
        // 当循环结束之后，表示每一个字符都在0~9之间
        return true;
    }

    private static boolean checkPersonID(String personID){
        //长度位18位
        if (personID.length() != 18){
            return false;
        }
        //不能以0为开头
        if (personID.startsWith("0")){   // 字符串中，startsWith()表示以什么开头
            // 如果以0开头，那么返回false
            return false;
        }
        //前17位，必须都是数字
        for (int i = 0; i < personID.length() - 1; i++) {
            // i 表示索引    personID.charAt(i) 表示元素
            char c = personID.charAt(i);
            // 如果有一个字符 不在0~9之间，那么直接返回false
            if (!(c >= '0' && c <= '9')){  // '0' 零字符    '9' 九字符
                return false;
            }
        }
        //最后一位可以是数字，也可以是大写X或小写x
        char endChar = personID.charAt(personID.length() - 1);
        if ((endChar >= '0' && endChar <= '9') || (endChar == 'x') || (endChar == 'X')){
            return true;
        }else{
            return false;
        }
    }

    private static boolean contains(ArrayList<User> list,String username){
        // 循环遍历集合得到每一个用户对象
        // 拿着用户对象中的用户名进行比较
        for (int i = 0; i < list.size(); i++) {
            // i 表示 索引     list.get(i) 表示元素/用户
            User user = list.get(i);
            String rightUsername = user.getUsername();
            if (rightUsername.equals(username)){
                // 相同表示存在
                return true;
            }
        }
        // 当循环结束了，表示集合里面所有的用户都比较完毕了，还没有一样的，则返回false
        return false;

    }

    private static boolean checkUsername(String username) {
        // 用户名长度必须在3~15位之间
        int len = username.length();   //方法只调用一次，效率高
        if (len < 3 || len > 15) {
            return false;
        }
        // 当代码执行到这里，表示用户名的长度是符合要求的。
        // 继续校验：只能是字母加数字的组合
        // 循环得到username里面的每一个字符，如果有一个字符不是字母或者数字，那么就返回false
        for (int i = 0; i < username.length(); i++) {
            // i 表示索引   username.charAt(i)表示元素
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                // 如果用户名里面的字符有不在 小写字母，大写字母，数字之间，那么就为假
                return false;
            }
        }
        // 当代码执行到这里，表示什么？
        // 表示：用户名满足两个要求：1长度满足 2内容也满足（字母+数字）

        // 但是不能是纯数字
        // 统计在用户名中，有多少个字母就可以了。
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            // i 表示索引   username.charAt(i)表示元素
            char c =username.charAt(i);
            if ((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')){
                count++;
                break;  // 只要出现字母，就跳出for
            }
        }
        return count > 0;  // 返回跟count比较的结果到底是 真 还是 假
        // 大于0 表示 有字母 符合条件
        // 小于0 表示 没有字母 不符合条件
    }

    private static void forgetPassword(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        boolean flag = contains(list,username);
        if (!flag){
            System.out.println("当前用户" + username + "未注册，请先注册");
            return;
        }

        // 当代码执行到这里，表示用户名存在
        // 键盘录入身份证号码和手机号码
        System.out.println("请输入身份证号码");
        String personID = sc.next();
        System.out.println("请输入手机号码");
        String phoneNumber = sc.next();

        // 比较用户对象中的手机号码和身份证号码是否相同
        // 需要把用户对象通过索引先获取出来
        int index = findIndex(list,username);
        User user = list.get(index);
        if (!(user.getPersonID().equalsIgnoreCase(personID) && user.getPhoneNumber().equals(phoneNumber))){
            System.out.println("身份证号码或手机号码输入有误，不能修改密码");
            return;
        }

        // 当代码执行到这里，表示所有的数据全部验证成功，直接修改即可

        String password;
        while (true) {
            System.out.println("请输入新的密码");
            password = sc.next();
            System.out.println("请再次输入新的密码");
            String againPassword = sc.next();
            if (password.equals(againPassword)){
                System.out.println("两次密码输入一致");
                break;
            }else{
                System.out.println("两次密码输入不一致，请重新输入");
                continue;
            }
        }

        // 直接修改即可
        user.setPassword(password);
        System.out.println("密码修改成功");
    }

    private static int findIndex(ArrayList<User> list,String username){
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(username)){
                // 相同的话直接返回索引
                return i;
            }
        }
        // 当循环结束后还不相同就返回-1
        return -1;
    }

    private static String getCode(){
        // 生成一个验证码
        // 我们之前生成验证码是将所有字母数字放到了数组里面
        // 但是数组你还要考虑长度，比较恶心，所以我们在这里用集合

        // 1.创建一个集合添加所有的大写和小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {  // 快捷书写 26.fori
            list.add((char)('a' + i));  // 'a' + 0 = 97---> (char)97 = 'a'
            list.add((char)('A' + i));
        }

        StringBuilder sb = new StringBuilder();  // 后面要拼接字符串
        // 2.随机抽取4个字符
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            // 获取随机索引
            int index = r.nextInt(list.size());
            // 利用随机索引获取字符
            // 在JDK5 以后 char 和 Character 之间是可以相互转换的
            char c = list.get(index);
            // 把随机字符添加到sb当中
            sb.append(c);
        }

        // 3.把一个随机数字添加到末尾
        int number = r.nextInt(10);
        sb.append(number);

        // 4.如果我们要修改字符串中的内容
        // 先把字符串变成字符数组，在字符数组中修改，然后再创建一个新的字符串
        char[] arr = sb.toString().toCharArray();
        // b.toString() 将容器sb变成字符串
        // sb.toString().toCharArray()  将变成了字符串的sb再变成数组

        // 拿着最后一个索引，跟随机索引进行交换
        int randomIndex = r.nextInt(arr.length);
        // 最大索引指向的元素，跟随机索引指向的元素交换
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        return new String(arr);  // 创建一个新的字符串
    }
}
