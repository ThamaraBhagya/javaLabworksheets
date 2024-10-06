import java.util.StringTokenizer;

public class question05 {
    public static void main(String[] args){
        String sentence = "A man,a plan, a canal, Panama!";

        String lowerCased = toLowercase(sentence);

        if(isPalindrome(lowerCased)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }

    public static String toLowercase(String sentence){
        StringTokenizer token = new StringTokenizer(sentence, " ,.'!?");
        String converted = "" ;

        while (token.hasMoreTokens()){
            String word = token.nextToken().toLowerCase();
            converted += word ;
        }

        return converted;
    }

    public static boolean isPalindrome(String lowerCased){
        int left =0;
        int right = lowerCased.length()-1;

        while(left<right){
            if (lowerCased.charAt(left) != lowerCased.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
