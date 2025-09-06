import java.sql.*;

public class createTable {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb", "root", "G45n78kl#hu98");
             Statement stmt = conn.createStatement()) {

            String sql = "CREATE TABLE IF NOT EXISTS students (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "name VARCHAR(100), " +
                    "age INT, " +
                    "grade VARCHAR(10))";
            stmt.executeUpdate(sql);
            System.out.println("✅ Table Created Successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
