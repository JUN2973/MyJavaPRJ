package ps;

class Rabbit1 {
    String shape;
    int xPos;
    int yPos;

    Rabbit1 () {
        shape = "토끼";
    }

    void setPosition (int x, int y) {
        xPos = x;
        yPos = y;
    }
}

public class Ps61{
    public static void main(String[] args) {
        Rabbit1 rabbit1 = new Rabbit1();

        System.out.println("rabbit 1의 모양 : " + rabbit1.shape);
    }
}
