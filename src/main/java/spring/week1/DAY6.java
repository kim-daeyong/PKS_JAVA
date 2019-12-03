package spring.week1;

import java.util.regex.Pattern;

public class DAY6 {
  /**
   * 정규표현식
   * 문자열이 정해져 있는 형식(정규 표현식)으로 구성되어 있는지 검증해야하는 경우가 있다.
   * ex> 이메일, 전화번호를 사용자가 제대로 입력했는지 검증해야 할 때 정규표현식과 비교한다.
   */

  /**
   * 전화번호를 위한 정규 표현식
   * (02|010)-\d{3,4}-\d{4}
   * (02|010) -> 02 또는 010
   * - -> - 포함
   * \d{3,4} -> 3자리 또는 4자리 숫자
   * - -> - 포함
   * \d{4} -> 4자리 숫
   */

  /**
   * \w+@\w+\.\w+(\.\w+)?
   * \w -> 한 개 이상의 알파벳 또는 숫자
   * @ -> @
   * \w+ -> 한 개 이상의 알파벳 또는 숫자
   * \w+ -> 한 개 이상의 알파벳 또는 숫자
   * (\.\w+)? -> \.\w+이 없거나 한 번 더 올 수 있음
   *
   * 주의할 점은 \.과 .은 다른데 \.은 문자로서의 점(.)을 말하지만 .은 모든 문자 중에서 한 개의 문자를 뜻한다.
   */

  public static void main(String[] args) {
    //정규 표현식으로 문자열을 검증하는 방법
    String regExp = "(02|010)-\\d(3,4)-\\d{4}";
    String data = "010-123-4567";
    boolean result = Pattern.matches(regExp, data);
    if(result) {
      System.out.println("정규식과 일치합니다.");
    }else{
      System.out.println("정규식과 일치하지 않습니다.");
    }

    regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
    data = "angel@naver.com";
    result = Pattern.matches(regExp, data);
    if(result) {
      System.out.println("정규식과 일치합니다.");
    }else{
      System.out.println("정규식과 일치하지 않습니다.");
    }
  }
}
