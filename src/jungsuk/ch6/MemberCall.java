package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-25.
 */
public class MemberCall {
    int iv = 10;
    static int cv = 20;

    // 인스턴스 멤버는 인스턴스 생성없이 인스턴스 멤버와 클래스 멤버 모두 참조 또는 호출 가능
    int iv2 = cv;
    // 클래스 멤버는 인스턴스 생성 후에만 인스턴스 멤버 참조 또는 호출 가능
    static int cv2 = new MemberCall().iv;

    static void staticMethod1() {
        System.out.println(cv); // 클래스 멤버 간의 참조 또는 호출 가능
//        System.out.println(iv);
        MemberCall c = new MemberCall();
        System.out.println(c.iv);
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
//        instanceMethod1();
        MemberCall c = new MemberCall();
        c.instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}
