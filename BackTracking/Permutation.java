package BackTracking;

public class Permutation {
    public static void findPerm(String str, String ans){
        //Base Case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //Recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            // Example "abcde" => "ab" + "de" = "abde"
            String newOne = str.substring(0, i) + str.substring(i+1); // If we don't mention the ending index index that means till end which is n-1
            findPerm(newOne, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPerm(str, "");
    }
}