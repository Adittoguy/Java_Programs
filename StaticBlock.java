class Demo
{
    public int i;                   // Instance variable
    static public int j = 21;       // Class variable

    static
    {
        j = 21;
    }

    public Demo()
    {
        this.i = 11;
        // this.j = 21;             Not allowed
    }

    public void fun()               // Instance method  =  nonstatic
    {
        System.out.println("fun i : "+this.i);
        System.out.println("fun j : "+Demo.j);
    }
    public static void gun()               // Class method
    {
        // System.out.println("gun i : "+this.i);       // not allowed
        System.out.println("gun j : "+Demo.j);
    }    
}

class StaticBlock
{
    public static void main(String A[])
    {
        Demo.gun();
        System.out.println(Demo.j);

        Demo dobj = new Demo();
        System.out.println(dobj.i);

        dobj.fun();
    }
}