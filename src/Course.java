import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String name;
    private int maxCapacity;
    private static int totalEnrolledStudents = 0;
    private ArrayList<Student> enrolledStudents;

    // Parameterized Constructor
    public Course(String courseCode, String name, int maxCapacity) {
        this.courseCode = courseCode;
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getter methods
    public String getCourseCode() {
        return courseCode;
    }

    public String getName() {
        return name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getTotalEnrolledStudents() {
        return totalEnrolledStudents;
    }

    public static void incrementTotalEnrolledStudents() {
        totalEnrolledStudents++;
    }

    public void decrementTotalEnrolledStudents() {
        totalEnrolledStudents--;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        incrementTotalEnrolledStudents();
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
        decrementTotalEnrolledStudents();
    }
}
