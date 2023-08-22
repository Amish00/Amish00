package multithreading.implementingthread;

import multithreading.extendingthread.MyThread1;
import multithreading.extendingthread.MyThread2;

public class MyThreadRunnableOutput {
    public static void main(String[] args) {
        MyThreadRunnable1 tr1 = new MyThreadRunnable1();
        Thread thread1 = new Thread(tr1);
        MyThreadRunnable2 tr2 = new MyThreadRunnable2();
        Thread thread2 = new Thread(tr2);

        thread1.start();
        thread2.start();


    }
}
