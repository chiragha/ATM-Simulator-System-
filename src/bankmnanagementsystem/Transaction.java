
package bankmnanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Transaction extends JFrame implements ActionListener{
    JButton deposit,withdrawl,fast,mini,Pin,enquiry,exit;
    String pinnum;
    
    Transaction(String pinnum) {
        
        this.pinnum = pinnum;
        setLayout(null);
        
        
         //side image
        Color formColor = new Color(53, 59, 72);
        getContentPane().setBackground(formColor);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(350, 380, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(30,30,350,380);
        add(image);
        
        JLabel lblcardno = new JLabel("Select Your Transaction");
        lblcardno.setBounds(435, 30, 400, 25);
        lblcardno.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblcardno.setForeground(Color.red);
        add(lblcardno);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(420, 100, 150, 35);
        deposit.addActionListener(this);
        add(deposit);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(600, 100, 150, 35);
        withdrawl.addActionListener(this);
        add(withdrawl);
        
        fast = new JButton("Fast Cash");
        fast.setBounds(420, 160, 150, 35);
        fast.addActionListener(this);
        add(fast);
        
         mini = new JButton("Mini Statement");
        mini.setBounds(600, 160, 150, 35);
        mini.addActionListener(this);
        add(mini);
        
         Pin = new JButton("Pin Change");
        Pin.setBounds(420, 220, 150, 35);
        Pin.addActionListener(this);
        add(Pin);
        
         enquiry = new JButton("Balance Enquiry");
        enquiry.setBounds(600, 220, 150, 35);
        enquiry.addActionListener(this);
        add(enquiry);
        
         exit = new JButton("EXIT");
        exit.setBounds(620, 340, 120, 35);
        exit.addActionListener(this);
         exit.setBackground(Color.red);
         exit.setForeground(Color.WHITE);
        add(exit);
        
        
        
        setSize(800,450);
        setLocation(300,50);
        setUndecorated(true);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()== exit){
             System.exit(0);
         }else if(ae.getSource() == deposit){
             setVisible(false);
             new Deposit(pinnum);
         }else if(ae.getSource()==withdrawl){
             setVisible(false);
             new Withdrawl(pinnum);
         }else if(ae.getSource() == fast){
             setVisible(false);
             new Fastcash(pinnum);
         }else if(ae.getSource() == Pin){
             setVisible(false);
             new Pinchange(pinnum);
         }else if(ae.getSource() == enquiry){
              setVisible(false);
             new BalanceEnquiry(pinnum);
         }else if(ae.getSource()== mini){
          
             new Ministatement(pinnum);
         }
     }    
    
    
    public static void main(String[] args) {
        new Transaction("");
    }
    
}
