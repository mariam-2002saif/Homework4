import javax.swing.*;
import java.awt.*;

public class Q10 {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setSize(400,400);
        JLabel label=new JLabel("Hello,Mariam!");
        label.setOpaque(true);
        label.setBackground(Color.green.brighter());
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(new JLabel(new ImageIcon("C:\\Users\\Mariam\\Pictures\\Saved Pictures")));
    }
}
