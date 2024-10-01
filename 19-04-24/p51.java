import java.lang.*;

class Priority extends Thread {
    private String name;

    Priority(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread " + name + " is running: " + i);
        }
    }

    public static void main(String[] args) {
        Priority thread1 = new Priority("Thread1");
        Priority thread2 = new Priority("Thread2");
        Priority thread3 = new Priority("Thread3");

        thread1.setPriority(Thread.MAX_PRIORITY); 
        thread2.setPriority(Thread.NORM_PRIORITY); 
        thread3.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}