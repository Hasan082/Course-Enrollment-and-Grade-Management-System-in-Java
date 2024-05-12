import java.util.ArrayList;

//Student class
public class Student {
    private long id;
    private String name;
    private ArrayList<Course> enrolledCourses;

    // default constructor
    public Student() {

    }

    // parameterized constructor
    public Student(long id, String name, ArrayList<Course> enrolledCourses) {
        this.id = id;
        this.name = name;
        this.enrolledCourses = enrolledCourses;
    }
    // getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(ArrayList<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    // Implement a method to assign grades to students.
    public void assignGrade(Course course, int grade, Student student) {
        if (course == null || student == null) {
            throw new IllegalArgumentException("Course and student cannot be null");
        }

        if (!enrolledCourses.contains(course)) {
            throw new IllegalArgumentException(
                    "Student is not enrolled in the specified course: " + course.getCourseName());
        }

        course.setGrade(student, grade);
        System.out.println("Grade assigned successfully for course: " + course.getCourseName());
    }

}
