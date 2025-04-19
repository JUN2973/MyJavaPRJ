public class Exam09 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) { //i는 출력 중인 줄갯수 : 총 4줄
            for (int j = 1; j <= 4 - i; j++) { //j는 왼쪽공백 출력 : 줄번호가 작을수록 공백이 생김 ( 4 -i)
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) { // k: 별촐력용: 홀수개수로 별이 늘어남 2*i-1
                System.out.print("*");
            }
            System.out.println();
        }

    }
}