package lab6;

import java.util.ArrayList;

class Course {
    private String courseCode;
    private String courseName;
    private String courseCreditHours;

    public Course(String courseCode, String courseName, String courseCreditHours) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseCreditHours = courseCreditHours;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCreditHours() {
        return courseCreditHours;
    }

    @Override
    public String toString() {
        return "Course Code: " + courseCode + ", Course Name: " + courseName + ", Credit Hours: " + courseCreditHours;
    }
}

class Faculty {
    private String facultyName;
    private String facultyDesignation;
    private String facultyEmail;
    private String facultyContact;
    private int facultySalary;
    private int facultyId;
    private ArrayList<Course> courseList = new ArrayList<>();

    public Faculty(String name, String designation, String email, String contact, int salary, int id) {
        this.facultyName = name;
        this.facultyDesignation = designation;
        this.facultyEmail = email;
        this.facultyContact = contact;
        this.facultySalary = salary;
        this.facultyId = id;
    }

    public void assignCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public String toString() {
        return "Faculty Name: " + facultyName + ", Designation: " + facultyDesignation + ", Email: " + facultyEmail
                + ", Contact: " + facultyContact + ", Salary: " + facultySalary + ", ID: " + facultyId
                + ", Courses: " + courseList;
    }
}

class Department {
    private String departmentName;
    private ArrayList<Faculty> departmentFaculty = new ArrayList<>();
    private ArrayList<Course> offeredCourses = new ArrayList<>();

    public Department(String name) {
        this.departmentName = name;
    }

    public void facultyList(Faculty faculty) {
        departmentFaculty.add(faculty);
    }

    public void coursesList(Course course) {
        offeredCourses.add(course);
    }

    @Override
    public String toString() {
        return "Department Name: " + departmentName + ", Faculty: " + departmentFaculty + ", Offered Courses: " + offeredCourses;
    }
}

public class Departmentt {
    public static void main(String[] args) {
        Course course1 = new Course("CS101", "Introduction to Computer Science", "3");
        Course course2 = new Course("MATH101", "Calculus I", "4");

        Faculty faculty1 = new Faculty("Alice", "Professor", "alice@example.com", "1234567890", 50000, 1);
        Faculty faculty2 = new Faculty("Bob", "Associate Professor", "bob@example.com", "0987654321", 45000, 2);
        Faculty faculty3 = new Faculty("Charlie", "Assistant Professor", "charlie@example.com", "1122334455", 40000, 3);

        faculty1.assignCourse(course1);
        faculty2.assignCourse(course2);
        faculty3.assignCourse(course1);

        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Mathematics");
        Department department3 = new Department("Physics");

        department1.facultyList(faculty1);
        department1.coursesList(course1);

        department2.facultyList(faculty2);
        department2.coursesList(course2);

        department3.facultyList(faculty3);
        department3.coursesList(course1);

        System.out.println(department1);
        System.out.println(department2);
        System.out.println(department3);
    }
}
