public class Exam10 {
    public static void main(String[] args) {
        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200";

        int start = log.indexOf("GET") + 4;
        // "GET " 문자열의 위치를 찾고 그 다음 인덱스 (공백 포함해서 +4)를 시작 위치로 지정합니다.

        int end = log.indexOf(" HTTP");
        // " HTTP" 문자열의 위치를 찾고, 그 앞까지가 API 경로입니다.

        String url = log.substring(start, end);
        // 위에서 계산한 start와 end 위치를 이용하여 해당 부분 문자열을 추출합니다.

        System.out.println(url);
        // 추출한 API 경로를 출력합니다. 예: /apache_pb.gif
    }
}
