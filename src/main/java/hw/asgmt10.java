package hw;

public class asgmt10 {
    public static void main(String[] args){
        String str = " 한글 ABCD efgh ";
        String cutStr = "";

        cutStr = str.trim();

        System.out.println("기존 문자열[" + str + "]");
        System.out.println("공백 제거[" + cutStr + "]");
    }
}
