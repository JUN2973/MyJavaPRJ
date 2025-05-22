package ps;

import java.util.ArrayList;
import java.util.List;

public class Ps87 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(); //유지보수가 편하다

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        int listSize = list.size();

        System.out.println("4세대 반복문 - 직렬구조");

        list.stream().forEach(name -> System.out.println("name : " + name));
    }
}
