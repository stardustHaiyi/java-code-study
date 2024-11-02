package test3;
import java.util.Random;  // import 导包不能写在package的上面

public class Role {
    // 私有化成员变量
    private String name;
    private int blood;

    // 构造方法
    // 空参构造方法
    public Role(){

    }

    // 带参构造方法
    public Role(String name,int blood){
        this.name = name;
        this.blood = blood;
    }


    // get 和 set 方法  （尽量先写get，再写set）
    // name
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    // blood
    public void setBlood(int blood){
        this.blood = blood;
    }

    public int getBlood(){
        return blood;
    }




    // 定义一个方法用于攻击别人
    // 思考：谁攻击谁？
    // Role r1 = new Role();
    // Role r2 = new Role();
    // r1.攻击（r2）;
    // 方法的调用者去攻击参数
    public void attack(Role role){
        // 计算造成的伤害1~20
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        // 修改一下挨揍人的血量
        // 剩余血量
        int remainBlood = role.getBlood() - hurt;

        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        // 修改一下挨揍的人的血量
        role.setBlood(remainBlood);

        // this表示方法的调用者
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，" +
                "造成了" + hurt + "点伤害," + role.getName() + "还剩下" + remainBlood + "点血");

    }
}
