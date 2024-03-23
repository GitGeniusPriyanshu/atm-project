
package atm.appllication;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pinchange extends JFrame implements ActionListener {
    
    JTextField pin , pin2 ;
    JButton change , back;
   Pinchange(){
       
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
       JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        text.setBounds(120,30,300,30);
        add(text);
        
        JLabel lblpin  = new JLabel("NEW PIN :");
        lblpin.setBounds(90,120,100,30);
        add(lblpin);
        
        pin = new JTextField();
        pin.setBounds(160,120,240,30);
        add(pin);
        
        JLabel lblpin2  = new JLabel("CONFIRM PIN :");
        lblpin2.setBounds(60,180,100,30);
        add(lblpin2);
        
        pin2 = new JTextField();
        pin2.setBounds(160,180,240,30);
        add(pin2);
        
        change = new JButton("CHANGE");
        change.setBounds(110,250,100,30);
        change.setBackground(Color.BLACK);
        change.setForeground(Color.WHITE);
        change.addActionListener(this);
        add(change);
        
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
       if (ae.getSource()== change){
           JOptionPane.showMessageDialog(null, "Pin Change Successfully");
       } else if(ae.getSource()== back){
           setVisible(false);
           new ATMAppllication();
       }
       
   }
    
    
    public static void main(String[] args){
        new Pinchange();
    }
}
