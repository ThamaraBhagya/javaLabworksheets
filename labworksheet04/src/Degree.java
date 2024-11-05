import java.util.ArrayList;

class Degree {
    private String name;
    private Integer numberOfStudents;
    private ArrayList<Course> coursesOffering;


    public Degree(String name, Integer numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = new ArrayList<>();
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }


    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }


    public void displayInfo() {
        System.out.println("Degree Name: " + name);
        System.out.println("Number of Students: " + numberOfStudents);
        listCoursesOffering();
    }

    // Method to add a course to coursesOffering
    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    // Method to remove a course from coursesOffering
    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    // Method to list all courses being offered in this degree
    public void listCoursesOffering() {
        System.out.println("Courses Offering:");
        for (Course course : coursesOffering) {
            System.out.println("- " + course.getName());
        }
    }
}
