package jungsuk.ch14;

@FunctionalInterface
interface MyFunction2 {
    void myMethod();
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 f = () -> {};   // MyFunction2 f = (MyFunction2)(() -> {});
        Object obj = (MyFunction) (() -> {});
        String str = ((Object)(MyFunction)(() -> {})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

//        System.out.println(() -> {});   // 에러. 람다식은 Object 타입으로 형변환 안됨
        System.out.println((MyFunction)(()->{}));
//        System.out.println((MyFunction)(()->{}).toString());    // 에러
        System.out.println((Object)((MyFunction)(()->{})).toString());
    }
}
