## Course Enrollment and Grade Management System

### Introduction:
Welcome to the Course Enrollment and Grade Management System! This system is a Java-based application designed to streamline administrative tasks related to course enrollment and grading in a university setting. Whether you're an administrator or a student, this system provides the tools you need to manage courses, enroll students, assign grades, and calculate overall course grades efficiently.

### Features:
1. **Add New Course:** Administrators can easily add new courses to the system by providing course code, name, and maximum capacity.
2. **Enroll Students:** Students can be enrolled in courses with error handling to prevent enrollment in courses that have reached their maximum capacity.
3. **Assign Grades:** Grades can be assigned to students for specific courses, with validation to ensure students are enrolled in the course.
4. **Calculate Overall Grades:** The system calculates the overall course grade for each student based on the grades assigned to them.

### Usage Instructions:
To use the Course Enrollment and Grade Management System:
1. Ensure you have Java installed on your system.
2. Clone or download the project repository from [GitHub link].
3. Compile the Java files using your preferred IDE or command-line compiler.
4. Run the application and follow the prompts in the command-line interface to perform actions such as adding new courses, enrolling students, assigning grades, and calculating overall course grades.

### Error Handling:
The system incorporates error handling mechanisms to handle invalid inputs and edge cases gracefully. For example:
- When enrolling students, the system checks if the course has reached its maximum capacity and prevents further enrollment.
- When assigning grades, the system verifies if the student is enrolled in the specified course before proceeding.

### Future Enhancements:
While the current version of the system provides essential functionality, there are several potential enhancements for future versions, including:
- Implementing a graphical user interface (GUI) for a more intuitive user experience.
- Adding support for additional features such as student registration, course scheduling, and grade analysis.
- Integrating with external databases to store and retrieve student and course information.


### Project Structure and Instructions

**Project Structure:**
The project directory structure is organized as follows:

CourseEnrollmentAndGradeManagementSystem/
│
├── src/                              # Source code directory
│   ├── CourseManagement.java         # CourseManagement class
│   ├── Course.java                   # Course class
│   ├── Student.java                  # Student class
│   ├── AdministratorInterface.java   # AdministratorInterface(Main class)  Entry point
│
├── README.md                         # Project README file
│
└── .gitignore                        # Git ignore file


**Instructions:**
Follow these instructions to set up and use the Course Enrollment and Grade Management System:

**Clone the Repository:**
Clone the project repository from GitHub link.

**Compile the Java Files:**
Compile the Java files using your preferred Java compiler or integrated development environment (IDE).

**Run the Application:**
Run the compiled Java application by executing the Main class. This will start the command-line interface (CLI) for administrators.

**Interact with the Application:**
Use the CLI interface to perform various administrative tasks, such as:

1. Adding new courses
2. Enrolling students in courses
3. Assigning grades to students
4. Calculating overall course grades for each student
5. Follow Error Handling Guidelines:
6. Ensure to follow error handling guidelines incorporated into the system to handle invalid inputs and edge cases gracefully.

**Contribute to the Project:**
If you wish to contribute to the project, please refer to the Developer Guide in the documentation directory for contribution guidelines and best practices.

**Enjoy Using the System:**
Enjoy using the Course Enrollment and Grade Management System to streamline administrative tasks related to course management and grading efficiently.

**Note:**
Make sure to have Java installed on your system to compile and run the application.
For any issues or feedback, please refer to the project's GitHub repository for support and assistance.

### Contribution Guidelines:
If you'd like to contribute to the Course Enrollment and Grade Management System, please follow these guidelines:
1. Fork the repository and create a new branch for your feature or bug fix.
2. Make your changes and submit a pull request with a detailed description of the changes you've made.