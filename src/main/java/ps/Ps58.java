package ps;

import java.util.Scanner;

public class Ps58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hap = 0;
        int num1, num2;

        while(true) {
            System.out.print("숫자1 ==> ");
            num1 = sc.nextInt();
            if (num1 == 0)
                break;
            System.out.print("숫자2 ==> ");
            num2 = sc.nextInt();

            hap = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + hap);
        }
    }
}
