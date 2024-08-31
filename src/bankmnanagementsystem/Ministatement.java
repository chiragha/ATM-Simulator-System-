
package bankmnanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Ministatement extends JFrame{
      JLabel mini;
      String pinnum;
      
    Ministatement(String pinnum) {
        
        this.pinnum = pinnum;
        setLayout(null);
        
        mini = new JLabel();
        add(mini);
        
        JLabel l2 = new JLabel("Our Bank");
        l2.setBounds(150, 20, 100, 25);
        add(l2);
        
        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);
        
        JLabel balance = new JLabel();
        balance.setBounds(20, 480,400,40);
        add(balance);
        
        try {
              Conn c = new Conn();
              ResultSet rs= c.s.executeQuery("select * from login where pinnumber ='"+pinnum+"'");
              while(rs.next()){
              card.setText("Card Number: " + rs.getString("cardnumber").substring(0,4)+"XXXXXXXX"+ rs.getString("cardnumber").substring(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        try {
            Conn c = new Conn();
             int bal =0;
            ResultSet rs= c.s.executeQuery("select * from bank where pinnumber ='"+pinnum+"'");
            while(rs.next()){
               
                 mini.setText(mini.getText() + "<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                 if(rs.getString("type").equals("Deposit")){
                         bal += Integer.parseInt(rs.getString("amount"));
                 }else{
                          bal -= Integer.parseInt(rs.getString("amount"));
                      }
                    balance.setText("Your Current Balance is Rs " + bal);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        mini.setBounds(20, 100,400,330);
        
        
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Ministatement("");
    }
}
