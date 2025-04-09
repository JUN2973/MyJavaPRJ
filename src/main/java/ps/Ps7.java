package ps;

import java.util.Scanner;

public class Ps7 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int score;

        System.out.println("필기시험 점수를 입력하세요: ");
        score = s.nextInt();
        System.out.println(score >= 70);

        s.close();
    }
}