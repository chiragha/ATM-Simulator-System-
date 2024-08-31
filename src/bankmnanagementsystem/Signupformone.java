
package bankmnanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
//import static java.lang.Math.random;

public class Signupformone extends JFrame implements ActionListener{
    JTextField tfname,tffname,tfemail,tfadd,tffcity,tffpcode,tfstate;
    JRadioButton rbmale, rbfemale, rbmrrd, rbunmrrd,rbother;
    JDateChooser dcdate;
    JButton next;
     
        
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

     Signupformone() {
         
        Color formColor = new Color(53, 59, 72);
        getContentPane().setBackground(formColor);
        setLayout(null);
        
       
        
        JLabel formno = new JLabel("APPLICATION FORM NO: " + random);
        formno.setBounds(110, 30, 550, 45);
        formno.setFont(new Font("Tahoma", Font.BOLD, 35));
        formno.setForeground(Color.WHITE);
        add(formno);
        
         
        JLabel subheading = new JLabel("Page 1: Personal Details");
        subheading.setBounds(250, 80, 450, 35);
        subheading.setFont(new Font("Tahoma", Font.PLAIN, 25));
        subheading.setForeground(Color.WHITE);
        add(subheading);
        
        
        //////details
        
        JLabel lblname = new JLabel("Name:");
        lblname.setBounds(100, 140, 150, 25);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblname.setForeground(Color.WHITE);
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(250, 140, 400, 25);
        tfname.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tfname);
        
        
        JLabel lblfname = new JLabel("Father's Name:");
        lblfname.setBounds(100, 180, 150, 25);
        lblfname.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblfname.setForeground(Color.WHITE);
        add(lblfname);
        
