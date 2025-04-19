package test;

public class Exam11 {
    public static void main(String[] args) {

        int a = 0;

        for( int i = 100; i <= 300; i++ ) { //100~300까지 작성
            if ( i % 5 == 0 || i % 7 == 0) { // 5의 배수 또는 7의 배수 추출
                a += 1; // 조건을 만족하는 수 누적해서 더해줌
            }
        }
        System.out.println(a); // 더한값 a를 추출
    }
}
