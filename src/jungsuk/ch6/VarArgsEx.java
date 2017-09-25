package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-25.
 */
public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};
        System.out.println(concatenate("", "100", "200", "300"));
        // 인자로 배열 지정
        System.out.println(concatenate("-", strArr));
        // 인자로 길이가 0인 배열 지정
        System.out.println("[" + concatenate(",", new String[0]) + "]");
        // 인자가 없음
        System.out.println("[" + concatenate(",") + "]");
    }

    // 가변 인자: 타입... 변수명, 항상 마지막 매개변수이어야 한다.
    static String concatenate(String delim, String... args) {
        String result = "";

        for (String str : args) {
            result += str + delim;
        }

        return result;
    }

    // 메소드가 구분되지 않는 경우가 발생하기 쉽기 때문에
    // 가변인자를 이용한 메소드는 오버로딩하지 않는 것이 좋다.
    /*  static String concatenate(String... args) {
        return concatenate("", args);
    }*/
}
