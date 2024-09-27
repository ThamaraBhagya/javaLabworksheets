import java.util.Scanner;

public class Question02 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name : ");

        String fullName = scanner.nextLine();

        String[] nameParts = fullName.split(" ");
        if(nameParts.length== 3 ){
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];

            System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
        }else{
            System.out.println("Please enter your full name in the format: first middle last.");
        }

        scanner.close();
    }
}
