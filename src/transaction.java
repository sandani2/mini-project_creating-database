import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class transaction {
    public static void main(String[] args) {
        try{ Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
            {
                con.setAutoCommit(false);//start transaction

                Statement stmt = con.createStatement();
                stmt.executeUpdate("INSERT INTO studentData(name,age,grade)Values('Elsa',21,13)");
                stmt.executeUpdate("UPDATE studentData SET age=19 WHERE name='Philip'");

                con.commit();//commit transaction
                System.out.println("Transaction commited.");
            }}
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
