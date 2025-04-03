import java.util.Scanner;

public class Ps22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a <= 2) {
            System.out.println("NEWBIE!");
        } else if (a > 2 && a < 5) {
            System.out.println("OLDBIE!");
        } else {
            System.out.println("TlE!");
        }
        sc.close();
    }
}
