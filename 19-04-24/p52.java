class Methods extends Thread {
    Methods(String name) {
        super(name); 
    }

    public void run() {
        System.out.println("Thread " + getName() + " started.");

        System.out.println("Thread " + getName() + " priority: " + getPriority());

        Thread.yield();

        synchronized (this) {
            System.out.println("Thread " + getName() + " is synchronized.");
        }

        System.out.println("Thread " + getName() + " ended.");
    }

    public static void main(String[] args) {
        Methods thread1 = new Methods("Thread1");
        Methods thread2 = new Methods("Thread2");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();

        System.out.println("Thread1 ID: " + thread1.getId());
        System.out.println("Thread2 ID: " + thread2.getId());
    }
}

