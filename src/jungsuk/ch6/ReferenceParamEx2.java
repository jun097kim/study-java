package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-19.
 */
// 배열도 객체와 같이 참조변수를 통해 데이터가 저장된 공간에 접근한다.
// 배열을 이용한 Call by reference
public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] x = {10}; // 크기가 1인 배열
        System.out.println("main(): x = " + x[0]);

        change(x);
        System.out.println("After change(x)");
        System.out.println("main(): x = " + x[0]);
    }

    // 참조변수 값(배열의 주소)를 복사하기 때문에, 원래의 배열에 영향을 미친다.
    static void change(int[] x) {   // 참조형 매개변수
        x[0] = 1000;
        System.out.println("change(): x = " + x[0]);
    }
}
