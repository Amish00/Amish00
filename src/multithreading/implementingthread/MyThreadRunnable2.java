package multithreading.implementingthread;

public class MyThreadRunnable2 implements Runnable{

    @Override
    public void run(){
        int a = 0;
        while(a<4000){
            System.out.println("I am Thread 2.1 Not Tread 1");
            a++;
        }
    }
}
