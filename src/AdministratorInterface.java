import java.util.Scanner;

public class AdministratorInterface {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    addNewCourse(scanner);
                    break;
                case 2:
                    enrollStudent();
                    break;
                case 3:
                    assignGrade();
                    break;
                case 4:
                    calculateOverallGrade();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n===== Administrator Menu =====");
        System.out.println("1. Add a new course");
        System.out.println("2. Enroll a student");
        System.out.println("3. Assign a grade");
        System.out.println("4. Calculate overall course grade for a student");
        System.out.println("5. Exit");
        System.out.print("√ Enter your choice: ");
    }

    private static int getUserChoice() {
        int choice = -1;
        while (choice < 1 || choice > 5) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return choice;
    }

    private static void addNewCourse(Scanner scanner) {
        System.out.println("\n===== Add New Course =====");

        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();

        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();

        System.out.print("Enter maximum capacity: ");
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        CourseManagement.addCourse(courseCode, courseName, maxCapacity);
        System.out.println("Course added successfully!");
    }

    private static void enrollStudent() {
        // Implement logic to prompt for student and course information and call
        // CourseManagement.enrollStudent() method
    }

    private static void assignGrade() {
        // Implement logic to prompt for student, course, and grade information and call
        // Student.assignGrade() method
    }

    private static void calculateOverallGrade() {
        // Implement logic to prompt for student information and call
        // CourseManagement.calculateOverallGrade() method
    }
}
