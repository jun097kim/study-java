package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-25.
 */
class Data1 {
    int value;
}

class Data2 {
    int value;

    Data2(int x) {
        value = x;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        // Data2에 이미 생성자가 정의되어 있어서
        // 컴파일러가 기본 생성자를 추가해주지 않았다.
//        Data2 d2 = new Data2(); // 컴파일 에러
    }
}
