import java.sql.*;
import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb", "root", "G45n78kl#hu98")) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Grade: ");
            String grade = sc.nextLine();

            String sql = "INSERT INTO students (name, age, grade) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, grade);
            ps.executeUpdate();

            System.out.println("✅ Student Inserted Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
