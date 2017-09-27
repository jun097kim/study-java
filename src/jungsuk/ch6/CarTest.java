package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-25.
 */
/*class Car {
    String color;
    String gearType;
    int door;

    Car() {
    }

    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}*/

public class CarTest {
    public static void main(String[] args) {
        // 인스턴스 생성 후 인스턴스 변수 따로 초기화
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        // 매개변수가 있는 생성자
        // 인스턴스 생성과 동시에 인스턴스 변수 초기화
        Car c2 = new Car("whie", "auto", 4);

        System.out.println("c1의 color=" + c1.color + ", gearType="
                + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType="
                + c2.gearType + ", door=" + c2.door);
    }
}
