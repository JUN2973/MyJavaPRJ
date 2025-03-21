import java.util.Scanner;

public class asgmt9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String personName, personAddr;
        int weight;

        System.out.print("## 택배 보내기입니다. 다음을 각각 입력하세요 ##");

        System.out.print("받는 사람: ");
        personName = s.nextLine();

        System.out.print("주소: ");
        personAddr = s.nextLine();

        System.out.print("무게(g): ");
        weight = s.nextInt();

        System.out.println("** 받는사람: " + personName);
        System.out.println("** 주소: " + personAddr);
        System.out.println("** 배송비: " + weight * 5 + "원");

        s.close();
    }
}
