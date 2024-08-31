
package bankmnanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Pinchange extends JFrame implements ActionListener{
      
    JTextField npin, repin;
    JButton change, back;
    String pinnum;
    
    
    Pinchange(String pinnum) {
        this.pinnum = pinnum;
        Color formColor = new Color(53, 59, 72);
        getContentPane().setBackground(formColor);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/pinc.png"));
        Image i2 = i1.getImage().getScaledInstance(310, 280, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(30,30,310,280);
        add(image);
        
        JLabel lblcardno = new JLabel("Change your PIN");
        lblcardno.setBounds(450, 30, 350, 35);
        lblcardno.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblcardno.setForeground(Color.red);
        add(lblcardno);
        
        JLabel txtpin = new JLabel("New PIN:");
        txtpin.setBounds(350, 100, 150, 35);
        txtpin.setFont(new Font("Tahoma", Font.BOLD, 15));
        txtpin.setForeground(Color.WHITE);
        add(txtpin);
        
        
        npin = new JTextField();
        npin.setBounds(500, 100, 230, 25);
        npin.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(npin);
        
        
        JLabel txtre = new JLabel("Re-Enter New PIN");
        txtre.setBounds(350, 150, 350, 35);
        txtre.setFont(new Font("Tahoma", Font.BOLD, 15));
        txtre.setForeground(Color.WHITE);
        add(txtre);
        
        repin = new JTextField();
        repin.setBounds(500, 150, 230, 25);
        repin.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(repin);
     
        change = new JButton("Change");
        change.setBounds(380, 240, 150, 35);
        change.addActionListener(this);
        add(change);
        
        back = new JButton("Back");
        back.setBounds(560, 240, 150, 35);
        back.addActionListener(this);
        add(back);
        
    
        setSize(800,400);
        setLocation(300,50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==change){
            try {
            String newpin = npin.getText();
            String repin = this.repin.getText();
            
            if(!newpin.equals(repin)){
                JOptionPane.showMessageDialog(null, "Entered Pin does not match");
                return;
            }
             if(newpin.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter Pin");
                return;
            }
              if(repin.equals("")){
                JOptionPane.showMessageDialog(null, "Please Re-Enter Pin");
                return;
            }
              
              Conn c = new Conn();
              String query1 = "update bank set pinnumber = '"+repin+"' where pinnumber ='"+pinnum+"' ";
              String query2 = "update login set pinnumber = '"+repin+"' where pinnumber ='"+pinnum+"' ";
              String query3 = "update signupthree set pinnumber = '"+repin+"' where pinnumber ='"+pinnum+"' ";
              
              c.s.executeUpdate(query1);
              c.s.executeUpdate(query2);
              c.s.executeUpdate(query3);
              
              JOptionPane.showMessageDialog(null, "Pin changed successfully");
                setVisible(false);
                new Transaction(repin);
        } catch (Exception e) {
            e.printStackTrace();
        }
       }else{
           setVisible(false);
           new Transaction(pinnum);
       }
        
    }
    public static void main(String[] args) {
        new Pinchange("");
    }
    
}
