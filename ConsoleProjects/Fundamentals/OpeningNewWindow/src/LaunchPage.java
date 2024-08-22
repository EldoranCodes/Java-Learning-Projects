

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{
    JFrame frame = new JFrame();
    JButton mybtn = new JButton("New Window");

    LaunchPage(){

        mybtn.setBounds(100, 160, 200, 40);
        mybtn.setFocusable(false);
        mybtn.addActionListener((ActionListener) this);

        frame.add(mybtn);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==mybtn){
            frame.dispose();
            NewWindow  nw = new NewWindow();
        }
    }
  
}
