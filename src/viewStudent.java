import java.sql.*;
public class viewStudent {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb", "root", "root");
            Statement stmt = con.createStatement();
            {
                ResultSet rs = stmt.executeQuery("SELECT*FROM studentData");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    int grade = rs.getInt("grade");
                    System.out.println(id + "|" + name + "|" + age);


                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
