package Threads;

public class UsingRunnable {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Runnable interface: " + i);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println("Task running intrrupted");
                }
            }
        };
        runnable.run();
// main thread
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Main thread :" + i);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println("Main thread interrupted");
            }
        }
    }
}
