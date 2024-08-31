
package bankmnanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JTextField tfcardno;
    JButton sign, clear, signup;
    JPasswordField lblpin;

    Login() {
//        Color blue = Color.decode("#19172e");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(i2);
      
        JLabel lblimage = new JLabel(image);
        lblimage.setBounds(130, 10, 100, 100);
        lblimage.setForeground(Color.WHITE);
        add(lblimage);
        
          
        JLabel heading = new JLabel("Welcome to ATM");
        heading.setBounds(250, 40, 450, 35);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 35));
        heading.setForeground(Color.BLACK);
        add(heading);
       
        
        
        
        JLabel lblcardno = new JLabel("Card No:");
        lblcardno.setBounds(180, 140, 90, 25);
        lblcardno.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(lblcardno);
        
        tfcardno = new JTextField();
        tfcardno.setBounds(280, 140, 180, 25);
        add(tfcardno);
        
        
        JLabel labelpin = new JLabel("PIN:");
        labelpin.setBounds(180, 180, 90, 25);
        labelpin.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(labelpin);
        
        lblpin = new JPasswordField();
        lblpin.setBounds(280, 180, 180, 25);
        add(lblpin);
        
        sign = new JButton("SIGN IN");
        sign.setBounds(200, 230, 120, 35);
        sign.addActionListener(this);
        add(sign);
        
        clear = new JButton("CLEAR");
        clear.setBounds(380, 230, 120, 35);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN-UP");
        signup.setBounds(200, 280, 300, 35);
        signup.addActionListener(this);
        add(signup);
        
        
        setTitle("AUTOMATED TELLER MACHINE");
        setSize(700,380);
        setLocation(350,120);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == sign){
            Conn conn = new Conn();
            String cardnum = tfcardno.getText();
            String pinnum = lblpin.getText();
            
            String query = "select * from login where cardnumber = '"+cardnum+"' and pinnumber = '"+pinnum+"'";
            
            try {
                ResultSet rs = conn.s.executeQuery(query);
                
                if(rs.next()){
                    setVisible(false);
                    new Transaction(pinnum);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(ae.getSource() == clear){
            tfcardno.setText("");
            lblpin.setText("");
        }else{
            setVisible(false);
            new Signupformone();
        }
    }
    
    
    public static void main(String[] args) {
        new Login();
        
    }
}
