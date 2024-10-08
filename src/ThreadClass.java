public class ThreadClass {
    public static void main(String[] args) {
        Runnable hello = new DisplayMessage("Starting Thread1");
        Thread thread1 = new Thread(hello);
        thread1.setDaemon(true); // Corrected
        thread1.setName("Hello");
        System.out.println("Starting hello thread");
        thread1.start();

        Runnable bye = new DisplayMessage("Starting Thread2");
        Thread thread2 = new Thread(bye);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.setDaemon(true); // Corrected
        System.out.println("Starting Goodbye Thread");
        thread2.start();

        System.out.println("Starting Thread3");
        Thread thread3 = new GuessANumber(27);
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
        System.out.println("Starting Thread4");
        Thread thread4 = new GuessANumber(75);
        thread4.start();
        System.out.println("main() is ending");
    }
}

class DisplayMessage implements Runnable {
    private String message;

    public DisplayMessage(String message) {
        this.message = message;
    }

    public void run() {
        while (true) {
            System.out.println(message);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Handle interruption
            }
        }
    }
}

class GuessANumber extends Thread {
    private int number;

    public GuessANumber(int number) {
        this.number = number;
    }

    public void run() {
        int counter = 0;
        int guess = 0;

        do {
            guess = (int) (Math.random() * 100 + 1);
            System.out.println(this.getName() + " guesses " + guess); // Corrected
            counter++;
        } while (guess != number);
        System.out.println("Correct " + this.getName() + " in " + counter + " guesses"); // Corrected
    }
}
