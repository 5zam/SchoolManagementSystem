import java.util.Random;
import java.util.UUID;

public class Teacher {
    private String teacherId;
    private String name;
    private double salary;

    // Parameterized constructor
    public Teacher(String name, double salary) {
        this.teacherId = UUID.randomUUID().toString().substring(0,6);
        this.name = name;
        this.salary = salary;
    }


//    private String generateTeacherId() {
//        // Generate a random number within the range of 4 digits
//        int randomNum = new Random().nextInt(9999)+1000;
//        // Convert the random number to a String and add a prefix
//        return "YM_T_ID: " + randomNum;
//    }

    // Getter for teacherId
    public String getTeacherId() {
        return teacherId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher [teacherId= " + teacherId + ", name=" + name + ", salary=" + salary + "]";
    }
}