package calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {
    private JPanel panel;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a0Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton BORRARButton;
    private JTextField textField1;
    private JButton SUMAButton;
    private JButton RESTAButton;
    private JTextField anterior;
    private JButton RESULTADOButton;
    private boolean suma, resta;
    private int numeros, dato1;

    public Principal() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "1");
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "2");
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "0");
            }
        });
        BORRARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });

        SUMAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                suma = true;
                numeros = Integer.parseInt(textField1.getText());
                dato1 = numeros;
                textField1.setText("");
                anterior.setText(String.valueOf(dato1) + " + ");

                JOptionPane.showMessageDialog(null, dato1);
            }
        });

        RESTAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resta = true;
                numeros = Integer.parseInt(textField1.getText());
                dato1 = numeros;
                textField1.setText("");
                anterior.setText(String.valueOf(dato1) + " - ");

                JOptionPane.showMessageDialog(null, dato1);
            }
        });

        RESULTADOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (suma){
                    suma = false;
                    numeros = Integer.parseInt(textField1.getText());
                    anterior.setText(anterior.getText() + String.valueOf(numeros));
                    int RTA = numeros + dato1;
                    textField1.setText(String.valueOf(RTA));
                }

                if (resta){
                    resta = false;
                    numeros = Integer.parseInt(textField1.getText());
                    anterior.setText(anterior.getText() + String.valueOf(numeros));
                    int RTA = dato1 - numeros;
                    textField1.setText(String.valueOf(RTA));
                }
            }
        });

    }

    public void calculadoraPanel() {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(new Principal().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}

