import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateDeleteStudent {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
            Statement stmt = con.createStatement();

            //update record
            String updateSql = "UPDATE studentData SET grade=13 WHERE name = 'Grace'";
            int updated = stmt.executeUpdate(updateSql);
            System.out.println("record(s) updated"+updated);

            //delete record
            String deleteSql = "DELETE FROM studentData WHERE name ='Philip' ";
            int deleted=stmt.executeUpdate(deleteSql);
            System.out.println(""+deleted+"record(s) deleted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }}

