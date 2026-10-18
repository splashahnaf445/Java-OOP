package Simpleguiexample;
import javax.swing.*;
import java.awt.*;


public class FirstGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI Example");

        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());
        JLabel label= new JLabel("Welcome to Simple GUI Example");
        frame.add(label, BorderLayout.NORTH);
        JButton button = new JButton("Click Me");
        frame.add(button, BorderLayout.SOUTH);

        JTextField textField = new JTextField(20);
        frame.add(textField, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
