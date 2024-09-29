import java.util.Scanner;

public class Question01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd length word : ");
        String word = scanner.nextLine();

        if(word.length() % 2 !=0){
            int middleIndex = word.length() / 2 ;
            System.out.println("The middle character is : "+ word.charAt(middleIndex));

        }else{
            System.out.println("Please entr a odd length word ");
        }

        scanner.close();
    }
}