        tffname = new JTextField();
        tffname.setBounds(250, 180, 400, 25);
        tffname.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tffname);
        
        
        JLabel lbldate = new JLabel("Date:");
        lbldate.setBounds(100, 220, 150, 25);
        lbldate.setFont(new Font("Tahoma", Font.BOLD, 18));
        lbldate.setForeground(Color.WHITE);
        add(lbldate);
        
        dcdate = new JDateChooser();
        dcdate.setBounds(250, 220, 400, 25);
        dcdate.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(dcdate);
        
        
        JLabel lblgender = new JLabel("Gender:");
        lblgender.setBounds(100, 260, 150, 25);
        lblgender.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblgender.setForeground(Color.WHITE);
        add(lblgender);
        
       rbmale = new JRadioButton("Male");
       rbmale.setBounds(250, 260, 100, 25);
       rbmale.setBackground(formColor);
       rbmale.setForeground(Color.WHITE);
       rbmale.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(rbmale);
       
       rbfemale = new JRadioButton("Female");
       rbfemale.setBounds(350, 260, 100, 25);
       rbfemale.setFont(new Font("Tahoma", Font.BOLD, 15));
       rbfemale.setForeground(Color.WHITE);
       rbfemale.setBackground(formColor);
       add(rbfemale);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(rbmale);
        gendergroup.add(rbfemale);
        
        
        JLabel lblemail = new JLabel("Email:");
        lblemail.setBounds(100, 300, 150, 25);
        lblemail.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblemail.setForeground(Color.WHITE);
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(250, 300, 400, 25);
        tfemail.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tfemail);
        
        
        
        
        
        
        JLabel lblmstatus = new JLabel("Marital Status:");
        lblmstatus.setBounds(100, 340, 150, 25);
        lblmstatus.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblmstatus.setForeground(Color.WHITE);
        add(lblmstatus);
        
       rbmrrd = new JRadioButton("Married");
       rbmrrd.setBounds(250, 340, 100, 25);
       rbmrrd.setBackground(formColor);
       rbmrrd.setForeground(Color.WHITE);
       rbmrrd.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(rbmrrd);
       
       rbunmrrd = new JRadioButton("Unmarried");
       rbunmrrd.setBounds(350, 340, 120, 25);
       rbunmrrd.setFont(new Font("Tahoma", Font.BOLD, 15));
       rbunmrrd.setForeground(Color.WHITE);
       rbunmrrd.setBackground(formColor);
       add(rbunmrrd);
       
       rbother = new JRadioButton("Other");
       rbother.setBounds(470, 340, 100, 25);
       rbother.setFont(new Font("Tahoma", Font.BOLD, 15));
       rbother.setForeground(Color.WHITE);
       rbother.setBackground(formColor);
       add(rbother);
       
       
        ButtonGroup stat = new ButtonGroup();
        stat.add(rbmrrd);
        stat.add(rbunmrrd);
        stat.add(rbother);
       
        JLabel lbladd = new JLabel("Address:");
        lbladd.setBounds(100, 380, 150, 25);
        lbladd.setFont(new Font("Tahoma", Font.BOLD, 18));
        lbladd.setForeground(Color.WHITE);
        add(lbladd);
        
        tfadd = new JTextField();
        tfadd.setBounds(250, 380, 400, 25);
        tfadd.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tfadd);
        
        
        JLabel lblcity = new JLabel("City:");
        lblcity.setBounds(100, 420, 150, 25);
        lblcity.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblcity.setForeground(Color.WHITE);
        add(lblcity);
        
        tffcity = new JTextField();
        tffcity.setBounds(250, 420, 400, 25);
        tffcity.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tffcity);
        
        
        JLabel lblstate = new JLabel("State:");
        lblstate.setBounds(100, 460, 150, 25);
        lblstate.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblstate.setForeground(Color.WHITE);
        add(lblstate);
        
        tfstate = new JTextField();
        tfstate.setBounds(250, 460, 400, 25);
        tfstate.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tfstate);
        
        
        JLabel lblpincode = new JLabel("Pin Code:");
        lblpincode.setBounds(100, 500, 150, 25);
        lblpincode.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblpincode.setForeground(Color.WHITE);
        add(lblpincode);
        
        tffpcode = new JTextField();
        tffpcode.setBounds(250, 500, 400, 25);
        tffpcode.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tffpcode);
        
       
        
        
        next = new JButton("NEXT");
        next.setBounds(530, 550, 120, 35);
        next.addActionListener(this);
        add(next);
        
   
        setSize(800,650);
        setLocation(300,50);
        setVisible(true);
    }
     
     public void actionPerformed(ActionEvent ae){
         String formno = ""  + random;
         String name = tfname.getText();
         String fname = tffname.getText();
         String date = ((JTextField) dcdate.getDateEditor().getUiComponent()).getText();
         String gender = null;
         if(rbmale.isSelected()){
             gender = "Male";
         }else if (rbfemale.isSelected()){
             gender = "Female";
         }
         String email = tfemail.getText();
         
         String status = null;
          if(rbmrrd.isSelected()){
             status = "Married";
         }else if (rbfemale.isSelected()){
             status = "Female";
         }else if(rbother.isSelected()){
             status = "Other";         
         }
          
          String address = tfadd.getText();
          String city = tffcity.getText();
          String state = tfstate.getText();
          String pincode = tffpcode.getText();
          
          
          
          //validation
       
          try {
//              
//              
//                 if(name.equals("")){
//                 JOptionPane.showMessageDialog(null, "Name is Required");
//             }else if(fname.equals("")){
//                 JOptionPane.showMessageDialog(null, "Father's name is Required");
//             }else if(gender.equals("")){
//                 JOptionPane.showMessageDialog(null, "Gender is Required");
//             }else if(date.equals("")){
//                 JOptionPane.showMessageDialog(null, "Date is Required");
//             }else if(email.equals("")){
//                 JOptionPane.showMessageDialog(null, "Email is Required");
//             }else if(status.equals("")){
//                 JOptionPane.showMessageDialog(null, "Status is Required");
//             }else if(address.equals("")){
//                 JOptionPane.showMessageDialog(null, "Address is Required");
//             }else if(state.equals("")){
//                 JOptionPane.showMessageDialog(null, "State is Required");
//             }else if(pincode.equals("")){
//                 JOptionPane.showMessageDialog(null, "Pin Code is Required");
//             }else if(city.equals("")){
//                 JOptionPane.showMessageDialog(null, "City is Required");
//             }else{
//          
              Conn conn = new Conn();
             String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+date+"','"+gender+"','"+email+"','"+status+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
             conn.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Details Added sucessfully");
             setVisible(false);
             new Signupformtwo(formno);
             
             
         } catch (Exception e) {
         }
         
     }
    
    public static void main(String[] args) {
        new Signupformone();
    }
}
