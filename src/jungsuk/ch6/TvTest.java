package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-15.
 */
class Tv {
    // 객체의 속성을 멤버변수로 표현
    String color;
    boolean power;
    int channel;

    // 객체의 기능을 메소드로 표현
    void power() {
        power = !power; // 논리 부정 연산자로 bool 값 토글
    }

    void channelup() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

public class TvTest {
    public static void main(String[] args) {
        // 1. Tv 클래스 타입의 참조변수 t 선언
        Tv t;
        // 2. new 연산자로 Tv 클래스의 인스턴스를 메모리의 빈 공간에 생성하고, 주소값을 참조변수 t에 저장
        t = new Tv();
        // 3. 참조변수 t가 참조하는 인스턴스의 멤버변수 channel에 7 저장
        t.channel = 7;
        // 4. 참조변수 t가 참조하는 인스턴스의 channelDown 메소드 호출
        t.channelDown();
        // 5. 참조변수 t가 참조하는 인스턴스의 멤버변수 channel에 저장된 값 출력
        System.out.println("현재 채널은 " + t.channel + " 입니다");
    }
}
