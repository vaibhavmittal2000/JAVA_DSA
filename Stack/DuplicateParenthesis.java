package Stack;
import java.util.*;

public class DuplicateParenthesis { //O(n)
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            //Closing
            if(ch == ')'){
                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if(count < 1){
                    return true; //Duplicate Exists
                }
            }
            //Opening
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))"; //True
        String str1 = "(a-b)"; //False
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
    }
}