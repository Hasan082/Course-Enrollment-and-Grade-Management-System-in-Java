import java.util.ArrayList;

public class CourseManagement {
    private static ArrayList<Course> courses = new ArrayList<>();
    private static ArrayList<StudentGrade> studentGrades = new ArrayList<>();

    // Static method to add new course
    public static void addCourse(String courseCode, String courseName, int maxCapacity) {
        Course course = new Course(courseCode, courseName, maxCapacity);
        courses.add(course);
    }

    // Static method to enroll student in course
    public static void enrollStudent(Student student, Course course) {
        if (course.getCurrentCapacity() < course.getMaxCapacity()) {
            course.enrollStudent(student);
            course.incrementCurrentCapacity();
        } else {
            System.out.println(
                    "Course " + course.getCourseName() + " is full. Cannot enroll student " + student.getName());
        }
    }

    // Static method to assign grade to student
    public static void assignGrade(Student student, Course course, int grade) {
        boolean found = false;
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getStudent().equals(student) && studentGrade.getCourse().equals(course)) {
                studentGrade.setGrade(grade);
                found = true;
                break;
            }
        }
        if (!found) {
            studentGrades.add(new StudentGrade(student, course, grade));
        }
    }

    // Static method to calculate overall course grade for student
    public static void calculateOverallGrade(Student student) {
        double totalGrade = 0;
        int totalCourses = 0;
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade.getStudent().equals(student)) {
                totalGrade += studentGrade.getGrade();
                totalCourses++;
            }
        }
        double overallGrade = totalGrade / totalCourses;
        System.out.println("Overall course grade for student " + student.getName() + ": " + overallGrade);
    }
}
