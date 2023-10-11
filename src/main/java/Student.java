import java.util.Random;
import java.util.UUID;

public class Student {
    private String studentId;
    private String name;
    private String address;
    private String email;
    private Course course;

    // Parameterized constructor
    public Student(String name, String address, String email) {
        this.studentId = UUID.randomUUID().toString().substring(0,6);
        this.name = name;
        this.address = address;
        this.email = email;
        this.course = null; // Initially, no course assigned
    }

    // Private method to generate a unique studentId
//    private String generateStudentId() {
//        // Generate a random number within the range of 4 digits
//        int randomNum = new Random().nextInt(9999)+1000;
//        // Convert the random number to a String and add a prefix
//        return "YM_S_ID: " + randomNum;
//    }
    // Getter for studentId
    public String getStudentId() {
        return studentId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for course
    public Course getCourse() {
        return course;
    }

    // Setter for course
    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", name=" + name + ", address=" + address + ", email=" + email
                + ", course=" + (course != null ? course.getName() : "Not enrolled in a course") + "]";
    }
}