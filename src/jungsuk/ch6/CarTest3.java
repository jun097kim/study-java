package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-27.
 */
class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4);
    }

    // 인스턴스 복사를 위한 생성자
    Car(Car c) {
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);

        System.out.println("c1의 color=" + c1.color + ", gearType="
                + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType="
                + c2.gearType + ", door=" + c2.door);

        c1.door = 100;
        System.out.println("c1의 color=" + c1.color + ", gearType="
                + c1.gearType + ", door=" + c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType="
                + c2.gearType + ", door=" + c2.door);
    }
}
