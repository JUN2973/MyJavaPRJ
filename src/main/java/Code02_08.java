public class Code02_08 {
    public static void main(String[] args) {

        int num1, num2, result;
        num1 = 100;
        num2 = 60;

        float res, res2;

        result = num1 / num2;  //정수로 표시//
        res = num1 / num2;     //실수로 표시//
        res2 = (float) num1 / num2; //실수가 나올걸 계산해서 표시//
        //(float) 형변환처리 잘할것!!!//

        System.out.println(num1 + " / " + num2 + " = " + result);
        System.out.println(num1 + " / " + num2 + " = " + res);
        System.out.println(num1 + " / " + num2 + " = " + res2);

    }
}
