
package atm.appllication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Balance extends JFrame implements ActionListener{
    JTextField no;
    JButton back , check;
    
    Balance(){
       
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
      JLabel text = new JLabel("BALANCE ENQUIRY");
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        text.setBounds(120,30,300,30);
        add(text);
        
        JLabel lblno  = new JLabel("ACCOUNT NO :");
        lblno.setBounds(60,120,100,30);
        add(lblno);
        
        no = new JTextField();
        no.setBounds(160,120,240,30);
        add(no);
        
         JLabel lblno2  = new JLabel("YOUR BALANCE:");
        lblno2.setBounds(50,180,100,30);
        add(lblno2);
        
        check = new JButton("CHECK");
        check.setBounds(110,250,100,30);
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        check.addActionListener(this);
        add(check);
        
        
        back = new JButton("BACK");
        back.setBounds(240,250,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        
       setBounds(500,200,470,350);
       setVisible(true);
    }
  
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== back ){
            setVisible(false);
            new ATMAppllication();
        }
        
    }
    
    
    
    public static void main(String[] args){
        new Balance();
    }
}
