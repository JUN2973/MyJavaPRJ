package ps;

interface Rabbit10 {
    abstract void sleep();
}

class HouseRabbit01 implements Rabbit10 {
    public void sleep() {
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}

class MountainRabbit01 implements Rabbit10 {
    public void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}

public class Ps76 {
    public static void main(String[] args) {
        HouseRabbit01 hRabbit = new HouseRabbit01();
        MountainRabbit01 mRabbit = new MountainRabbit01();

        hRabbit.sleep();
        mRabbit.sleep();
    }
}
