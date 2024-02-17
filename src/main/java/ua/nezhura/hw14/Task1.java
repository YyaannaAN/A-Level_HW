package ua.nezhura.hw14;

public class Task1 {

    public static void main(String[] args) {
        backwardsThreads(50);
    }

    public static void backwardsThreads(int number) {
        for (int i = number - 1; i >= 0; i--) {
            final int threadNumber = i;
            Thread thread = new Thread(() -> {
                System.out.println("Hello from thread " + threadNumber);
            });
            thread.start();

            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}


