public class ThreadLifecycle {
    public static void main(String[] args) {
        // Create a new task instance
        Task task = new Task();
        Thread thread = new Thread(task);

        // Start the thread (Runnable state)
        thread.start();

        // Simulate main thread activity (Runnable state)
        try {
            Thread.sleep(100); // Main thread sleeping
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Notify the waiting thread to continue
        synchronized (task) {
            task.notify(); // Notify the waiting thread
        }

        // Wait for the thread to finish (Waiting state)
        try {
            thread.join(); // Waiting state
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread has finished execution.");
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Task started (Runnable).");

        // Simulate some processing
        try {
            Thread.sleep(50); // Timed Waiting state
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Block the thread
        synchronized (this) {
            try {
                // Waiting for a signal
                System.out.println("Task is waiting (Waiting).");
                this.wait(); // Waiting state
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Task is now terminating (Terminated).");
    }
}
