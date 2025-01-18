package Threads;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Thread is running:");
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                throw new RuntimeException(e.getMessage());
            }
        }

    }
    public static void main(String[] args) {
        Thread thread = new Thread();
        Thread thread1 = new Thread(thread);
        thread1.start();


    }
}
