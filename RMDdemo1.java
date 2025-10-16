// Runtime Method Dispatch
class Base
{
    public int i , j;
}

class Derived extends Base
{
    public int x;
}

class RMDdemo1
{
    public static void main (String A[])
    {
        Base bp1 = new Base();                // no-casting
        Derived dp1 = new Derived();          // no-casting
        Base bp2 = new Derived();             // Up-casting
        Derived dp2 = new Base();             // Down-casting       Error
    }
}