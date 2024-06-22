import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
    JFrame newFrame = new JFrame();
    JLabel label1 = new JLabel("Hello!");

    NewWindow(){
        label1.setBounds(0, 0, 100, 50);
        label1.setFont(new Font(null,Font.PLAIN,25));

        newFrame.add(label1);
        newFrame.setSize(420,420);
        newFrame.setLayout(null);
        newFrame.setVisible(true);
    }
}
