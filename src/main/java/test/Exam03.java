package test;

import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        double result;

        System.out.println("정수 a를 입력하세요: ");
        a = sc.nextInt();
        System.out.println("정수 b를 입력하세요: ");
        b = sc.nextInt();

        result = (double) a / b;

        System.out.println(a + " / " + b + " = " + result);

        sc.close();
    }
}
