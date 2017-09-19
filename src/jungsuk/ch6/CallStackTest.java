package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-19.
 */
public class CallStackTest {
    public static void main(String[] args) {
        // static 메소드는 객체 생성없이 호출 가능
        firstMethod();
    }

    static void firstMethod() {
        secondMethod();
    }

    static void secondMethod() {
        System.out.println("secondMethod()");
    }
}
