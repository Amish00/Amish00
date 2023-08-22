package multithreading.extendingthread;

public class MyThread1 extends  Thread{
    @Override
    public void run(){
        int a = 0;
        while(a<4000){
            System.out.println("Thread 1 is Cooking. ");
            a++;
        }

    }
}
