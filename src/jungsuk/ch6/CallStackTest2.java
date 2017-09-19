package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-19.
 */
public class CallStackTest2 {
    // 이 프로그램을 실행하면, JVM이 main 메소드 호출. 프로그램 시작
    // 호출스택에 main 메소드를 위한 메모리 공간 할당, main 메소드 코드 수행
    public static void main(String[] args) {
        System.out.println("main(String[] args)이 시작되었음.");
        firstMethod();
        // main 메소드에서 firstMethod() 호출. main 메소드는 대기상태
        // 호출스택에 firstMethod()를 위한 메모리 공간 할당, firstMethod 호출

        System.out.println("main(String[] args)이 끝났음.");
    }

    static void firstMethod() {
        System.out.println("firstMethod()가 시작되었음.");
        secondMethod();
        System.out.println("firstMethod()가 끝났음.");
    }

    static void secondMethod() {
        System.out.println("secondMethod()가 시작되었음.");
        System.out.println("secondMethod()가 끝났음.");
        // 더 이상 수행할 코드가 없으면 종료되고 자신을 호출한 firstMethod()로 돌아감
    }
}
