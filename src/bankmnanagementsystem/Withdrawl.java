
package bankmnanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Withdrawl extends JFrame implements ActionListener{
      
    JTextField amount;
    JButton withdrawl, back;
    String pinnum;
    
    
    Withdrawl(String pinnum) {
        this.pinnum = pinnum;
        Color formColor = new Color(53, 59, 72);
        getContentPane().setBackground(formColor);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/withdraw.png"));
        Image i2 = i1.getImage().getScaledInstance(330, 280, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(30,30,330,280);
        add(image);
        
        JLabel lblcardno = new JLabel("Enter the amount you want to withdrawl");
        lblcardno.setBounds(410, 70, 350, 25);
        lblcardno.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblcardno.setForeground(Color.red);
        add(lblcardno);
        
        amount = new JTextField();
        amount.setBounds(410, 100, 350, 25);
        amount.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(amount);
        
        
        withdrawl = new JButton("Amount Withdraw");
        withdrawl.setBounds(410, 180, 150, 35);
        withdrawl.addActionListener(this);
        add(withdrawl);
        
        back = new JButton("Back");
        back.setBounds(600, 180, 150, 35);
        back.addActionListener(this);
        add(back);
        
    
        setSize(800,400);
        setLocation(300,50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==withdrawl){
            
            String aamount = amount.getText();
            Date date = new Date();
            
            if(aamount.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter the amount you want to Deposit");
            }else{
                try {
                    Conn c = new Conn();
                String query = "insert into bank values('"+pinnum+"','"+date+"','Withdrawl','"+aamount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+aamount +" Withdrawl Successfully");
                    setVisible(false);
                    new Transaction(pinnum);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
        }else if(ae.getSource() == back){
            setVisible(false);
            new Transaction(pinnum);
        }
        
    }
    public static void main(String[] args) {
        new Withdrawl("");
    }
    
}
