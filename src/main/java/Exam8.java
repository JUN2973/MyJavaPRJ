import java.util.Scanner;

public class Exam8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String result = (a+b).toLowerCase().replaceAll(" ","");
        System.out.println(result);
    }
}
