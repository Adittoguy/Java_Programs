class Demo
{
    public int i;                   // Instance variable
    static public int j = 21;       // Class variable

    static
    {
        System.out.println("Inside Static block");
        j = 21;
    }

    public Demo()
    {
        System.out.println("Inside Constructor");
        this.i = 11;
        // this.j = 21;             Not allowed
    }
}

class Blocks
{
    public static void main(String A[])
    {
        System.out.println("Inside Main");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();

    }
}