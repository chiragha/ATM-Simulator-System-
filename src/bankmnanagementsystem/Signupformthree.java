
package bankmnanagementsystem;


import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.sql.*;


public class Signupformthree extends JFrame implements ActionListener{
    
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit ,cancel;
    String formno;

    Signupformthree(String Formno) {
        
        this.formno=formno;
        
         Color formColor = new Color(53, 59, 72);
         getContentPane().setBackground(formColor);
         setLayout(null);
      
        setTitle("New Application Form: Page 3");
         
        JLabel subheading = new JLabel("Page 3: Account Details");
        subheading.setBounds(250, 30, 450, 35);
        subheading.setFont(new Font("Tahoma", Font.PLAIN, 25));
        subheading.setForeground(Color.WHITE);
        add(subheading);
        
        JLabel lbladd = new JLabel("Account Type:");
        lbladd.setBounds(100, 100, 150, 25);
        lbladd.setFont(new Font("Tahoma", Font.BOLD, 18));
        lbladd.setForeground(Color.WHITE);
        add(lbladd);
        
      
       r1 = new JRadioButton("Saving Account");
       r1.setBounds(290, 100, 150, 25);
       r1.setBackground(formColor);
       r1.setForeground(Color.WHITE);
       r1.setFont(new Font("Tahoma", Font.BOLD, 15));
       add(r1);
       
       r2 = new JRadioButton("Fixed Deposit Account");
       r2.setBounds(450, 100, 210, 25);
       r2.setFont(new Font("Tahoma", Font.BOLD, 15));
       r2.setForeground(Color.WHITE);
       r2.setBackground(formColor);
       add(r2);
       
       r3 = new JRadioButton("Current Account");
       r3.setBounds(290, 150, 150, 25);
       r3.setBackground(formColor);
       r3.setForeground(Color.WHITE);
       r3.setFont(new Font("Tahoma", Font.BOLD, 15));
       add(r3);
       
       r4 = new JRadioButton("Recurring Deposit Account");
       r4.setBounds(450, 150, 240, 25);
       r4.setFont(new Font("Tahoma", Font.BOLD, 15));
       r4.setForeground(Color.WHITE);
       r4.setBackground(formColor);
       add(r4);
      
       ButtonGroup atype = new ButtonGroup();
        atype.add(r1);
        atype.add(r2);
        atype.add(r3);
        atype.add(r4);
        
        
        //card number
        JLabel lblcard = new JLabel("Card Number:");
        lblcard.setBounds(100, 200, 150, 25);
        lblcard.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblcard.setForeground(Color.WHITE);
        add(lblcard);
        
        JLabel num = new JLabel("XXXX-XXXX-XXXX-4104");
        num.setBounds(290, 200, 250, 25);
        num.setFont(new Font("Tahoma", Font.BOLD, 18));
        num.setForeground(Color.WHITE);
        add(num);
        JLabel card = new JLabel("Your 16 digit Card Number");
        card.setBounds(100, 220, 200, 25);
        card.setFont(new Font("Tahoma", Font.BOLD, 10));
        card.setForeground(Color.WHITE);
        add(card);
        
        
         //pin number
        JLabel pin = new JLabel("Pin:");
        pin.setBounds(100, 260, 150, 25);
        pin.setFont(new Font("Tahoma", Font.BOLD, 18));
        pin.setForeground(Color.WHITE);
        add(pin);
        
        JLabel pnum = new JLabel("XXXX");
        pnum.setBounds(290, 260, 250, 25);
        pnum.setFont(new Font("Tahoma", Font.BOLD, 18));
        pnum.setForeground(Color.WHITE);
        add(pnum);
        
        JLabel pininfo = new JLabel("Your 4 Digit Pin Number");
        pininfo.setBounds(100, 280, 150, 25);
        pininfo.setFont(new Font("Tahoma", Font.BOLD, 10));
        pininfo.setForeground(Color.WHITE);
        add(pininfo);
        
        JLabel services = new JLabel("Services Required:");
        services.setBounds(100, 320, 200, 25);
        services.setFont(new Font("Tahoma", Font.BOLD, 18));
        services.setForeground(Color.WHITE);
        add(services);
        
        c1 = new JCheckBox("ATM Card");
        c1.setBounds(100, 360, 200, 25);
        c1.setFont(new Font("Tahoma", Font.BOLD, 15));
        c1.setBackground(formColor);
        c1.setForeground(Color.WHITE);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBounds(330, 360, 250, 25);
        c2.setFont(new Font("Tahoma", Font.BOLD, 15));
        c2.setBackground(formColor);
        c2.setForeground(Color.WHITE);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBounds(100, 400, 200, 25);
        c3.setFont(new Font("Tahoma", Font.BOLD, 15));
        c3.setForeground(Color.WHITE);
        c3.setBackground(formColor);
        add(c3);
        
        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setBounds(330, 400, 200, 25);
        c4.setFont(new Font("Tahoma", Font.BOLD, 15));
        c4.setBackground(formColor);
        c4.setForeground(Color.WHITE);
        
        add(c4);
        
        c5 = new JCheckBox("Cheque");
        c5.setBounds(100, 440, 200, 25);
        c5.setFont(new Font("Tahoma", Font.BOLD, 15));
        c5.setBackground(formColor);
        c5.setForeground(Color.WHITE);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBounds(330, 440, 200, 25);
        c6.setFont(new Font("Tahoma", Font.BOLD, 15));
        c6.setBackground(formColor);
        c6.setForeground(Color.WHITE);
        add(c6);
        
        c7 = new JCheckBox("I Here declared that the above entered details are correct to the best of my knowledge");
        c7.setBounds(100, 520, 600, 25);
        c7.setFont(new Font("Tahoma", Font.BOLD, 12));
        c7.setBackground(formColor);
        c7.setForeground(Color.WHITE);
        add(c7);
        
    
        
        submit = new JButton("SUBMIT");
        submit.setBounds(220, 580, 120, 35);
        submit.addActionListener(this);
        add(submit);
        
         cancel = new JButton("CANCEL");
         cancel.setBounds(380, 580, 120, 35);
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        setSize(800,700);
        setLocation(300,30);
        setVisible(true);
    }
    
    
    public  void actionPerformed(ActionEvent ae){
        if(ae.getSource()== submit){
            String acctype = "";
         if(r1.isSelected()){
             acctype = "Saving Account";
         }else if (r2.isSelected()){
             acctype = "Fixed Deposit Account";
         }else if (r3.isSelected()){
             acctype = "Current Account";
         }else if (r4.isSelected()){
             acctype = "Recurring Deposit Account";
         }
         
         Random random = new Random();
         String cardnumber = "" + Math.abs((random.nextLong() % 90000000L ) + 57890457000000000L);
         String pinnumber = "" + Math.abs((random.nextLong() % 9000L ) + 1000L);
         
         
         String facility = "";
         
        if(c1.isSelected()){ 
            facility = facility + " ATM Card";
        }
        
        if(c2.isSelected()){
            facility = facility + " Internet Banking";
        }
        
        if(c3.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        
        if(c4.isSelected()){ 
            facility = facility + " EMAIL Alerts";
        }
        
        if(c5.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        
        if(c6.isSelected()){ 
            facility = facility + " E-Statement";
        }
         
            try {
                Conn c = new Conn();
             String query1 = "insert into signupthree values('"+formno+"','"+acctype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
             String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
             c.s.executeUpdate(query1);
             c.s.executeUpdate(query2);
             JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber +"\n PIN: " +pinnumber);
             setVisible(false);
             new Deposit(pinnumber);
             new Login();
            } catch (Exception e) {
            }
            
        }else if(ae.getSource() == cancel){
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Signupformthree("");
    }
    
}
