package test;

import java.util.Scanner;

public class Exam05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, b;
        double result;

        System.out.println("정수a를 입력하세요: ");
        a = s.nextInt();
        System.out.println("정수b를 입력하세요: ");
        b = s.nextInt();

        result =(double) a / b;
        System.out.println(a + "/" + b + "=" + result);

        s.close();


    }
}
