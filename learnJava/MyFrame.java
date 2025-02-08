package learnJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

     JButton button1 = new JButton("Button #1");
     JButton button2 = new JButton("Button #2");
     JButton button3 = new JButton("Button #3");

     MyFrame() {
          button1.setBounds(100, 100, 100, 100);
          button2.setBounds(200, 100, 100, 100);
          button3.setBounds(300, 100, 100, 100);

          /*
           * #Ao inves de:
           * 1.implements Actionlistener
           * 2.addActionListener(this); para todos os botoes
           * 3.Override protecter void actionPerformed(ActionEvent e){}
           * 
           * pode ustilizar a seguinte forma:
           */
          button1.addActionListener(new ActionListener() {

               @Override
               public void actionPerformed(ActionEvent e) {
                    System.out.println("You pressed me!");
               }
          });

          this.add(button1);
          this.add(button2);
          this.add(button3);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setSize(500, 500);
          this.setLayout(null);
          this.setVisible(true);
     }
}
