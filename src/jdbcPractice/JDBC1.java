package jdbcPractice;

import java.sql.*;
public class JDBC1 {

    public static void main(String[] args) {
        try{
            //loading the driver
            Class.forName("com.mysql.jdbc.Driver");

            //creating a connection

            String url = "jdbc:mysql://localhost:3306/hiber";

            Connection con = DriverManager.getConnection(url);

            if(con.isClosed()){
                System.out.println("Connection is closed");
            } else{
                System.out.println("Connection created...");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
