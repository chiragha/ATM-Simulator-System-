
package bankmnanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
      
    JTextField npin, repin;
    JButton change, back;
    String pinnum;
    
    
    BalanceEnquiry(String pinnum) {
        this.pinnum = pinnum;
        Color formColor = new Color(53, 59, 72);
        getContentPane().setBackground(formColor);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/information.png"));
        Image i2 = i1.getImage().getScaledInstance(310, 280, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(30,30,310,280);
        add(image);
        
        
        back = new JButton("Back");
        back.setBounds(560, 240, 150, 35);
        back.addActionListener(this);
        add(back);
        
         int balance =0;
         Conn c = new Conn();
             try {
                 ResultSet rs = c.s.executeQuery("select * from bank where pinnumber = '"+pinnum+"'");
                
                 while(rs.next()){
                     if(rs.getString("type").equals("Deposit")){
                         balance += Integer.parseInt(rs.getString("amount"));
                     }else{
                          balance -= Integer.parseInt(rs.getString("amount"));
                     }
                 }
             }catch(Exception e){
                 e.printStackTrace();
             }
             
             JLabel text = new JLabel("Your Current Account Balance is Rs "+ balance);
             text.setBounds(390, 70, 450, 25);
             text.setFont(new Font("Tahoma", Font.BOLD, 18));
             text.setForeground(Color.red);
             add(text);
        
    
        setSize(800,400);
        setLocation(300,50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transaction(pinnum);
        
    }
    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
    
}
