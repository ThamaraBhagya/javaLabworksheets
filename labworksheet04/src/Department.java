import java.util.ArrayList;

class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering;
    private ArrayList<Lecturer> lecturersBelongsTo;


    public Department(String name) {
        this.name = name;
        this.coursesOffering = new ArrayList<>();
        this.lecturersBelongsTo = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void displayInfo() {
        System.out.println("Department Name: " + name);
        displayDepartmentHeadInfo();
        listCoursesOffering();
        listLecturers();
    }


    public void appointDepartmentHead(Lecturer head) {
        this.departmentHead = head;
    }


    public void displayDepartmentHeadInfo() {
        if (departmentHead != null) {
            System.out.println("Department Head: " + departmentHead.getName());
            System.out.println("Position: " + departmentHead.getPosition());
        } else {
            System.out.println("No department head appointed.");
        }
    }


    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }


    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }


    public void addLecturer(Lecturer lecturer) {
        lecturersBelongsTo.add(lecturer);
    }


    public void removeLecturer(Lecturer lecturer) {
        lecturersBelongsTo.remove(lecturer);
    }


    public void listCoursesOffering() {
        System.out.println("Courses Offering:");
        for (Course course : coursesOffering) {
            System.out.println("- " + course.getName());
        }
    }


    public void listLecturers() {
        System.out.println("Lecturers in Department:");
        for (Lecturer lecturer : lecturersBelongsTo) {
            System.out.println("- " + lecturer.getName());
        }
    }
}

