public class Code04_13 {
    public static void main(String[] args) {
        String str = "   한글    ABCD   efgh";
        String cusStr = "";
        String reStr = ""; // 공백 제거를 위해 replaceAll 실행 결과 저장되는 변수
        boolean res;

        cusStr = str.trim();
        reStr = str.replaceAll(" ", "");
        res = str.isEmpty(); // 문자열에 값이 존재하는지 체크 (코드에서 "is"는 결과값을 ture false로 대부분구분)
        boolean res2 = str.length() == 0;

        System.out.println("기존 문자열 ==> [" + str + "]");
        System.out.println("공백 제거 ==> [" + cusStr + "]");
        System.out.println(res);
        System.out.println(res2);
    }
}
