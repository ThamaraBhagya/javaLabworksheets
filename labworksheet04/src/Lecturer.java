import java.util.ArrayList;
 class Lecturer extends Person{
    private String position;
    private Department department;
    private ArrayList<Course>  coursesTeaching ;

     public Lecturer(String name, String position, Department department) {
         super(name);
         this.position = position;
         this.department = department;
         this.coursesTeaching = new ArrayList<>();
     }

     public String getPosition() {
         return position;
     }

     public void setPosition(String position) {
         this.position = position;
     }

     public void setDepartment(Department department) {
         this.department = department;
     }

     @Override
     public void displayInfo() {
         System.out.println("Name: " + getName());
         System.out.println("Position: " + position);
         displayDepartmentInfo();
     }

     public void displayDepartmentInfo(){
         if (department != null) {
             System.out.println("Department: " + department.getName());
             // Additional department information can be displayed if needed
         } else {
             System.out.println("No department assigned.");
         }
     }
     public void addCourse(Course course){
        coursesTeaching.add(course);
     }
     public void removeCourse(Course course) {
         coursesTeaching.remove(course);
     }

     public  void listCoursesTeaching(){
         System.out.println("Courses Teaching:");
         for (Course course : coursesTeaching) {
             System.out.println("- " + course.getName());
         }
     }
 }
