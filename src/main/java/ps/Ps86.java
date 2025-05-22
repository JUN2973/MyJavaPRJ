package ps;

import java.util.ArrayList;
import java.util.List;

public class Ps86 {public static void main(String[] args) {
    List<String> list = new ArrayList<String>(); //유지보수가 편하다

    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");
    list.add("F");

    int listSize = list.size();
    System.out.println("2세대 반복문");

    for (String name : list) {
    System.out.println("name : " + name);}
   }
}
