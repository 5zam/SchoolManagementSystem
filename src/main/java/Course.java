import java.util.UUID;

public class Course {
    private String courseId;
    private String name;
    private double price;
    private double moneyEarned;
    private Teacher teacher;

    // Parameterized constructor
    public Course(String name, double price) {
        this.courseId = UUID.randomUUID().toString().substring(0,6);
        this.name = name;
        this.price = price;
        this.moneyEarned = 0.0;
        this.teacher = null;
    }

    // Getters and setters
    public String getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", name=" + name + ", price=" + price + ", moneyEarned=" + moneyEarned
                + ", teacher=" + (teacher != null ? teacher.getName() : "No teacher assigned") + "]";
    }
}
// Private method to generate a unique courseId
//    private String generateCourseId() {
//        // Generate a random number within the range of 4 digits
//        int randomNum = new Random().nextInt(9999)+1000;
//        // Convert the random number to a String and add a prefix
//        return "YM_C_ID: " + randomNum;
//    }