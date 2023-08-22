package multithreading.implementingthread;

public class MyThreadRunnable1 implements Runnable{

    @Override
    public void run(){
        int a = 0;
        while(a<4000){
            System.out.println("I am Thread 2 Not Tread 1");
            a++;
        }
    }
}
