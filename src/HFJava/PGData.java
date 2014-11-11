package HFJava;

import java.sql.Connection;
import java.sql.DriverManager;

public class PGData {
    public static void main(String[] args) {
        String pas="indader88";
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Taxi", "postgres", pas);
            if (con!=null) {
                System.out.println("Connected");
            } else {
                System.out.println("Connected Fail");
            }
            //Statement st = con.createS
        }
        catch (Exception ee) {
            ee.printStackTrace();
        }
    }
}
