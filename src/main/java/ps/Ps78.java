package ps;

import java.util.Scanner;

public class Ps78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numAry = new int[4];
        int hap = 0;

        for (int i = 0; i <=3; i++) {
            System.out.print("숫자 : ");
            numAry[i] = sc.nextInt();
        }
        for (int i = 0; i <=3; i++) {
            hap += numAry[i];
        }
        System.out.println("합계 ==> " + hap);

        sc.close();

    }
}
