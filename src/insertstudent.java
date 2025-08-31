import java.sql.DriverManager;
import java.sql.*;

public class insertstudent {
    public static void main(String[] args){
        try {Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb","root","root"
        );
            String sql = "INSERT INTO studentData(name,age,grade) VALUES(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "Philip");
            pstmt.setInt(2, 18);
            pstmt.setInt(3, 11);
            pstmt.executeUpdate();

            System.out.println("records was inserted with prepared statement");
        }
        catch (SQLException e) {
            e.printStackTrace();
        } ;

    }

}

