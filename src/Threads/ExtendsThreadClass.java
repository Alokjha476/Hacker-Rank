package Threads;

import java.util.concurrent.ExecutionException;

public class ExtendsThreadClass extends Thread {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            for (int i = 0; i <= 5 ; i++) {
                System.out.println("Thread is running :" + i);
                try{
                    Thread.sleep(100);
                } catch ( InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        });
    }
}
