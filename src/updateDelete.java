import java.sql.*;
import java.util.Scanner;

public class updateDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Update Student");
        System.out.println("2. Delete Student");
        System.out.print("Choose: ");
        int choice = sc.nextInt();

        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb", "root", "G45n78kl#hu98")) {

            if (choice == 1) {
                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter new name: ");
                String name = sc.nextLine();
                System.out.print("Enter new age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter new grade: ");
                String grade = sc.nextLine();

                String sql = "UPDATE students SET name=?, age=?, grade=? WHERE id=?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, name);
                ps.setInt(2, age);
                ps.setString(3, grade);
                ps.setInt(4, id);
                ps.executeUpdate();
                System.out.println("✅ Updated Successfully!");

            } else if (choice == 2) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                String sql = "DELETE FROM students WHERE id=?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("🗑️ Deleted Successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
