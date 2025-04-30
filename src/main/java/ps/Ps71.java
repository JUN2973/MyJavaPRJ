package ps;

public class Ps71 {
    public static void main(String[] args) {
        int a = 0;

        for(int i = 100; i <= 300; i++) {
            if(i % 5 == 0 || i % 7 == 0) {
                a += i;
            }
        }
        System.out.println(a);
    }
}
