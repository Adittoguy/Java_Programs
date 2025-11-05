import javax.swing.*;
import java.awt.event.*;

class MarvellousListener implements ActionListener
{
    public void actionPerformed(ActionEvent aobj)
    {
        // logic inside this will execute when button is clicked
        System.out.println("Button Clicked....");
    }
}

class EvenHandlingSeparateClass
{
    public static void main(String A[])
    {
        JFrame fobj = new JFrame("PPA");

        JButton bobj = new JButton("OK");
        
        bobj.setBounds(100, 100, 150, 50); // (X , Y, width, height)

        bobj.addActionListener(new MarvellousListener());

        fobj.add(bobj);

        fobj.setSize(400, 300);

        fobj.setLayout(null);
        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}