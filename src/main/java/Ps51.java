import java.util.Scanner;

public class Ps51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 T를 입력하세요: ");

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a + b);
        }
            sc.close();
    }
}