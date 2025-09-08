import javax.swing.JOptionPane;

public class UsinggJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            
            String name = JOptionPane.showInputDialog(null, "Enter your name:");

            if (name == null) {
                JOptionPane.showMessageDialog(null, "Program exited.");
                break;
            }

            int choice = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want your name to be displayed?",
                    "Confirm",
                    JOptionPane.YES_NO_CANCEL_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Your name is: " + name);
                break; 
                 } else if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CANCEL_OPTION) {
      
                continue;
            } else if (choice == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Program exited.");
                break;
            }
        }
    }
}