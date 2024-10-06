import java.util.Scanner;

public class question02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;

        do{
            System.out.print("Enter a number: ");
             num = input.nextInt();
            if(num>=0){
                System.out.println("Num of digits : "+ CountDigits(num));
            }

        }while (num>=0);
        input.close();
    }

    public static int CountDigits(int num){
        int count=0;
        do{
            num/=10;
            count++;
        }while(num!=0);

        return count;
    }
}
