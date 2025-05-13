package ps;

import java.util.Arrays;
import java.util.Collections;

public class Ps79 {
    public static void main(String[] args) {
        int[] numAry = {33, 99, 11, 77, 22, 88, 66, 44};
        Arrays.sort(numAry);
        for (int data : numAry) {
            System.out.print(data + " ");
        }
        System.out.println();


        String[] strAry = {"한빛", "아카데미", "난생", "자바", "열공"};
        Arrays.sort(strAry, Collections.reverseOrder());
        for (String data : strAry) {
            System.out.print(data + " ");
        }
    }
}
