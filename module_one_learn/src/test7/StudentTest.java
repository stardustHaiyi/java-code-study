package test7;

public class StudentTest {
    public static void main(String[] args){
        // 测试类
        // 1.定义一个数组，来存储学生对象的数据
        Student[] arr = new Student[3];

        // 2.创建学生对象
        Student stu1 = new Student(1,"张三",23);
        Student stu2 = new Student(2,"李四",24);
        Student stu3 = new Student(3,"王五",25);

        // 3.把学生对象添加到数组当中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;



        // 要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        Student stu4 = new Student(4,"赵六",26);

        // 唯一性判断
        // 已存在，不用添加
        // 不存在，就可以把学生对象添加到数组
        boolean flag = contains(arr,stu4.getId());
        if (flag){
            // 已存在，不用添加
            System.out.println("当前id重复，请修改id后再进行添加");

        }else {
            // 不存在，就可以把学生对象添加到数组
        }

        // 把stu4添加到数组当中
        // 1.数组已经存满---只能创建一个新的数组，新数组的长度 = 老数组 + 1
        // 2.数组没有存满---直接添加
        int count = getCount(arr);
        if (count == arr.length){
            // 已经存满
            // 创建一个新的数组，长度=老数组的长度+1
            // 然后把老数组的元素，拷贝到新数组当中
            Student[] newArr = creatNewArr(arr);
            // 老数组[stu1,stu2,stu3]
            // 新数组[[stu1,stu2,stu3,null]]
            // 把stu4添加进去
            newArr[count] = stu4;

            // 要求2：添加完毕之后，遍历所有学生的信息.
            printArr(newArr);

        }else {
            // 没有存满
            // [stu1,stu2,null]
            // getCount获取到的是2，表示数组当中已经有了2个元素
            // 还有一层意思，如果下一次要添加数据，就是添加到2索引的位置
            arr[count] = stu4;

            // 要求2：添加完毕之后，遍历所有学生的信息.
            printArr(arr);
        }



        // 要求3：通过id删除学生的信息。
        //       如果存在，则删除，如果不存在，提示删除失败。

        // 要找到id在数组中对应的索引
        int index = getIndex(arr,2);
        System.out.println(index);
        if (index >= 0){
            // 如果存在，则删除
            arr[index] = null;
            // 要求4：删除完毕之后，遍历所有学生信息。
            // 遍历数组
            printArr(arr);
        }else{
            // 如果不存在，则提示删除失败
            System.out.println("当前id不存在，删除失败");
        }


        // 要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁。
        // 先要找到id为2的学生对应的索引
        int index1 = getIndex(arr,2);

        // 判断索引
        if (index1 >= 0){
            // 存在，则将她的年龄+1
            Student stu = arr[index1];
            // 把原来的年龄拿出来
            int newAge = stu.getAge() + 1;
            // 把+1之后的年龄塞回去
            stu.setAge(newAge);
            // 遍历数组
            printArr(arr);

        }else {
            // 不存在，则直接提示
            System.out.println("当前id不存在，修改失败");
        }

    }


    // 定义一个方法
    // 1.我要干嘛？  找到id在数组中的索引
    // 2.我干这件事需要什么？   数组 id
    // 3.需不需要返回   必须返回
    public static int getIndex(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            // 依次得到每一个学生对象
            Student stu = arr[i];
            // 对stu进行一个非空判断
            if (stu != null){
                int sid = stu.getId();
                if (sid == id){
                    return i;
                }
            }
        }
        // 当循环结束后，还没有找到就表示不存在
        return -1;   // 因为这世界上不存在 -1 索引

    }



    // 定义一个方法，遍历数组 (要求2)
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null){
                System.out.println(stu.getId() + "," + stu.getName() + "," + stu.getAge());
            }

        }

    }



    // 定义一个方法。创建一个新的数组
    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length + 1];

        // 循环遍历得到老数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            // 把老数组中的元素添加到新数组当中
            newArr[i] = arr[i];

        }
        // 把新数组返回
        return newArr;

    }



    // 定义一个方法判断数组中已经存了几个元素
    public static int getCount(Student[] arr){
        // 定义一个计数器
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){  //数组的默认值是null
                count++;
            }

        }
        // 当循环结束后，我就知道了数组中一共有几个元素
        return count;

    }



    // 1.我要干嘛？  唯一性判断
    // 2.我干这件事需要什么？   数组 id
    // 3.需不需要返回   必须返回
    public static boolean contains(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            // 依次获取数组中每一个学生对象
            Student stu = arr[i];
            if (stu != null){
                // 获取数组中学生对象的id
                int sid = stu.getId();
                // 比较
                if (sid == id){
                    return true;
                }
            }
        }
        return false;

    }
}
