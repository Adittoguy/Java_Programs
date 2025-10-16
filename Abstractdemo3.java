// Runtime Method Dispatch
abstract class Base
{
    public int i , j;

    public int Addition(int A,int B)
    {
        return A + B;
    }

    abstract public int Substraction(int A, int B);
}

class Derived extends Base          
{
    public int x;

    public int Substraction(int A, int B)
    {
        return A-B;
    }
    
    public int Multipliaction(int A, int B)
    {
        return A*B;
    }

}

class Abstractdemo3
{
    public static void main (String A[])
    {
        Base bp = new Derived();

        int iRet = 0;
        iRet = bp.Addition(11,10);
        System.out.println(iRet);

        iRet = bp.Substraction(11,10);
        System.out.println(iRet);

        // iRet = bp.Multipliaction(11,10);               
    }
}