import java.util.Scanner;

public class Ps35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int select;
        System.out.println("1~3 중에 선택하세요 : ");
        select = sc.nextInt();


        switch (select) {
            case 1:
                System.out.println("1을 선택했습니다.");
                break;
            case 2:
                System.out.println("2를 선택했습니다.");
                break;
            case 3:
                System.out.println("3을 선택했습니다.");
                break;
            default:
                System.out.println("이상한 것을 선택했습니다.");
        }
        sc.close();
    }
}
