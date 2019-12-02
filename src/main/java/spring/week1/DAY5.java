package spring.week1;

public class DAY5{

    public static void main(String[] args) {
      //바이트 배열을 문자열로 변환
      byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
      String str1 = new String(bytes);
      System.out.println(str1);
      String str2 = new String(bytes, 6, 4);
      System.out.println(str2);

      //문자로 추출
      System.out.println(str1.charAt(3));

      //StringBuilder
      StringBuilder sb = new StringBuilder();
      sb.append("java");
      sb.append("program Study");
      System.out.println(sb.toString());

      //4번째 문자뒤에 2를 삽입
      sb.insert(4,"2");

      //문자를 6으로 변경
//      sb.charAt(4,'6');

      //문자를 대치
      sb.replace(6,13, "Book");

      String result = sb.toString();
      System.out.println(result
      );
    }

}
