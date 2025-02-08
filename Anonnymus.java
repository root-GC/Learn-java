import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
/* 
 * Anonnymus declaration
 * 
 * 
 * 
*/
public class Anonnymus {
     JLabel card;

     Anonnymus() {
          System.out.println("Hello world");
     }

     public static void main(String game[]) {
          JFrame frame = new JFrame();

          ArrayList<JLabel> deck = new ArrayList<JLabel>();
          

          deck.add(new JLabel(new ImageIcon("img/free.png")));//Anonnymus declaration

          frame.add(deck.get(0));
          frame.setSize(500, 500);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setLayout(new FlowLayout());
          frame.setVisible(true);

     }

}