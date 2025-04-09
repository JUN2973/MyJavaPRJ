package ps;

public class Ps42 {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {

            if (i <= 4) {
                for (int a = 1; a <= i; a++) {
                    System.out.print("*");
                }
            } else {
                for (int a = 1; a <= 8-i; a++)
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
