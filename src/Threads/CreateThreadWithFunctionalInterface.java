package Threads;

public class CreateThreadWithFunctionalInterface {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread is running :" + i);
                try {
                    Thread.sleep(500); // Simulate some work with a delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        thread.start();

        // main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
