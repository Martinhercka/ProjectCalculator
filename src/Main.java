import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {

        JFrame jframe = new JFrame("App");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(300,500);
        jframe.setContentPane(new Calculator().getCalc());
        jframe.setVisible(true);


    }
}
