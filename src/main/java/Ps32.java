import java.util.Scanner;

public class Ps32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("숫자를 입력:");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }


        System.out.println("프로그램 끝!");


        sc.close();
    }
}
