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
    }

}
