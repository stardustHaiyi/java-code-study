public class StudentTest {
    public static void main(String[] args){
        // 定义一个数组，有 new关键字 都是在堆内存中开辟一个新空间
        Student[] arr = new Student[10];

        // 创建类实例对象
        Student s1 = new Student("001","张三",18,"男");
        Student s2 = new Student("002","李四",19,"男");
        Student s3 = new Student("003","王五",20,"女");
        Student s4 = new Student("004","陈六",21,"男");
        Student s5 = new Student("005","阿坤",22,"女");

        // 将实例放到 arr数组中
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        arr[3] = s4;
        arr[4] = s5;

        // 遍历数组arr，并且输出
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
            System.out.println(arr[i].getName());

        }

    }
}
