public class ThreadSynchronization {
    // Synchronizing this method to prevent race conditions
    public synchronized void printCount() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(Thread.currentThread().getName() + " --- Counter: " + i);
                // Adding a short sleep to simulate work and make output clearer
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

class ThreadDemo extends Thread {
    private ThreadSynchronization ts;

    ThreadDemo(String name, ThreadSynchronization ts) {
        super(name); // Set the thread name
        this.ts = ts;
    }

    public void run() {
        ts.printCount(); // Call the synchronized method
    }
}

class TestThread {
    public static void main(String[] args) {
        ThreadSynchronization ts = new ThreadSynchronization();

        // Create two threads sharing the same ThreadSynchronization instance
        ThreadDemo thread1 = new ThreadDemo("Thread-1", ts);
        ThreadDemo thread2 = new ThreadDemo("Thread-2", ts);

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
