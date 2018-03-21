import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Calculator {
    private JPanel calc;
    private JTextField textfield;
    private JButton button1;
    private JButton cButton;
    private JButton button3;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton a3Button;
    private JButton a2Button;
    private  JButton a1Button;

    private JButton a3Button1;
    private JButton a2Button1;
    private JButton a0Button;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JLabel label;

    double num,ans;
    int calculation;
    public void arithmetic()
    {
        switch (calculation)
        {
            case 1: ans = num+Double.parseDouble(textfield.getText()); //+
                textfield.setText(Double.toString(ans));
                break;
            case 2: ans = num-Double.parseDouble(textfield.getText()); // -
                textfield.setText(Double.toString(ans));
                break;

            case 3: ans = num*Double.parseDouble(textfield.getText()); // *
                textfield.setText(Double.toString(ans));
                break;

            case 4: ans = num/Double.parseDouble(textfield.getText()); // /
                textfield.setText(Double.toString(ans));
                break;

        }
    }


    public Calculator() {




        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"9");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                num = Double.parseDouble(textfield.getText());
                calculation=1;
                textfield.setText("");
                label.setText(num + "+");


            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                num = Double.parseDouble(textfield.getText());
                calculation=2;
                textfield.setText("");
                label.setText(num + "-");
            }
        });
        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                num = Double.parseDouble(textfield.getText());
                calculation=3;
                textfield.setText("");
                label.setText(num + "*");
            }
        });
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Double.parseDouble(textfield.getText());
                calculation=4;
                textfield.setText("");
                label.setText(num + "/");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+"0");
            }
        });
        a2Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText(textfield.getText()+".");
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText("");
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = textfield.getText().length();
                int number = textfield.getText().length()-1;
                String store;
                if(length>0)
                {
                    StringBuilder back = new StringBuilder(textfield.getText());
                    back.deleteCharAt(number);
                    store = back.toString();
                    textfield.setText(store);
                }
            }

        });

        a3Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arithmetic();
                label.setText("");
            }
        });
    }


    public JPanel getCalc()
    {
        return calc;
    }
}
