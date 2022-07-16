package threadd;

public class ImplementRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(
                "Thread is Running Successfully");
    }

    public static void main(String[] args)
    {
        ImplementRunnable g1 = new ImplementRunnable();
        // initializing Thread Object
        Thread t1
                = new Thread(g1);
        t1.start();
    }
}
