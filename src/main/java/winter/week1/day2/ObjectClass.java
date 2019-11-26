package winter.week1.day2;

public class ObjectClass {

    /*
    *
    * 자바는 기본적으로 java.lang.object 클래스를 상속하게 된다.
    *
    * equals 메소드 - boolean 을 리턴한다.
    * 논리적으로 동등하다면 true, 아니라면 false 를 리턴한다.
    * 논리적인 동등은 동일 객체이든아니든상관없이 객체가 저장하고있는 데이터가 동일한지 확인한다.
    * == 는 주소를 비교한다.
     */
    public static void main(String[] args) {
        String a = "aaa";
        String b = a;
        String c = new String("aaa");

        //결과 값 : true
        if(a==b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        //결과 값 : false
        if(a==c){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        //결과 값 : true
        if(a.equals(b)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        //결과 값 : true
        if(a.equals(c)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        /*
        *hash코드는 객체를 식별할 하나의 정수값이다.
         */

    }
}
