import java.util.*;
import java.io.*;
import java.net.*;

class AdditionServer2
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Server is running...");
        ServerSocket ssobj = new ServerSocket(2100);                                            // 2100 : Port number
        System.out.println("Server is waiting at port number 2100");
        Socket sobj = ssobj.accept();                                                           // waiting or listening phase
        System.out.println("client request arrives and accepted by the server");

        DataInputStream diobj = new DataInputStream(sobj.getInputStream());
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());
        
    }
}