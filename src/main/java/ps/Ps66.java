package ps;

class Rabbit6{

    String shape = "";

    Rabbit6() {
        System.out.println("난 자바가 기본으로 만들어주는 생성자");
    }
    Rabbit6(String value){
        this.shape = value;
    }

}
//오버로딩
public class Ps66 {
    public static void main(String[] args) {
        Rabbit6 rabbit1 = new Rabbit6("원");
        Rabbit6 rabbit2 = new Rabbit6("삼각형");
        Rabbit6 rabbit3 = new Rabbit6("토끼");

    }
}



