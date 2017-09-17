package jungsuk.ch13;

/**
 * Created by jun097kim on 2017-09-17.
 */
public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1("t1");

        Runnable r = new ThreadEx1_2(); //  Runnable 구현 클래스의 인스턴스를 생성하고,
        Thread t2 = new Thread(r, "t2"); // Thread 클래스 생성자의 매개변수로 제공

        /*
        하나의 스레드에 대해 start()가 한 번만 호출될 수 있다.
        두 번 이상 호출하면 IllegalThreadStateException
        */
        t1.start();

        // 스레드 작업을 다시 수행해야 한다면, 새로운 스레드 생성하고 start()
        t1 = new ThreadEx1_1();
        t1.start();

        t2.start();
    }
}

// Thread 상속. 멤버인 getName() 호출
class ThreadEx1_1 extends Thread {
    public ThreadEx1_1() {
    }

    public ThreadEx1_1(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
        }
    }
}

// Runnable 구현. 멤버는 run() 밖에 없음
class ThreadEx1_2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // currentThread(): 현재 실행중인 스레드의 참조 반환
            System.out.println(Thread.currentThread().getName());
        }
    }
}
