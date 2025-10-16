// Composition
final class Base
{
    public void fun()
    {
        System.out.println("Inside Base fun");
    }
}

class Derived
{
    public Base bobj;

    public Derived()
    {
        bobj = new Base();
    }
    
}

class FinalClass2
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();

        dobj.bobj.fun();
    }
}