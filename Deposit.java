
package atm.appllication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Deposit extends JFrame implements ActionListener {
    
    JTextField amount;
    JButton confirm , cancel;
    Deposit(){
        
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
     JLabel lblamount = new JLabel("ENTER DEPOSIT AMOUNT");
        lblamount.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblamount.setBounds(140,30,300,30);
        add(lblamount);
        
        amount = new JTextField();
        amount.setBounds(140,90,200,30);
        add(amount);
        
        confirm = new JButton("CONFIRM");
        confirm.setBounds(100,180,100,30);
        confirm.setBackground(Color.BLACK);
        confirm.setForeground(Color.WHITE);
        confirm.addActionListener(this);
        add(confirm);
        
        cancel = new JButton("CANCEL");
        cancel.setBounds(280,180,100,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
     
     
     
     setBounds(500,200,500,300);
     setVisible(true);
        
    }
    
    
    
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== confirm){
            JOptionPane.showMessageDialog(null, "Deposit Successfully"); 
            
        } else if(ae.getSource()== cancel){
         setVisible(false);
         new ATMAppllication();
        }
      
      
  }
    
    
     public static void main(String[] args) {
       new Deposit();
    }
}
