import java.util.HashMap;

public class Course {

    private String courseCode;
    private String courseName;
    private int maxCapacity;
    private int currentCapacity;
    private static int totalEnrolledStudents = 0;

    private HashMap<Student, Integer> studentGrades = new HashMap<>();

    // Default constructor
    public Course() {

    }

    // parameterized constructor
    public Course(String courseCode, String courseName, int maxCapacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
    }

    // Getter method for totalEnrolledStudents
    public static int getTotalEnrolledStudents() {
        return totalEnrolledStudents;
    }

    // Getters and setters

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        // Check if the course has reached its maximum capacity
        if (currentCapacity < maxCapacity) {
            // Increment the current capacity
            currentCapacity++;
        } else {
            System.out.println("Course is full. Cannot enroll more students.");
        }
    }

    // Method to increment the totalEnrolledStudents count
    public static void incrementTotalEnrolledStudents() {
        totalEnrolledStudents++;
    }

    // Methods to increment currentCapacity
    public void incrementCurrentCapacity() {
        if (currentCapacity < maxCapacity) {
            currentCapacity++;
        } else {
            System.out.println("Course has reached maximum capacity.");
        }
    }

    // Method to set grade for a student
    public void setGrade(Student student, int grade) {
        // Check if the student is enrolled in the course
        if (studentGrades.containsKey(student)) {
            // Update the grade for the student
            studentGrades.put(student, grade);
            System.out.println(
                    "Grade set for student: " + student.getName() + " in course: " + courseName + " is: " + grade);
        } else {
            System.out.println("Student " + student.getName() + " is not enrolled in course " + courseName);
        }
    }

}
