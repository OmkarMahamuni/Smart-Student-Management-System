public class Main {

    public static void main(String[] args) {

        AdminService admin =
                new AdminService();

        if (admin.login()) {

            System.out.println("Login Successful");

            UI ui = new UI();
            ui.start();

        } else {

            System.out.println(
                    "Invalid Username or Password");
        }
    }
}
