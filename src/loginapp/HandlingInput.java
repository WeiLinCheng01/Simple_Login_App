package loginapp;

import java.sql.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
     
public class HandlingInput{

    private String[] opsType = new String[]{"password", "username", "name", "role", "authority"};
    
    Boolean HandlingInput(String UID, String PWID, int operation) {
        
        try{            
            return GetData(UID, operation).equals(bytesToHex(getSHA(PWID)));
        } catch(NoSuchAlgorithmException| SQLException e){
            return false;
        }
    }
    
    String HandlingInput(String UID, int operation){
        try {
            return GetData(UID, operation);
        } catch(SQLException e){
            return "Cannot be found";
        }
    }
    
//    Method to hash Password
    private byte[] getSHA(String input) throws NoSuchAlgorithmException  
    {  
        MessageDigest md = MessageDigest.getInstance("SHA-256");  
    
        return md.digest(input.getBytes(StandardCharsets.UTF_8));  
    }  
    
    private String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
    
    public String GetData(String UID, int operation) throws SQLException{

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_db",
                "root","0000");
        
        System.out.println("Connection to Database Successful!");
        
        
        String sqlQuery = "SELECT "+opsType[operation]+" FROM users WHERE username=\""+UID+"\"";
        
        Statement STment = con.createStatement();
        ResultSet RS = STment.executeQuery(sqlQuery);
        
        System.out.println("Query Successful!");
        
        RS.next();
        return RS.getString(1);
        }
    
    
}
