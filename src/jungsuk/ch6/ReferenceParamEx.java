package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-19.
 */
public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main(): x" + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main(): x = " + d.x);
    }

    // 참조형 매개변수. 호출하면 참조변수 d의 값(주소)이 복사됨
    static void change(Data d) {
        d.x = 1000;
        System.out.println("change(): x = " + d.x);
    }
}
