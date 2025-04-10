import java.util.Scanner;

public class Ps54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rounds = sc.nextInt();  // 게임 수
        int a = 0;
        int b = 0;
        for (int i = 0; i < rounds; i++) {
            int ascore = sc.nextInt();
            int bscore = sc.nextInt();

            if (a > b) {
                a++;
            } else if (b > a) {
                b++;
            }

        }

        System.out.println( a + " " + b);

        sc.close();
    }
}
