package spring.week1;

import java.util.Comparator;
import java.util.Objects;

public class DAY3 {
  /**
   * Objects 클래스
   * Object와 유사한 이름을 가진 java.util.Objects 클래스는 객체 비교, 해시코드 생성, null 여부,
   * 객체 문자열 리턴 등의 연산을 수행하고 있는 정적 메소드들로 구성된 Object의 유틸리티 클래스이다.
   */

  class StudentComparator implements Comparator<Student>{

    public int compare(Student o1, Student o2) {
      Student s1 = new Student(1);
      Student s2 = new Student(2);
      Student s3 = new Student(3);

      int result = Objects.compare(s1, s2, new StudentComparator());
      System.out.println(result);
      result = Objects.compare(s1, s3, new StudentComparator());
      System.out.println(result);

      return result;
    }
  }

  static class Student{
    int sno;
    Student(int sno){
      this.sno = sno;
    }
  }


}
