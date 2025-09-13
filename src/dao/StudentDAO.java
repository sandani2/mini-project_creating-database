package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

    public class StudentDAO {

        public static void createTable() {
            String sql = "CREATE TABLE IF NOT EXISTS studentData (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(100) NOT NULL," +
                    "grade INT NOT NULL" +
                    ")";

            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb","root","root");
                 Statement stmt = con.createStatement()) {

                stmt.execute(sql);
                System.out.println("Table created successfully!");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        public static void insertStudent(String name, int grade) {
            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb","root","root");
                 Statement stmt = con.createStatement()) {

                String sql = "INSERT INTO studentData(name, grade) VALUES('" + name + "'," + grade + ")";
                stmt.executeUpdate(sql);
                System.out.println("Student inserted!");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public static void viewStudents() {
            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb","root","root");
                 Statement stmt = con.createStatement();
                 var rs = stmt.executeQuery("SELECT * FROM studentData")) {

                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " | " +
                            rs.getString("name") + " | " +
                            rs.getInt("grade"));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public static void updateStudent(String name, int grade) {
            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb","root","root");
                 Statement stmt = con.createStatement()) {

                String sql = "UPDATE studentData SET grade=" + grade + " WHERE name='" + name + "'";
                int rows = stmt.executeUpdate(sql);
                System.out.println(rows + " row(s) updated!");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public static void deleteStudent(String name) {
            try (Connection con =DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb","root","root");
                 Statement stmt = con.createStatement()) {

                String sql = "DELETE FROM studentData WHERE name='" + name + "'";
                int rows = stmt.executeUpdate(sql);
                System.out.println(rows + " row(s) deleted!");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


