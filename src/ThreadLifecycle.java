public class ThreadLifecycle
{
    public static void main(String[] args)
    {
        //Creating a new task
        Task task = new Task();
        Thread thread = new Thread(task);

        //Start the thread (Runnable State)
        thread.start();

        //Simulate main thread activity (Runnable state)
        try
        {
            //Main Thread Sleeping
            Thread.sleep(100);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        //Notify the waiting thread to continue
        synchronized (task)
        {
            //Notify the waiting thread
            task.notify();
        }

        //Wait for the thread to finish (Waiting State)
        try
        {
            //Waiting State
            thread.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Main thread has finished execution.");
    }
}

class Task implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Task Started (Runnable)");

        //Simulate some processing
        try
        {
            //Timed Waiting State
            Thread.sleep(50);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        //Block the thread
        synchronized(this)
        {
            try
            {
                //Waiting for a signal
                System.out.println("Task is waiting (Waiting)");
                this.wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();

            }
        }
        System.out.println("Task is now terminating (Terminated)");
    }
}


