package test;

import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            int a, b;
            double result;

            a = s.nextInt();
            b = s.nextInt();

            result = (double) a / b;
            System.out.println(a + "/" + b + "=" + result);

            s.close();
    }
}
