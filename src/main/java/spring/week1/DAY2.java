package spring.week1;

public class DAY2 {

  public static void main(String[] args) {
    //원본 객체 생성
    Member original = new Member("blue", "홍길동", "12345", 25, true);
    //복제 객체를 얻은 후에 패스워드 변경
    Member cloned = original.getMember();
    cloned.password = "1111";

    System.out.println("복제 객체의 비밀번");
    System.out.println(cloned.password);
    System.out.println("원본 객체의 비밀번호");
    System.out.println(original.password);
  }
  public static class Member implements Cloneable{
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;

    public Member(String id, String name, String password, int age, boolean adult){
      this.id = id;
      this.name = name;
      this.password = password;
      this.age = age;
      this.adult = adult;
    }

    public Member getMember(){
      Member cloned = null;
      try{
        //clone() 메소드의 리턴 타입은 Object이므로 Member 타입으로 캐스팅 해야함
        cloned  = (Member)clone();
      }catch(CloneNotSupportedException e){
      }
      return cloned;
    }

  }
}
