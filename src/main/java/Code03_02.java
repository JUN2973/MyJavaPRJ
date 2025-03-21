import java.util.Scanner;

public class Code03_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1, n2, res;
        double res1;

        n1 = s.nextInt();
        n2 = s.nextInt();

        res = n1 + n2;
        System.out.println(n1 + "+" + n2 + "=" + res);

        res = n1 - n2;
        System.out.println(n1 + "-" + n2 + "=" + res);

        res = n1 * n2;
        System.out.println(n1 + "*" + n2 + "=" + res);

        res = n1 % n2;
        System.out.println(n1 + "%" + n2 + "=" + res);

        res1 = (double) n1 / n2;
        System.out.println(n1 + "/" + n2 + "=" + res1);

        s.close();

    }
}