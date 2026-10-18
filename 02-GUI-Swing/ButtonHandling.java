package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonHandling {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button click Handling");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        frame.setLayout(new BorderLayout());

        frame.add(button, BorderLayout.WEST);
        frame.setSize(400, 400);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }

        });





        frame.setVisible(true);

    }
}
