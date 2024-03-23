
package atm.appllication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pin extends JFrame implements ActionListener {
    
    JTextField pin;
    JButton ok;
    Pin(){
        
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
     
     JLabel lblamount = new JLabel("ENTER A PIN");
        lblamount.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblamount.setBounds(180,30,300,30);
        add(lblamount);
        
        pin = new JTextField();
        pin.setBounds(160,90,150,30);
        add(pin);
        
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
          JOptionPane.showMessageDialog(null, "Please Collect Your Cash");
          setVisible(false);
          new ATMAppllication();
        }
        
        
    }
    
    
     public static void main(String[] args) {
       new Pin();
    }
     
     
}
