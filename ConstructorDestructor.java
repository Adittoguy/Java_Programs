class Demo
{
    public int iNo1;                               // 4
    public int iNo2;                               // 4

    public Demo()
    {
        System.out.println("Inside Default constructor...");
    }
    public Demo(int i, int j)
    {
        System.out.println("Inside Parametrised constructor...");
    }
    protected void finalize()
    {
        System.out.println("Inside Finalize...");
    }
}

class ConstructorDestructor
{
    public  static void main(String A[])
    {
        Demo dobj1 = new Demo();            
        Demo dobj2 = new Demo(11,21);  
        
        dobj1 = null;
        dobj2 = null;

        System.gc();
        
        System.out.println("End of main");
    }
}
