class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside Run method of :"+Thread.currentThread().getName());
    }
}

class ThreadUserDefinedJoinX
{
    public static void main(String A[]) throws InterruptedException
    {
        System.out.println("inside main thread");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("First");
        dobj2.setName("Second");

        dobj1.start();
        dobj2.start();

        dobj1.join();
        dobj2.join();

        // System.out.println("Is first thread alive?"+dobj1.isAlive());


        System.out.println("End of main thread");
    }
}