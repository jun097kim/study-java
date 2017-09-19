package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-19.
 */
public class CardTest {
    public static void main(String[] args) {
        // 클래스 변수는 인스턴스를 생성하지 않고도 사용 가능
        System.out.println("Card1.width = " + Card1.width);
        System.out.println("Card1.height = " + Card1.height);

        Card1 c1 = new Card1();
        c1.kind = "Heart";
        c1.number = 7;

        Card1 c2 = new Card1();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number
                + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number
                + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");

        // Card1.width, c1.width, c2.width 모두 같은 저장공간 참조
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number
                + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number
                + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
    }
}

class Card1 {
    // 클래스 변수
    String kind;
    int number;

    // 인스턴스 변수
    static int width = 100;
    static int height = 250;
}