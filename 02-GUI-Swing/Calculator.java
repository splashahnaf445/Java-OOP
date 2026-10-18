package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(800, 800);
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        frame.add(add, BorderLayout.CENTER);
        frame.add(sub, BorderLayout.SOUTH);

        JLabel label = new JLabel("Give the numbers");
        frame.add(label, BorderLayout.NORTH);

        JTextField input = new JTextField(10);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, input.getText());
            }
        });





        frame.setVisible(true);
    }
}
