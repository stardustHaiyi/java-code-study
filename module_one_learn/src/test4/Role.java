package test4;

import java.util.Random;

public class Role {
    // 私有化成员变量
    private String name;
    private int blood;
    private char gender;
    private String face; // 长相是随机的

    String[] boyfaces = {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces = {"美轮美奂","沉鱼落雁","亭亭玉立","身材姣好","相貌平平","相貌简陋","惨不忍睹"};


    // attack 攻击描述
    String[] attacks_desc = {"%s使出了一招【背心钉】，一掌打向%s。",
    "%s使出了一招【鸡你太美】打向%s",
    "%s使出了一招【一眼顶针】打向%s",
    "%s使出了一招【gnmd】打向%s"};

    // injured 受伤描述
    String[] injureds_desc = {
            "结果%s退了半步，毫发无伤",
            "结果一击命中，%s痛的弯下了腰",
            "结果%s一声惨叫，像滩软泥一般塌了下去"
    };

    // 构造方法
    // 空参构造
    public Role(){

    }

    // 带参构造
    public Role(String name,int blood,char gender){
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        // 随机长相，不是在创建对象时给
        setFace(gender);
    }


    // get set 方法
    // name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // blood
    public int getBlood(){
        return blood;
    }

    public void setBlood(int blood){
        this.blood = blood;
    }



    // gender
    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }



    // face
    public String getFace(){
        return face;
    }

    public void setFace(char gender){
        Random r = new Random();
        // 长相是随机的
        if (gender == '男'){
            // 从boyfaces里面随机长相
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
            
        } else if (gender == '女') {
            // 从girlfaces里面随机长相
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        }else {
            this.face = "面目狰狞";
        }
    }


    // 定义方法
    public void attack(Role role){
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String kungFu = attacks_desc[index];

        // 输出一个攻击的效果
        System.out.printf(kungFu,this.getName(),role.getName());
        System.out.println();

        // 计算造成的伤害1~20
        int hurt = r.nextInt(20) + 1;

        // 修改一下挨揍人的血量
        // 剩余血量
        int remainBlood = role.getBlood() - hurt;

        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        // 修改一下挨揍的人的血量
        role.setBlood(remainBlood);

        // 受伤的描述
        if (remainBlood > 90){
            System.out.printf(injureds_desc[0],role.getName());
        } else if (remainBlood > 40 && remainBlood < 60) {
            System.out.printf(injureds_desc[1],role.getName());
        }else {
            System.out.printf(injureds_desc[2],role.getName());
        }
        System.out.println();


        // this表示方法的调用者
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，" +
                "造成了" + hurt + "点伤害," + role.getName() + "还剩下" + remainBlood + "点血");

    }

    // 定义第二个方法
    public void showRoleInfo(){
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("性别为：" + getGender());
        System.out.println("长相为：" + getFace());
    }
}
