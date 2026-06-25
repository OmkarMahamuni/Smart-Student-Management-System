import java.util.Scanner;

public class AdminService {

    private final String USERNAME = "admin";
    private final String PASSWORD = "admin123";

    public boolean login() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        return username.equals(USERNAME)
                && password.equals(PASSWORD);
    }
}
