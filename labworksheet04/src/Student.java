import java.util.ArrayList;

class Student extends Person {
    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled;

    // Constructor to initialize all variables
    public Student(String name, String studentID, String year, Degree degree) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.degree = degree;
        this.coursesEnrolled = new ArrayList<>();
    }


    public String getStudentID() {
        return studentID;
    }


    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }


    public String getYear() {
        return year;
    }


    public void setYear(String year) {
        this.year = year;
    }

    // Implementing displayInfo method to display student information
    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);
        displayDegreeInfo();
    }

    // Method to register a degree for the student
    public void registerDegree(Degree degree) {
        this.degree = degree;
    }

    // Method to display degree information
    public void displayDegreeInfo() {
        if (degree != null) {
            System.out.println("Degree: " + degree.getName());

        } else {
            System.out.println("No degree registered.");
        }
    }

    // Method to enroll in a course
    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    // Method to unenroll from a course
    public void unenrollCourse(Course course) {
        coursesEnrolled.remove(course);
    }

    // Method to list all enrolled courses
    public void listCoursesEnrolled() {
        System.out.println("Courses Enrolled:");
        for (Course course : coursesEnrolled) {
            System.out.println("- " + course.getName());
        }
    }
}
