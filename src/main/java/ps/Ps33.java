package ps;

import java.util.Scanner;

public class Ps33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("숫자 입력 ==> ");
        num = sc.nextInt();

        if (num > 100) {
            if (num < 1000) {
                System.out.println("100보다 크고 1000보다 작군요.");
            } else {
                System.out.println("여기는 참입니다.");
            }
        }else {
            System.out.println("음~ 100보다 작군요.");
        }
    }
}
