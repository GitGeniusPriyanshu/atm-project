
package atm.appllication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ministatement extends JFrame implements ActionListener  {
    JTable table;
    Ministatement(){
        
          getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("MINI STATEMENT");
        text.setFont(new Font("Tahoma", Font.PLAIN, 20));
        text.setBounds(200,30,200,30);
        add(text);
           
  
        JLabel l1 = new JLabel("Title1");
        l1.setBounds(50,120,100,20);
        add(l1);
        
        JLabel l2 = new JLabel("Title2");
        l2.setBounds(200,120,100,20);
        add(l2);
        
        JLabel l3 = new JLabel("Title3");
        l3.setBounds(330,120,100,20);
        add(l3);
        
        JLabel l4 = new JLabel("Title4");
        l4.setBounds(460,120,100,20);
        add(l4);
        
        table = new JTable();
        table.setBounds(0,200,500,300);
        add(table);
        
        setBounds(500,200,600,400);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
    }
    
    
    public static void main(String[] args){
        new Ministatement();
    }
}
