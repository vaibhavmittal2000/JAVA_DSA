package String;
import java.util.Arrays;

public class Anagram {
    public static boolean check(String str1, String str2) {
        //Convert to lowercase for uniform comparison
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // If lengths don't match, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        //Sorting
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if sorted char arrays are equal
        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args) {
        String str1 = "RACE";
        String str2 = "CARE";

        // Check if strings are anagrams
        if(check(str1, str2)){
            System.out.println("The strings are anagrams.");
        } 
        else{
            System.out.println("The strings are not anagrams.");
        }
    }
}