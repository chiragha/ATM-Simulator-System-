
package bankmnanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Signupformtwo extends JFrame implements ActionListener{
    JTextField tfadd,tfpan,tfpin;
    JComboBox tfrlgn,tfcat,tfincome,tfqual,tfoccu;
    JRadioButton syes,sno,eyes,eno;
    JButton next;
    String formno;

     Signupformtwo(String formno) {
         
         this.formno = formno;
        Color formColor = new Color(53, 59, 72);
        getContentPane().setBackground(formColor);
        setLayout(null);
      
        setTitle("New Application Form: Page 2");
         
        JLabel subheading = new JLabel("Page 2: Additional Details");
        subheading.setBounds(250, 30, 450, 35);
        subheading.setFont(new Font("Tahoma", Font.PLAIN, 25));
        subheading.setForeground(Color.WHITE);
        add(subheading);
        
        
        //////details
        
        JLabel lblrlgn = new JLabel("Religion:");
        lblrlgn.setBounds(100, 100, 150, 25);
        lblrlgn.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblrlgn.setForeground(Color.WHITE);
        add(lblrlgn);
        
        
        String vreligion[] = {"Hindu", "Muslim","Sikh","Christian","Others"};
        tfrlgn = new JComboBox(vreligion);
        tfrlgn.setBounds(290, 100, 400, 25);
        tfrlgn.setFont(new Font("Tahoma", Font.BOLD, 15));
        tfrlgn.setBackground(Color.WHITE);
        add(tfrlgn);
        
        JLabel lblcat = new JLabel("Category:");
        lblcat.setBounds(100, 140, 150, 25);
        lblcat.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblcat.setForeground(Color.WHITE);
        add(lblcat);
        
        
        String vcategory[] = {"General", "OBC","Sc","ST","Other"};
        tfcat = new JComboBox(vcategory);
        tfcat.setBounds(290, 140, 400, 25);
        tfcat.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tfcat);
        
        
        JLabel lblincome = new JLabel("Income:");
        lblincome.setBounds(100, 180, 150, 25);
        lblincome.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblincome.setForeground(Color.WHITE);
        add(lblincome);
        
        String vincome[] = {"null", "< 1,50000","< 2,50000","< 5,00000","upto 10,00000"};
        tfincome = new JComboBox(vincome);
        tfincome.setBounds(290, 180, 400, 25);
        tfincome.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tfincome);
        
        
        JLabel lbldate = new JLabel("Educational:");
        lbldate.setBounds(100, 220, 150, 25);
        lbldate.setFont(new Font("Tahoma", Font.BOLD, 18));
        lbldate.setForeground(Color.WHITE);
        add(lbldate);
      
        JLabel lblgender = new JLabel("Qualification:");
        lblgender.setBounds(100, 240, 150, 25);
        lblgender.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblgender.setForeground(Color.WHITE);
        add(lblgender);
        
        String vquali[] = {"Non-Graduate", "Graduate","Post Graduate","Other"};
        tfqual = new JComboBox(vquali);
        tfqual.setBounds(290, 240, 400, 25);
        tfqual.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tfqual);
       
        
        
        JLabel lblocu = new JLabel("Occupation:");
        lblocu.setBounds(100, 300, 150, 25);
        lblocu.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblocu.setForeground(Color.WHITE);
        add(lblocu);
        
        String vcombo[] = {"Salaried", "Self-Employed","Student","Retired","Other"};
        tfoccu = new JComboBox(vcombo);
        tfoccu.setBounds(290, 300, 400, 25);
        tfoccu.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tfoccu);
     
        
        
        
        JLabel lblpan = new JLabel("PAN Number:");
        lblpan.setBounds(100, 340, 150, 25);
        lblpan.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblpan.setForeground(Color.WHITE);
        add(lblpan);
       
        tfpan = new JTextField();
        tfpan.setBounds(290, 340, 400, 25);
        tfpan.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tfpan);
        
        
        
       
        JLabel lbladd = new JLabel("Adhar Number:");
        lbladd.setBounds(100, 380, 150, 25);
        lbladd.setFont(new Font("Tahoma", Font.BOLD, 18));
        lbladd.setForeground(Color.WHITE);
        add(lbladd);
        
        tfadd = new JTextField();
        tfadd.setBounds(290, 380, 400, 25);
        tfadd.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tfadd);
        
        
        JLabel lblciti = new JLabel("Senior Citizen:");
        lblciti.setBounds(100, 420, 150, 25);
        lblciti.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblciti.setForeground(Color.WHITE);
        add(lblciti);
        
        syes = new JRadioButton("Yes");
       syes.setBounds(290, 420, 100, 25);
       syes.setBackground(formColor);
       syes.setForeground(Color.WHITE);
       syes.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(syes);
       
       sno = new JRadioButton("No");
       sno.setBounds(390, 420, 100, 25);
       sno.setFont(new Font("Tahoma", Font.BOLD, 15));
       sno.setForeground(Color.WHITE);
       sno.setBackground(formColor);
       add(sno);
        
        ButtonGroup sgroup = new ButtonGroup();
        sgroup.add(syes);
        sgroup.add(sno);
        
        
        
