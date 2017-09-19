package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-19.
 */
public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3, 5);
        System.out.println(result);

        // 배열을 생성하고 0으로 초기화
        int[] result2 = {0};

        // new 연산자로 배열을 생성하면, 자동으로 0으로 초기화
//        int[] result2 = new int[1];

        r.add(3, 5, result2);
        System.out.println(result2[0]);
    }

    int add(int a, int b) {
        return a + b;
    }

    // 반환값이 없지만 실행결과를 result 참조변수에 넣어준다.
    void add(int a, int b, int[] result) {
        result[0] = a + b;
    }
}
