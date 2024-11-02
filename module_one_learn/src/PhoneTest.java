public class PhoneTest {
    public static void main(String[] args){
        // 创建一个数组（数组的类型是Phone）
        Phone[] arr = new Phone[3];

        // 创建3个对象实例（类Phone 的实例）
        Phone p1 = new Phone("小米","Xiaomi",1999);
        Phone p2 = new Phone("苹果","Apple",5999);
        Phone p3 = new Phone("华为","HUAWEI",4999);

        // 将对象的值放到arr数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        // 遍历数组arr并且输出
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
            System.out.println(arr[i].getBrand());
            System.out.println(arr[i].getPrice());

        }




    }
}