//        tffcity = new JTextField();
//        tffcity.setBounds(290, 420, 400, 25);
//        tffcity.setFont(new Font("Tahoma", Font.BOLD, 15));
//        add(tffcity);
        
        
        JLabel lblstate = new JLabel("Pin Code:");
        lblstate.setBounds(100, 460, 150, 25);
        lblstate.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblstate.setForeground(Color.WHITE);
        add(lblstate);
        
        tfpin = new JTextField();
        tfpin.setBounds(290, 460, 400, 25);
        tfpin.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tfpin);
        
        
        JLabel lblpincode = new JLabel("Existing Account:");
        lblpincode.setBounds(100, 500, 170, 25);
        lblpincode.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblpincode.setForeground(Color.WHITE);
        add(lblpincode);
        
       eyes = new JRadioButton("Yes");
       eyes.setBounds(290, 500, 100, 25);
       eyes.setBackground(formColor);
       eyes.setForeground(Color.WHITE);
       eyes.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(eyes);
       
       eno = new JRadioButton("No");
       eno.setBounds(390, 500, 100, 25);
       eno.setFont(new Font("Tahoma", Font.BOLD, 15));
       eno.setForeground(Color.WHITE);
       eno.setBackground(formColor);
       add(eno);
        
        ButtonGroup egroup = new ButtonGroup();
        egroup.add(eyes);
        egroup.add(eno);
        
       
        
        
        next = new JButton("NEXT");
        next.setBounds(560, 550, 120, 35);
        next.addActionListener(this);
        add(next);
        
   
        setSize(800,650);
        setLocation(300,30);
        setVisible(true);
    }
     
     
     
     
     public void actionPerformed(ActionEvent ae){
         String religion = (String) tfrlgn.getSelectedItem();
         String category = (String) tfcat.getSelectedItem();
         String income =  (String) tfincome.getSelectedItem();
         String education = (String) tfqual.getSelectedItem();
         String occupation = (String) tfoccu.getSelectedItem();
         String pan = tfpan.getText();
         String aadhar = tfadd.getText();
        
         String scitizen = null;
         if(syes.isSelected()){
             scitizen = "Yes";
         }else if (sno.isSelected()){
             scitizen = "No";
         }
         String pin = tfpin.getText();
         
         String exist = null;
          if(eyes.isSelected()){
             exist = "Yes";
         }else if (eno.isSelected()){
             exist = "No";
         }
        
          
          //validation
         
          try {
              
              
                 if(religion.equals("")){
                 JOptionPane.showMessageDialog(null, "Religion is Required");
             }else if(category.equals("")){
                 JOptionPane.showMessageDialog(null, "Category is Required");
             }else if(income.equals("")){
                 JOptionPane.showMessageDialog(null, "Income is Required");
             }else if(education.equals("")){
                 JOptionPane.showMessageDialog(null, "Education is Required");
             }else if(occupation.equals("")){
                 JOptionPane.showMessageDialog(null, "Occupation is Required");
             }else if(pan.equals("")){
                 JOptionPane.showMessageDialog(null, "PAN No is Required");
             }else if(aadhar.equals("")){
                 JOptionPane.showMessageDialog(null, "Aadhar is Required");
             }else if(scitizen.equals("")){
                 JOptionPane.showMessageDialog(null, "Senior Citizen is Required");
             }else if(pin.equals("")){
                 JOptionPane.showMessageDialog(null, "Pin Code is Required");
             }else if(exist.equals("")){
                 JOptionPane.showMessageDialog(null, "Existing Account is Required");
             }else{
          
              Conn conn = new Conn();
             String query = "insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+pin+"','"+exist+"')";
             conn.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Details Added sucessfully");
             setVisible(false);
             new Signupformthree(formno);
             }
             
         } catch (Exception e) {
         }
         
     }
    
    public static void main(String[] args) {
        new Signupformtwo("");
    }
}
