package threadd;

public class ExtendThreadClass extends Thread{

    public void run()
    {
        System.out.println("Thread Started Running...");
    }
    public static void main(String[] args)
    {
        ExtendThreadClass g1 = new ExtendThreadClass();
        // invoking Thread
        g1.start();
    }
}
