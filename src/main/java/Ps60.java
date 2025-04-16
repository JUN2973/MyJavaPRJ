    class Rabbit {
        String shape;
        int xPos;  //전역변수
        int yPos;

        void setPosition(int x, int y) {
            this.xPos = x;   //this는 class를 의미한다
            this.yPos = y;

            System.out.println("Rabbit setPostion(" + x + ", " + y + ")");
        }
}

public class Ps60{
    public static void main(String[] args){

        Rabbit rabbit1 = new Rabbit();
        Rabbit rabbit2 = new Rabbit();
        Rabbit rabbit3 = new Rabbit();

        rabbit1.shape = "원";
        rabbit2.shape = "삼각형";
        rabbit3.shape = "토끼";

        rabbit1.setPosition(100, 100);
        rabbit2.setPosition(-100, 100);
        rabbit3.setPosition(100, -100);

    }
}
