
package atm.appllication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fastcash extends JFrame implements ActionListener{
    
    JButton rs1 , rs2 , rs3 , rs4 , rs5 , rs6 , confirm , cancel; 
  Fastcash(){
      
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
     
     JLabel text = new JLabel("FAST CASH");
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        text.setBounds(170,30,300,30);
        add(text);
        
        rs1 = new JButton("RS 100");
        rs1.setBounds(40,100,100,40);
        rs1.setBackground(Color.BLACK);
        rs1.setForeground(Color.WHITE);
        rs1.addActionListener(this);
        add(rs1);
        
        rs2 = new JButton("RS 1000");
        rs2.setBounds(40,180,100,40);
        rs2.setBackground(Color.BLACK);
        rs2.setForeground(Color.WHITE);
        rs2.addActionListener(this);
        add(rs2);
        
        rs3 = new JButton("RS 5000");
        rs3.setBounds(40,260,100,40);
        rs3.setBackground(Color.BLACK);
        rs3.setForeground(Color.WHITE);
        rs3.addActionListener(this);
        add(rs3);
        
        rs4 = new JButton("RS 500");
        rs4.setBounds(300,100,100,40);
        rs4.setBackground(Color.BLACK);
        rs4.setForeground(Color.WHITE);
        rs4.addActionListener(this);
        add(rs4);
        
        rs5 = new JButton("RS 2000");
        rs5.setBounds(300,180,100,40);
        rs5.setBackground(Color.BLACK);
        rs5.setForeground(Color.WHITE);
        rs5.addActionListener(this);
        add(rs5);
        
        rs6 = new JButton("RS 10000");
        rs6.setBounds(300,260,100,40);
        rs6.setBackground(Color.BLACK);
        rs6.setForeground(Color.WHITE);
        rs6.addActionListener(this);
        add(rs6);
        
        
        cancel = new JButton("BACK");
        cancel.setBounds(170,350,100,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
         
        
      
      
       setBounds(500,200,470,450);
        setVisible(true);
      
  }
    
    
    
  
  public void actionPerformed(ActionEvent ae){
      if (ae.getSource()== cancel){
          setVisible(false);
          new ATMAppllication();
      }
      
  }
    
    
    
    public static void main(String[] args){
        new Fastcash();
    }
}
