import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Check DB Connection");
            System.out.println("2. Create Table");
            System.out.println("3. Insert Student");
            System.out.println("4. Update/Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> check_connection.main(null);
                case 2 -> createTable.main(null);
                case 3 -> insert.main(null);
                case 4 -> updateDelete.main(null);
                case 5 -> {
                    System.out.println("👋 Bye!");
                    return;
                }
                default -> System.out.println("❌ Invalid choice");
            }
        }
    }
}
