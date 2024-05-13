import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class AdministratorInterface {
    private static Scanner scanner = new Scanner(System.in);

    private static int getUserChoice() {
        int choice = -1;

        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.err.print("Error: Please enter a valid integer. Enter the choice again: ");
                scanner.nextLine();
            }
        }

        return choice;
    }

    private static int getIntInput(String prompt) {
        int value = -1; // Default value

        while (true) {
            try {
                System.out.print(prompt);
                value = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.err.println("Error: Please enter a valid integer.");
                scanner.nextLine();
            }
        }

        return value;
    }

    public static void main(String[] args) {
        CourseManagement courseManagement = new CourseManagement();

        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    addNewCourse(courseManagement);
                    break;
                case 2:
                    enrollStudent(courseManagement);
                    break;
                case 3:
                    assignGrade(courseManagement);
                    break;
                case 4:
                    calculateOverallGrades(courseManagement);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        try {
            System.out.println("Administrator Interface Menu:");
            System.out.println("1. Add a new course");
            System.out.println("2. Enroll a student in a course");
            System.out.println("3. Assign a grade to a student");
            System.out.println("4. Calculate overall course grades for a student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
            scanner.nextLine();
            Logger.getLogger("displayMenu Error: " + e.getMessage());
        }

    }

    private static void addNewCourse(CourseManagement courseManagement) {
        try {
            System.out.print("Enter course code: ");
            String courseCode = scanner.nextLine();
            System.out.print("Enter course name: ");
            String courseName = scanner.nextLine();
            int maxCapacity = getIntInput("Enter maximum capacity: ");

            courseManagement.addCourse(courseCode, courseName, maxCapacity);
            System.out.println("Course added successfully with code " + courseCode);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
            scanner.nextLine();
            Logger.getLogger("addNewCourse Error: " + e.getMessage());
        }

    }

    private static void enrollStudent(CourseManagement courseManagement) {
        try {
            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();
            System.out.print("Enter student ID: ");
            String studentID = scanner.nextLine();
            System.out.print("Enter course code to enroll in: ");
            String courseCode = scanner.nextLine();

            courseManagement.enrollStudent(studentName, studentID, courseCode);
            System.out.println("Student enrolled successfully with ID " + studentID + " in course " + courseCode);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
            scanner.nextLine();
            Logger.getLogger("enrollStudent Error: " + e.getMessage());
        }

    }

    private static void assignGrade(CourseManagement courseManagement) {
        try {
            System.out.print("Enter student ID: ");
            String studentID = scanner.nextLine();
            System.out.print("Enter course code: ");
            String courseCode = scanner.nextLine();
            int grade = getIntInput("Enter grade: ");

            courseManagement.assignGrade(studentID, courseCode, grade);

        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
            scanner.nextLine();
            Logger.getLogger("assignGrade Error: " + e.getMessage());
        }
    }

    private static void calculateOverallGrades(CourseManagement courseManagement) {
        try {
            System.out.print("Enter student ID: ");
            String studentID = scanner.nextLine();

            courseManagement.calculateOverallGrade(studentID);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
            scanner.nextLine();
            Logger.getLogger("calculateOverallGrades Error: " + e.getMessage());
        }

    }
}
