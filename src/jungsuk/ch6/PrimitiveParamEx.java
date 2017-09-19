package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-19.
 */
class Data {
    int x;
}

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main(): x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main(): x = " + d.x);
    }

    // 기본형 매개변수. 호출하면 기본형 변수 x의 값이 복사됨
    static void change(int x) {
        x = 1000;
        System.out.println("change(): x = " + x);
    }
}
