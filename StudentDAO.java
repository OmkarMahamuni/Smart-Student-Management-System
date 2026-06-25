import java.sql.*;
import java.util.*;

public class StudentDAO {

    Connection con = DatabaseConnection.getConnection();

    // Add Student
    public void addStudent(Student s) {

        String sql =
                "INSERT INTO students(name,roll_no,department,email,phone,marks) VALUES(?,?,?,?,?,?)";

        try {

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getRollNo());
            ps.setString(3, s.getDepartment());
            ps.setString(4, s.getEmail());
            ps.setString(5, s.getPhone());
            ps.setDouble(6, s.getMarks());

            ps.executeUpdate();

            System.out.println("Student Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // View All Students
    public void viewStudents() {

        try {

            Statement st = con.createStatement();

            ResultSet rs =
                    st.executeQuery("SELECT * FROM students");

            System.out.println(
                    "-------------------------------------------------------------");

            while (rs.next()) {

                System.out.printf(
                        "%d | %s | %s | %s | %.2f\n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("roll_no"),
                        rs.getString("department"),
                        rs.getDouble("marks"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Search by Roll Number
    public void searchByRoll(String rollNo) {

        try {

            String sql =
                    "SELECT * FROM students WHERE roll_no=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, rollNo);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getString("name") +
                                " | " +
                                rs.getString("department"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update Student
    public void updateStudent(String rollNo,
                              String email,
                              String phone) {

        try {

            String sql =
                    "UPDATE students SET email=?, phone=? WHERE roll_no=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, phone);
            ps.setString(3, rollNo);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Updated Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete Student
    public void deleteStudent(String rollNo) {

        try {

            String sql =
                    "DELETE FROM students WHERE roll_no=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, rollNo);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Deleted Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Search by Department
    public void searchByDepartment(String dept) {

        try {

            String sql =
                    "SELECT * FROM students WHERE department=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, dept);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getString("name") +
                                " | " +
                                rs.getString("roll_no"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Search by Marks
    public void searchByMarks(double marks) {

        try {

            String sql =
                    "SELECT * FROM students WHERE marks>?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setDouble(1, marks);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getString("name") +
                                " | " +
                                rs.getDouble("marks"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
