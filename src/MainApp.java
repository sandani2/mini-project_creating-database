import dao.StudentDAO;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // Create table if not exists
        StudentDAO.createTable();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Insert Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = sc.nextInt();
                    StudentDAO.insertStudent(name,grade);
                }
                case 2 -> StudentDAO.viewStudents();
                case 3 -> {
                    System.out.print("Enter name to update: ");
                    String name = sc.nextLine();
                    System.out.print("Enter new grade: ");
                    int grade = sc.nextInt();
                    int age = sc.nextInt();
                    StudentDAO.updateStudent(name,grade);
                }
                case 4 -> {
                    System.out.print("Enter name to delete: ");
                    String name = sc.nextLine();
                    StudentDAO.deleteStudent(name);
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

