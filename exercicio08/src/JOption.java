
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class JOption {

         private static JOptionPane pane = new JOptionPane ("Testing...");
         private static JDialog dialog = pane.createDialog(null, "Dispose");

         public static void main(String[] args) {

                   Timer timer = new Timer(3000, 
                            new ActionListener() {
                                   public void actionPerformed(ActionEvent evt) {
                                             dialog.dispose();
                                   }
                            });

                   timer.setRepeats(false);
                   timer.start();
                   dialog.show();
                   timer.stop();

                   System.exit(0);
         }

}

