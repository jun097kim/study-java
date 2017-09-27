package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-27.
 */
public class BlockTest {
    // 클래스 초기화 블럭: 클래스 변수 초기화에 사용
    // 클래스가 메모리에 처음 로딩될 때 한 번만 수행
    static {
        System.out.println("static { }");
    }

    // 인스턴스 초기화 블럭: 인스턴스 변수 초기화에 사용
    // 인스턴스를 생성할 때마다 생성자보다 먼저 수행
    {
        System.out.println("{ }");
    }

    public BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest();");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest();");
        BlockTest bt2 = new BlockTest();
    }
}
