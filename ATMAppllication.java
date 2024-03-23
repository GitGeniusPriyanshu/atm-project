
package atm.appllication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATMAppllication extends JFrame implements ActionListener {
    
    JButton deposit , fastcash , pinchange , cashwithdraw , ministatement , balanceenquiry , exit;
    
  ATMAppllication(){
      
      
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
     
        JLabel text = new JLabel("Please Select Your Transaction");
        text.setFont(new Font("Tahoma", Font.BOLD, 16));
        text.setBounds(170,30,300,30);
        add(text);
        
        
        deposit = new JButton("DEPOSIT");
        deposit.setBounds(10,120,200,40);
        deposit.setBackground(Color.BLACK);
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        add(deposit);
        
        fastcash = new JButton("FAST CASH");
        fastcash.setBounds(10,200,200,40);
        fastcash.setBackground(Color.BLACK);
        fastcash.setForeground(Color.WHITE);
        fastcash.addActionListener(this);
        add(fastcash);
        
        pinchange = new JButton("PIN CHANGE");
        pinchange.setBounds(10,280,200,40);
        pinchange.setBackground(Color.BLACK);
        pinchange.setForeground(Color.WHITE);
        pinchange.addActionListener(this);
        add(pinchange);
        
        cashwithdraw = new JButton("CASH WITHDRAWAL");
        cashwithdraw.setBounds(370,120,200,40);
        cashwithdraw.setBackground(Color.BLACK);
        cashwithdraw.setForeground(Color.WHITE);
        cashwithdraw.addActionListener(this);
        add(cashwithdraw);
        
        ministatement = new JButton("MINI STATEMENT");
        ministatement.setBounds(370,200,200,40);
        ministatement.setBackground(Color.BLACK);
        ministatement.setForeground(Color.WHITE);
        ministatement.addActionListener(this);
        add(ministatement);
        
        balanceenquiry = new JButton("BALANCE ENQUIRY");
        balanceenquiry.setBounds(370,280,200,40);
        balanceenquiry.setBackground(Color.BLACK);
        balanceenquiry.setForeground(Color.WHITE);
        balanceenquiry.addActionListener(this);
        add(balanceenquiry);
        
        exit = new JButton("EXIT");
        exit.setBounds(185,360,200,40);
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
      
      
      setBounds(500,200,600,500);
        setVisible(true);
        
        
}
  
  public void actionPerformed(ActionEvent ae){
       if (ae.getSource()== deposit){
            setVisible(false);
            new Deposit();
        } else if (ae.getSource()== cashwithdraw){
            setVisible(false);
            new CashWithdrawl();
        } else if (ae.getSource()== fastcash){
            setVisible(false);
            new Fastcash();
        } else if (ae.getSource()== pinchange){
            setVisible(false);
            new Pinchange();
        } else if (ae.getSource()== balanceenquiry){
            setVisible(false);
            new Balance();
        } 
      
      
  }
    
    public static void main(String[] args) {
       new ATMAppllication();
    }
    
}
