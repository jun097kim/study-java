package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-17.
 */
public class TvTest4 {
    public static void main(String[] args) {
        // Tv 객체 배열 생성
        Tv[] tvArr = new Tv[3];

        // Tv 인스턴스 생성, Tv 객체 배열의 각 요소에 저장
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;  // 10, 11, 12
        }

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelup();   // 11, 12, 13
            System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
        }
    }
}
