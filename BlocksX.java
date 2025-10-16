class Demo
{
    public int i;                   // Instance variable
    static public int j;       // Class variable

    static
    {
        System.out.println("Inside Static block");
        j = 21;
    }

    {
        System.out.println("Inside Initiaiser block");
        // i = 11;                                  // not in main code
    }

    public Demo()
    {
        System.out.println("Inside Default Constructor");
        this.i = 11;
    }
    public Demo(int a)
    {
        System.out.println("Inside Parametrized Constructor");
        this.i = a;
    }
}

class BlocksX
{
    public static void main(String A[])
    {
        System.out.println("Inside Main");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();
        Demo dobj4 = new Demo(11);

    }
}