
package atm.appllication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    
    JTextField cardno , pin ;
    JButton signin , clear , signup;
    
  Login(){
      
      getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
     
     JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        text.setBounds(190,30,300,30);
        add(text);
        
        JLabel lblcrdno  = new JLabel("Card No :");
        lblcrdno.setBounds(120,120,100,30);
        add(lblcrdno);
        
        cardno = new JTextField();
        cardno.setBounds(230,120,240,30);
        add(cardno);
        
        JLabel lblpin  = new JLabel("PIN :");
        lblpin.setBounds(120,180,100,30);
        add(lblpin);
        
        pin = new JTextField();
        pin.setBounds(230,180,240,30);
        add(pin);
        
        signin = new JButton("SIGN IN");
        signin.setBounds(150,250,100,30);
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);
        signin.addActionListener(this);
        add(signin);
        
        clear = new JButton("CLEAR");
        clear.setBounds(280,250,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(150,290,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
     
     
     
             
      
      
      setBounds(500,200,600,400);
        setVisible(true);
  }
    
    
    
     public void actionPerformed(ActionEvent ae){
         if (ae.getSource()== signin){
            JOptionPane.showMessageDialog(null, "Login Successfully"); 
            setVisible(false);
            new ATMAppllication();
        } else if(ae.getSource()== clear){
         cardno.setText(null);
        }
         
      
      
  }
    
    
    
    
    public static void main(String[] args) {
       new Login();
    }
}

 
    
