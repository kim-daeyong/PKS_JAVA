package winter.weel2.day2;

public class Thread {

    /*
    * Thread thread = new Thread(Runnable target);
    *
     */

//    Thread thread = new Thread(new Runnable() {
//
//implements Rumnable
//        public void run(){
//
//
//        }
//    });
//
//    // 람다
//    Thread thread = new Thread(()-> {
//
//
//    });
// 메인스레드 > 스레드 객체 생성 > start( 메소드 호충 > 메인 스레드 실행

    //thread.start();
    //extends Thread
    // @Override
    //public void run(){
    //}
    /*
    *Thread thread = new Thread(){
    *   public void run(){
    *   }
    *
    *  메소드
    *  thread.setName
    *  getName
    *  setPriority(우선순위)
    *  우선순위
    *  Thread.MAX_PRIORITY - 10
    *  .NORM_PRIORITY - 5
    *  .MIN_PRIORITY - 1
    *  synchronized - 동기화 단하나의 스레드만 실행
    *  .getState - 스레드 상태얻기
    *  notify - tlfgodeorl
    *  wait - 동기화블럭에서 일시정지
    *  yield 양보
    *  join - 스레드의 종료를 기다림
    *  setDaemon - 주스레드의 보조, 주스레드가 종료되면 강제적으로 종료
    *
    *  스레드 객체 생성(NEW) - sㅅart - 실행 대기(RUNNABLE) / waiting ,timed wait, blocked <- 반복 -> 실행 - 종료(TERMINATED)
    *
    *  객체 생성(new) - start() 메소드가 호출되지않은 상태
    *  실행 대기 - 실행 상태로 들어갈 수 있는 생태
    *  waiting - 다른 스레드가 통지할 때까지 기다리는 상태
    *  timed_wait - 주어진 시간 동안 기다리는 상태
    *  blocked - 사용하고자 하는 객체의 락이 풀릴 때까지 기다리는 상태
    *  종료 - 실행을 마친 상태
     */
}
