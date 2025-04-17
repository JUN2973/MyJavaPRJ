package ps;

class Rabbit2 {
        private String shape;
        private int xPos;
        private int yPos;

        void setPosition(int x, int y ) {
            this.xPos = x;
            this.yPos = y;

        }
    }
public class Ps62 {
    public static void main(String[] args) {
        Rabbit2 rabbit = new Rabbit2();

        rabbit.setPosition(100,200);
    }
}
