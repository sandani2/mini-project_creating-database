import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc {
    public static void main(String[] args) {
        try{
            //connection creation
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");

            System.out.println("Connected to database successfully");

            //close connection
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
