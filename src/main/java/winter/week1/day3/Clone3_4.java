package winter.week1.day3;

public class Clone3_4 implements Cloneable{ //복제할 수 있다는 표시 clone() 사용시 필요

    /*
    *얕은 복제(thin clone)
    * 단순히 필드값을 복사해서 객체를 복제하는 방법
    * cㅣoned = (Exam) clone();
    * clone()의 리턴타입은 Object 이므로 캐스팅이 필요함
    * 복제하더라도 원본의 필드값은 변경되지않는다.
    *
    * 깊은복제(deep clone)
    * 얕은복제는 복제객체에서 참조객체를 변경하면 원본 객체도 변경된 객체를 가지게 된다.
    * 깊은 복제는 참조하고있는 객체도 복제하는 것을 말한다.
    * @Override 재정의(참조객체를 복제하는 코드를 직접 작성)
    * 얕은 복사를 한 후 재정의하여 복제한다.
    *
     */


}
