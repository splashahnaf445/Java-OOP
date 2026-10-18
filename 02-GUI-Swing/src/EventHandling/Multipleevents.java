package EventHandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Multipleevents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiple Events");
        frame.setSize(600,500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());


        JButton button = new JButton("Click Me");
        frame.add(button, BorderLayout.SOUTH);

        JLabel label = new JLabel("Think about an animal");
        frame.add(label, BorderLayout.NORTH);

        JTextField text = new JTextField(20);
        frame.add(text, BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"You guessed about: "+text.getText());
            }

        });
        text.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"HEy Fool! Click the button beneath!");
            }
        });
        frame.setVisible(true);


    }
}
