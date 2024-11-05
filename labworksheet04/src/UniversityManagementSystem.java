import java.util.ArrayList;

public class UniversityManagementSystem {
    public static void main(String[] args) {

        Department softwareEngineeringDept = new Department("Software Engineering");


        Degree computerScienceDegree = new Degree("Computer Science", 120);


        Course oopCourse = new Course("Object-Oriented Programming", "Compulsory", 80);
        Course dataStructuresCourse = new Course("Data Structures", "Compulsory", 60);


        Lecturer lecturerKasun = new Lecturer("kasun fernando", "Senior Lecturer", softwareEngineeringDept);
        Lecturer lecturerNimal = new Lecturer("Nimal silva", "Associate Lecturer", softwareEngineeringDept);


        Student studentKamal = new Student("kamal", "S12345", "2nd Year", computerScienceDegree);
        Student studentSunil = new Student("Sunil", "S67890", "1st Year", computerScienceDegree);


        softwareEngineeringDept.appointDepartmentHead(lecturerKasun);

        // Offer Courses in Department
        softwareEngineeringDept.offerCourse(oopCourse);
        softwareEngineeringDept.offerCourse(dataStructuresCourse);

        // Assign Lecturer to Courses
        oopCourse.addLecturerInCharge(lecturerKasun);
        dataStructuresCourse.addLecturerInCharge(lecturerNimal);

        // Link Courses to Degree
        computerScienceDegree.offerCourse(oopCourse);
        computerScienceDegree.offerCourse(dataStructuresCourse);

        // Enroll Students in Courses
        studentKamal.enrollCourse(oopCourse);
        studentSunil.enrollCourse(dataStructuresCourse);

        // Add Lecturers to Department
        softwareEngineeringDept.addLecturer(lecturerKasun);
        softwareEngineeringDept.addLecturer(lecturerNimal);

        
        System.out.println("Lecturer Information:");
        lecturerKasun.displayInfo();
        System.out.println();
        lecturerNimal.displayInfo();

        System.out.println("\nStudent Information:");
        studentKamal.displayInfo();
        System.out.println();
        studentSunil.displayInfo();

        System.out.println("\nDepartment Information:");
        softwareEngineeringDept.displayInfo();

        System.out.println("\nCourse Information:");
        oopCourse.displayInfo();
        System.out.println();
        dataStructuresCourse.displayInfo();

        System.out.println("\nDegree Information:");
        computerScienceDegree.displayInfo();
    }
}
