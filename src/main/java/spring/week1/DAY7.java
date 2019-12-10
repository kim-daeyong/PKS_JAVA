package spring.week1;

import java.util.Arrays;

public class DAY7 {
  /**
   * Arrays 클래스
   * 배열 조작 기능을 가지고 있다. 배열 조작이란 배열의 복사, 항목 정렬, 항목 검색과 같은 기능을 말한다.
   * binarySearch(배열, 찾는 값) : 전체 배열 항목에서 찾는 값이 있는 인덱스 리턴
   * copyOf(원본 배열, 복사할길이) , copyOfRange(원본 배열, 시작인덱스, 끝인덱스)
   * sort(배열) : 배열의 전체 항목을 오름차순으로 정렬
   * toString(배열) : "[값1, 값2, ...]" 과 같은 문자열 리턴
   */


    public static void main(String[] args) {
      //배열 복사
      char[] arr1 = {'J','A','V','A'};

      //방법1
      char[] arr2 = Arrays.copyOf(arr1, arr1.length);
      System.out.println(Arrays.toString(arr2));

      //방법2
      char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
      System.out.println(Arrays.toString(arr3));

      //방법3
      char[] arr4 = new char[arr1.length];
      System.arraycopy(arr1, 0, arr4, 0, arr1.length);
      for(int i=0; i<arr4.length; i++){
        System.out.println("arr4["+i+"]="+arr4[i]);
      }

      //배열 항목 비교
      //equals(), deepEquals()
      int[][] original = {{1,2}, {3,4}};

      //얕은 복사 후 비교
      System.out.println("[얕은 복제 후 비교]");
      int[][] cloned1 = Arrays.copyOf(original, original.length);
      System.out.println("배열 번지 비교 : "+original.equals(cloned1));
      System.out.println("1차 배열 항목값 비교 : "+Arrays.equals(original, cloned1));
      System.out.println("중첩 배열 항목값 비교 : "+Arrays.deepEquals(original, cloned1));

      //깊은 복사 후 비교
      System.out.println("\n[깊은 복제 후 비교]");
      int[][] cloned2 = Arrays.copyOf(original, original.length);
      cloned2[0] = Arrays.copyOf(original[0], original[0].length);
      cloned2[1] = Arrays.copyOf(original[1], original[1].length);
      System.out.println("배열 번지 비교: "+ original.equals(cloned2));
      System.out.println("1차 배열 항목 값 비교: "+Arrays.equals(original, cloned2));
      System.out.println("2차 배열 항목 값 비교: "+Arrays.deepEquals(original, cloned2));
    }

}
