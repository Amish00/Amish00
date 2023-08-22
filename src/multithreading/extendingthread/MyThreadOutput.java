package multithreading.extendingthread;

public class MyThreadOutput {
    public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();

    t1.start();
    t2.start();
    }
}
