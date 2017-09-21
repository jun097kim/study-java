package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-21.
 */
public class MainTest {
    public static void main(String[] args) {
        // 메소드를 종료하는 조건없이 자신을 호출하므로
        // main 메소드가 호출스택에 계속 쌓이고
        // 스택의 메모리 한계를 넘어가면 StackOverflowError
        main(null);
    }
}
