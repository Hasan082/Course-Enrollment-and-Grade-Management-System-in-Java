# Course Enrollment and Grade Management System Instruction

## Purpose

The Course Enrollment and Grade Management System is designed to facilitate the management of student enrollment in courses and the assignment of grades. It provides functionality for administrators to add new courses, enroll students, assign grades, and calculate overall course grades for each student. The system effectively utilizes static methods and variables to track enrollment and grade-related information across multiple instances of the Student and Course classes.

## Classes

### CourseManagement

This class manages the core functionalities of the system, including adding courses, enrolling students, assigning grades, and calculating overall grades.

- Methods:
  - "addCourse(String courseCode, String courseName, int maxCapacity)": Adds a new course to the system with the given course code, name, and maximum capacity.
  - "enrollStudent(String studentName, String studentID, String courseCode)": Enrolls a student in a course.
  - "assignGrade(String studentID, String courseCode, int grade)": Assigns a grade to a student for a specific course.
  - "calculateOverallGrade(String studentID)": Calculates the overall grade for a student based on the grades assigned to them.

### Course

This class represents a course offered by the university.

- Fields:
  - "courseCode": The code identifying the course.
  - "name": The name of the course.
  - "maxCapacity": The maximum number of students allowed to enroll in the course.
  - "totalEnrolledStudents": The total number of students currently enrolled in the course.
  - "enrolledStudents": The list of students enrolled in the course.

- Methods:
  - "getCourseCode()": Returns the course code.
  - "getName()": Returns the name of the course.
  - "getMaxCapacity()": Returns the maximum capacity of the course.
  - "getTotalEnrolledStudents()": Returns the total number of enrolled students.
  - "getEnrolledStudents()": Returns the list of enrolled students.
  - "enrollStudent(Student student)": Enrolls a student in the course.
  - "removeStudent(Student student)": Removes a student from the course.

### Student

This class represents a student enrolled in the university.

- Fields:
  - "name": The name of the student.
  - "ID": The unique identifier of the student.
  - "enrolledCourses": The list of courses in which the student is enrolled.
  - "grades": A map storing the grades assigned to the student for each course.

- Methods:
  - "getName()": Returns the name of the student.
  - "getID()": Returns the ID of the student.
  - "getEnrolledCourses()": Returns the list of courses in which the student is enrolled.
  - "enrollCourse(Course course)": Enrolls the student in a course.
  - "assignGrade(Course course, int grade)": Assigns a grade to the student for a specific course.
  - "getGrade(Course course)": Returns the grade assigned to the student for a specific course.

## Static Methods and Variables

Static methods and variables are utilized in the "CourseManagement" class to track enrollment and grade-related information across multiple instances of the "Student" and "Course" classes.

- Static Variables:
  - "courses": A list containing all the courses in the system.
  - "students": A map containing all the students in the system, with their IDs as keys.

- Static Methods:
  - "addCourse(...)": Adds a new course to the system and updates the "courses" list.
  - "enrollStudent(...)": Enrolls a student in a course and updates the "students" map and the "totalEnrolledStudents" count of the course.
  - "assignGrade(...)": Assigns a grade to a student for a specific course.
  - "calculateOverallGrade(...)": Calculates the overall grade for a student based on the grades assigned to them.

## Usage

To run the program, compile all the Java files and execute the "AdministratorInterface" class. Follow the prompts in the command-line interface to interact with the system as an administrator.

1. Add a new course: Enter option 1 and provide the course code, name, and maximum capacity.
2. Enroll a student in a course: Enter option 2 and provide the student's name, ID, and the course code.
3. Assign a grade to a student: Enter option 3 and provide the student's ID, the course code, and the grade.
4. Calculate overall course grades for a student: Enter option 4 and provide the student's ID.

## Running the Program

1. Navigate to the Directory:
   Open your terminal or command prompt and navigate to the directory where all your Java files are located.

   
   cd /path/to/your/directory
   

   Replace "/path/to/your/directory" with the actual path to the directory containing your Java files.

2. Compile Java Files:
   Compile all Java files using the "javac" command. This command compiles all Java files in the current directory.

   
   javac *.java
   

   This command compiles all Java files with a ".java" extension in the current directory.

3. Run the Program:
   After successfully compiling the Java files, you can run the program by executing the "AdministratorInterface" class using the "java" command.

   
   java AdministratorInterface
   

   This command executes the "AdministratorInterface" class, which serves as the entry point for interacting with the program.


