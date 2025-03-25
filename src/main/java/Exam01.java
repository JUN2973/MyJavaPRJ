import java.util.Scanner;

class Exam01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("정수 a를 입력하세요: ");
        int a = s.nextInt();
        System.out.println("정수 b를 입력하세요: ");
        int b = s.nextInt();

        double result = (double) a / b;

        System.out.println(a + " / " + b + " = " + result);

        s.close();
    }

}
