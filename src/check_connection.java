import java.sql.Connection;
import java.sql.DriverManager;

public class check_connection {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb", "root", "G45n78kl#hu98");
            System.out.println("✅ Database Connected Successfully!");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
