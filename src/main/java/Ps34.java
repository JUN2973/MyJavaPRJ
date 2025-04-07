import java.util.Scanner;

public class Ps34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        System.out.println("점수 입력: ");

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else
            System.out.println("F");

        System.out.println(" 학점입니다. ");

        sc.close();
    }
}


