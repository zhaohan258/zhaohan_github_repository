package thread;

import java.util.HashMap;

public class TestMyThread {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();
//        myThread.run();

        MyRunnable myRunnable = new MyRunnable();
        Thread runnable = new Thread(myRunnable);
        runnable.start();



    }
}
