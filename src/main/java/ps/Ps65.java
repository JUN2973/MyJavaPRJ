package ps;

class Rabbit5{

    String shape = "";

    Rabbit5(String value) {

        this.shape = value;
    }

}

public class Ps65 {
    public static void main(String[] args) {

        Rabbit5 rabbit1 = new Rabbit5("원");
        Rabbit5 rabbit2 = new Rabbit5("삼각형");
        Rabbit5 rabbit3 = new Rabbit5("토끼");

        System.out.printf("토끼1 객체의 모양은 [%s]입니다.\n", rabbit1.shape);
        System.out.printf("토끼2 객체의 모양은 [%s]입니다.\n", rabbit2.shape);
        System.out.printf("토끼3 객체의 모양은 [%s]입니다.\n", rabbit3.shape);
    }
}

