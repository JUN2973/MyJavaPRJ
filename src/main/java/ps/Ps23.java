package ps;

import java.util.Scanner;

public class Ps23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        if (m == 1 || m == 2) {
            System.out.println("NEWBIE!");
        } else if (m <= n) {
            System.out.println("OLDBIE!");
        } else {
            System.out.println("TlE!");
        }
        sc.close();
    }
}
