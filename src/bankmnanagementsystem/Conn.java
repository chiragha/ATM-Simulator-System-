
package bankmnanagementsystem;

import java.sql.*;

public class Conn {
         
    Connection c;
    Statement s;
    
    public Conn(){    //constructor
    
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "SS30@krhps");
                s = c.createStatement();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    
}
