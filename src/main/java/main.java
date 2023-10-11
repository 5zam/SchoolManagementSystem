import java.util.Scanner;
//--------------------------aladhary-----------mainPart---------------------------
public class main {
    static Scanner scanner = new Scanner(System.in);
    static String schoolName;
    public static void main(String[] args) {
        String[] lines = {
                "\u001B[34m———————————————",
                "— - - - - - - — - - — - — — - - — - — - -",
                "\u001B[31m-------- --  Powered by :                                 -------- --  ",
                "\u001B[32m- - - -  - - - -      R I Y A D H  S E A S O N  2 0 2 3     -- -- - - -",
                "\u001B[34m— - - - - - - — - - — - — — - - — - — - -",
                "\u001B[34m———————————————\n"
        };

        int consoleWidth = 80; // Adjust this based on your console width
        for (String line : lines) {
            int padding = (consoleWidth - line.length()) / 2;
            String centeredLine = " ".repeat(padding) + line;
            System.out.println(centeredLine);
        }

        // Reset the color to default
        System.out.print("\u001B[0m");

        System.out.print("Enter the name of the school: ");
        schoolName = scanner.nextLine();
        schoolName = School_Admin.capitalizeEachWord(schoolName);

        int numTeachers = SchoolApplication.getNumberFromUser("\nEnter the number of teachers to create: ");
        SchoolApplication.createTeacher(numTeachers, scanner);

        int numCourses = SchoolApplication.getNumberFromUser("\nEnter the number of courses to create: ");
        SchoolApplication.createCourse(numCourses, scanner);

        int numStudents = SchoolApplication.getNumberFromUser("\nEnter the number of students to create: ");
        SchoolApplication.createStudent(numStudents, scanner);

        while (true) {
            SchoolApplication.displayMenu();
            //option to clear the menu
            int choice = SchoolApplication.getNumberFromUser("\u001B[36mEnter a command (1-12) or 0 to exit: ");
            System.out.print("\u001B[0m");

            switch (choice) {

                case 1:
                    SchoolApplication.enrollStudentInCourse(scanner);
                    executeCommand();

                    break;
                case 2:
                    SchoolApplication.assignTeacherToCourse(scanner);
                    executeCommand();

                    break;
                case 3:
                    SchoolApplication.showTeachers();
                    executeCommand();
                    scanner.reset();

                    break;
                case 4:
                    System.out.print("Enter TEACHER ID: ");
                    String teacherId = scanner.nextLine();
                    SchoolApplication.findTeacherById(teacherId);
                    executeCommand();

                    break;
                case 5:
                    SchoolApplication.showCourses();
                    executeCommand();

                    break;
                case 6:
                    SchoolApplication.lookUpCourseById(scanner);
                    executeCommand();

                    break;
                case 7:
                    SchoolApplication.showStudents();
                    executeCommand();

                    break;
                case 8:
                    SchoolApplication.lookUpStudentById(scanner);
                    executeCommand();

                    break;
                case 9:
                    SchoolApplication.showProfit();
                    executeCommand();

                    break;
                case 10:
                    SchoolApplication.showStudentsByCourseId(scanner);
                    executeCommand();

                    break;
                case 11:
                    SchoolApplication.showMoneyEarned();
                    executeCommand();

                    break;
                case 12:
                    SchoolApplication.showMoneySpent();
                    executeCommand();

                    break;
                case 0:
                    System.out.println("\u001B[34mExiting the " + schoolName + "'s School. adiós in Spanish!");
                    System.out.print("\u001B[0m");

                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("\u001B[31mInvalid command. Please try again.");
                    System.out.print("\u001B[0m");

            }
        }
    }


    static void executeCommand() {
        Scanner executer = new Scanner(System.in);
        System.out.println("\u001B[36mPress any key to show the commands menu or enter '0' to exit.");
        System.out.print("\u001B[0m");

        String input = executer.nextLine().toLowerCase();
        if("x".equals(input)){
        }
        else if ("0".equals(input)) {
            System.out.println("\u001B[34mExiting the " + schoolName + "'s School. adiós in Spanish!");
            System.out.print("\u001B[0m");

            executer.close();
            System.exit(0);
        }
    }
}
