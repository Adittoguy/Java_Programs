import java.util.Scanner;

class SelectionDemo1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;

        System.out.println("Enter your Age: ");
        iNo = sobj.nextInt();

        if(iNo >= 18)
        {
            System.out.println("you can vote");
        }
        else
        {
            System.out.println("you can't vote");
        }
    }
}