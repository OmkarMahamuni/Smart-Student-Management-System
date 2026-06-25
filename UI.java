import java.util.Scanner;

public class UI {

    StudentDAO dao = new StudentDAO();

    public void start() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== SMART STUDENT SYSTEM =====");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search By Roll No");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Search By Department");
            System.out.println("7. Search By Marks");
            System.out.println("8. Exit");

            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Roll No: ");
                    String roll = sc.nextLine();

                    System.out.print("Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    System.out.print("Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Marks: ");
                    double marks = sc.nextDouble();

                    dao.addStudent(
                            new Student(name, roll,
                                    dept, email,
                                    phone, marks));
                    break;

                case 2:
                    dao.viewStudents();
                    break;

                case 3:

                    System.out.print("Roll No: ");
                    dao.searchByRoll(sc.nextLine());
                    break;

                case 4:

                    System.out.print("Roll No: ");
                    String r = sc.nextLine();

                    System.out.print("New Email: ");
                    String e = sc.nextLine();

                    System.out.print("New Phone: ");
                    String p = sc.nextLine();

                    dao.updateStudent(r, e, p);
                    break;

                case 5:

                    System.out.print("Roll No: ");
                    dao.deleteStudent(sc.nextLine());
                    break;

                case 6:

                    System.out.print("Department: ");
                    dao.searchByDepartment(sc.nextLine());
                    break;

                case 7:

                    System.out.print("Minimum Marks: ");
                    dao.searchByMarks(sc.nextDouble());
                    break;

                case 8:
                    System.exit(0);
            }
        }
    }
}
