package ps;

import java.util.*;

public class Ps89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = null;

        for (int i = 0; i < 3; i++) {

            System.out.print("이름: ");
            String name = sc.next();

            System.out.print("이메일: ");
            String email = sc.next();

            System.out.print("부서: ");
            String dept = sc.next();

            map = new HashMap<>();

            map.put("name", name);
            map.put("email", email);
            map.put("dept", dept);

            list.add(map);

            map = null;
        }
        sc.close();

        int listSize = list.size();
        System. out. println("저장된 데이터 수 : " + listSize);



    }
}
