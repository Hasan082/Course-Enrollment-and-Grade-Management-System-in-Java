import java.util.ArrayList;
import java.util.HashMap;

public class CourseManagement {
    private static ArrayList<Course> courses = new ArrayList<>();
    private static HashMap<String, Student> students = new HashMap<>();

    // add course
    public void addCourse(String courseCode, String courseName, int maxCapacity) {
        Course newCourse = new Course(courseCode, courseName, maxCapacity);
        courses.add(newCourse);
    }

    // enroll student
    public void enrollStudent(String studentName, String studentID, String courseCode) {
        Course course = findCourse(courseCode);
        if (course == null) {
            System.out.println("Course with code " + courseCode + " not found.");
            return;
        }

        if (course.getEnrolledStudents().size() >= course.getMaxCapacity()) {
            System.out.println("Course " + courseCode + " has reached maximum capacity.");
            return;
        }

        Student student = students.getOrDefault(studentID, new Student(studentName, studentID));
        students.put(studentID, student);
        student.enrollCourse(course);
        Course.incrementTotalEnrolledStudents();
    }

    // assign grade
    public void assignGrade(String studentID, String courseCode, int grade) {
        Course course = findCourse(courseCode);
        if (course == null) {
            System.out.println("Course with code " + courseCode + " not found.");
            return;
        }

        Student student = students.get(studentID);
        if (student == null) {
            System.out.println("Student with ID " + studentID + " not found.");
            return;
        }
        System.out.println(
                "Grade assigned successfully for the student id. " + studentID + " course code " + courseCode
                        + " and grade " + grade);
        student.assignGrade(course, grade);
    }

    // calculate overall grade
    public void calculateOverallGrade(String studentID) {
        Student student = students.get(studentID);
        if (student == null) {
            System.out.println("Student with ID " + studentID + " not found.");
            return;
        }

        double totalGrade = 0;
        int totalCredits = 0;

        for (Course course : student.getEnrolledCourses()) {
            int grade = student.getGrade(course);
            if (grade != -1) { // Grade exists
                totalGrade += grade;
                totalCredits += 1; // Assuming all courses have equal weight
            }
        }

        if (totalCredits == 0) {
            System.out.println("No grades assigned for student " + studentID + ".");
            return;
        }

        double overallGrade = totalGrade / totalCredits;
        System.out.println("Overall grade for student " + studentID + ": " + overallGrade);
    }

    // find course
    private static Course findCourse(String courseCode) {
        for (Course course : courses) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }
}
