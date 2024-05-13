import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private String ID;
    private ArrayList<Course> enrolledCourses;
    private HashMap<Course, Integer> grades; // Course -> Grade

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.enrolledCourses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void assignGrade(Course course, int grade) {
        grades.put(course, grade);
    }

    public int getGrade(Course course) {
        return grades.getOrDefault(course, -1); // Assuming -1 for course not graded yet
    }
}
