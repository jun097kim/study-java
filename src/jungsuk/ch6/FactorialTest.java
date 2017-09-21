package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-21.
 */
public class FactorialTest {
    public static void main(String[] args) {
        // 같은 클래스에 있는 메소드를 호출할 때는 클래스 이름 생략 가능
        int result = factorial(4);

        System.out.println(result);
    }

    static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}
