import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // JOptionPane.showMessageDialog(null, "This is palin dialog box", "title", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is information message", "title", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Is this a question message?", "title", JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is a WARNING MESSAGE", "title", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some ERROR MESSAGE", "title", JOptionPane.ERROR_MESSAGE);
        // int anwer = JOptionPane.showConfirmDialog(null, "do you even code?","Title", JOptionPane.YES_NO_CANCEL_OPTION);
        
        // String name = JOptionPane.showInputDialog("What is yourname: ");
        // System.out.println("Hello "+ name);
        String[] responses = {"No, You are Awsome!","Thank you","Thanks a lot!"};
        JOptionPane.showOptionDialog(null,
                                         "You arre awsome!",
                                          "Title",
                                           JOptionPane.YES_NO_CANCEL_OPTION,
                                            JOptionPane.INFORMATION_MESSAGE,
                                            null,
                                            responses,
                                             0);
    }


}
