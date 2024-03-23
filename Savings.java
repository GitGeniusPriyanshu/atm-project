
package atm.appllication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Savings extends JFrame implements ActionListener {
    
    JTextField amount;
    JButton ok;
    Savings(){
        
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
     
     JLabel lblamount = new JLabel("ENTER AMOUNT");
        lblamount.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblamount.setBounds(170,30,300,30);
        add(lblamount);
        
        amount = new JTextField();
        amount.setBounds(160,90,150,30);
        add(amount);
        
        ok = new JButton("OK");
        ok.setBounds(200,160,70,30);
        ok.setBackground(Color.BLACK);
        ok.setForeground(Color.WHITE);
        ok.addActionListener(this);
        add(ok);
     
     
     setBounds(500,200,500,300);
     setVisible(true);
        
        
    }
    
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== ok){
          setVisible(false);
          new Pin();
        }
        
        
    }
    
    
     public static void main(String[] args) {
       new Savings();
    }
     
     
}
