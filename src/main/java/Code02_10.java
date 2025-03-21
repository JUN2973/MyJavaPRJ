import java.util.Scanner;

public class Code02_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;

        num = s.nextInt();
        System.out.println("사용자가 입력한 값 ==> " + num);

        s.close();
    }
}
