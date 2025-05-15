package ps;

import java.util.ArrayList;
import java.util.List;

public class Ps83 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(); //유지보수가 편하다

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        int listSize = list.size();

        System.out.println("저장된 데이터 수: " + listSize);

    }
}
