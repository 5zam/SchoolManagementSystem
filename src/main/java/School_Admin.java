import java.util.ArrayList;
import java.util.List;

public class School_Admin {
    private String name;
    private List<Teacher> teachers;
    private List<Course> courses;
    private List<Student> students;

    public School_Admin(String name) {
        this.name = name;
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getName() {

        return name;
    }

    public List<Teacher> getTeachers(String teacherId) {

        return teachers;
    }

    public List<Course> getCourses() {

        return courses;
    }

    public List<Student> getStudents() {

        return students;
    }

    public void addTeacher(Teacher teacher) {

        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {

        teachers.remove(teacher);
    }

    public void addCourse(Course course) {

        courses.add(course);
    }

    public void removeCourse(Course course) {

        courses.remove(course);
    }

    public void addStudent(Student student) {

        students.add(student);
    }

    public void removeStudent(Student student) {

        students.remove(student);
    }
    public static String capitalizeEachWord(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return result.toString().trim();
    }

    @Override
    public String toString() {
        return "School [name=" + name + ", teachers=" + teachers + ", courses=" + courses + ", students=" + students
                + "]";
    }
}
