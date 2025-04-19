package ps;

class Rabbit7 {
    private String shape;
    private int xPos;
    private int yPos;
    public int number;

    void setPosition(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
}
public class Ps67 {
    public static void main(String[] args) {

        Rabbit7 rabbit = new Rabbit7();

        rabbit.setPosition(100, 200);

        rabbit.number = 1;

    }
}
