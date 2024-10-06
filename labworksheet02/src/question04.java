import java.util.Scanner;
import java.util.Arrays;

public class question04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];


        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            num[i] = input.nextInt();
        }

        Arrays.sort(num);

        int secondLargest = num[num.length - 2];

        System.out.println("The second-largest element is: " + secondLargest);

        input.close();
    }
}
