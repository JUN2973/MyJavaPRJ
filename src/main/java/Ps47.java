public class Ps47 {
    public static void main(String[] args) {

        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 2; j++){
                System.out.print(i +"번째 외부 for문에서" + j + "번째 내부 for문");
            }
            System.out.println();
        }

    }
}
