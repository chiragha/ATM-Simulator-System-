
package bankmnanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class Fastcash extends JFrame implements ActionListener{
    JButton hund,five,thous,twok,fivek,tenk,exit;
    String pinnum;
    
    Fastcash(String pinnum) {
        
        this.pinnum = pinnum;
        setLayout(null);
        
        
         //side image
        Color formColor = new Color(53, 59, 72);
        getContentPane().setBackground(formColor);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/cash.png"));
        Image i2 = i1.getImage().getScaledInstance(350, 380, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20,20,350,380);
        add(image);
        
        JLabel lblcardno = new JLabel("Select Withdrawl Amount");
        lblcardno.setBounds(245, 40, 400, 25);
        lblcardno.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblcardno.setForeground(Color.red);
        add(lblcardno);
        
        hund = new JButton("Rs 100");
        hund.setBounds(420, 120, 150, 35);
        hund.addActionListener(this);
        add(hund);
        
        five = new JButton("Rs 500");
        five.setBounds(600, 120, 150, 35);
        five.addActionListener(this);
        add(five);
        
        thous = new JButton("Rs 1000");
        thous.setBounds(420, 180, 150, 35);
        thous.addActionListener(this);
        add(thous);
        
        twok = new JButton("Rs 2000");
        twok.setBounds(600, 180, 150, 35);
        twok.addActionListener(this);
        add(twok);
        
        fivek = new JButton("Rs 5000");
        fivek.setBounds(420, 240, 150, 35);
        fivek.addActionListener(this);
        add(fivek);
        
        tenk = new JButton("Rs 10000");
        tenk.setBounds(600, 240, 150, 35);
        tenk.addActionListener(this);
        add(tenk);
        
         exit = new JButton("BACK");
        exit.setBounds(620, 320, 120, 35);
        exit.addActionListener(this);
         exit.setBackground(Color.red);
         exit.setForeground(Color.WHITE);
        add(exit);
        
        
        
        setSize(800,420);
        setLocation(300,50);
//        setUndecorated(true);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()== exit){
             setVisible(false);
             new Transaction(pinnum);
         }else{
             String amount = ((JButton)ae.getSource()).getText().substring(3);
             Conn c = new Conn();
             try {
                 ResultSet rs = c.s.executeQuery("select * from bank where pinnumber = '"+pinnum+"'");
                 int balance =0;
                 while(rs.next()){
                     if(rs.getString("type").equals("Deposit")){
                         balance += Integer.parseInt(rs.getString("amount"));
                     }else{
                          balance -= Integer.parseInt(rs.getString("amount"));
                     }
                     if(ae.getSource()!=exit && balance < Integer.parseInt(amount)){
                         JOptionPane.showMessageDialog(null, "Insufficient Balance");
                         return;
                     }
                     
                     Date date = new Date();
                     String query = "insert into bank values('"+pinnum+"','"+date+"','Withdrawl','"+amount+"')";
                     c.s.executeUpdate(query);
                     JOptionPane.showMessageDialog(null, "Rs "+ amount+ " Debited Successfully");
                     setVisible(false);
                     new Transaction(pinnum);
                 }
             } catch (Exception e) {
                 e.printStackTrace();
             }
         }
     }    
    
    
    public static void main(String[] args) {
        new Fastcash("");
    }
    
}
