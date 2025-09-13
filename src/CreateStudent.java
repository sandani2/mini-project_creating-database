import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStudent {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb", "root", "root"
            );
            Statement stmt = con.createStatement();

                String sql = "CREATE TABLE IF NOT EXISTS studentData (" +
                        "id INT PRIMARY KEY AUTO_INCREMENT," +
                        "name VARCHAR(59)," + "grade INT)";

                stmt.executeUpdate(sql);
                System.out.println("Table Created Successfully");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }}

