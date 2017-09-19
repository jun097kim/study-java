package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-19.
 */
public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    // Data 객체의 주소를 반환하므로 반환 타입이 Data
    static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp;
    }
}
