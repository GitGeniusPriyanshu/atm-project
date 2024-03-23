
package atm.appllication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CashWithdrawl  extends JFrame implements ActionListener{
    
    JButton savings , current , cancel;
    
    CashWithdrawl(){
        
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
     JLabel lblamount = new JLabel("CASH WITHDRAWAL");
        lblamount.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblamount.setBounds(160,30,300,30);
        add(lblamount);
        
        savings = new JButton("SAVINGS");
        savings.setBounds(100,120,100,30);
        savings.setBackground(Color.BLACK);
        savings.setForeground(Color.WHITE);
        savings.addActionListener(this);
        add(savings);
        
        current = new JButton("CURRENT");
        current.setBounds(280,120,100,30);
        current.setBackground(Color.BLACK);
        current.setForeground(Color.WHITE);
        current.addActionListener(this);
        add(current);
        
        cancel = new JButton("CANCEL");
        cancel.setBounds(190,180,100,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
     
     
     setBounds(500,200,500,300);
     setVisible(true);
        
        
    }
    
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== savings){
            setVisible(false);
            new Savings();
        } else if(ae.getSource()== current){
            setVisible(false);
            new Current();
        } else if(ae.getSource()== cancel){
            setVisible(false);
            new ATMAppllication();
        }
        
    }
    
    
    
    
    public static void main(String[] args) {
       new CashWithdrawl ();
    }
}
