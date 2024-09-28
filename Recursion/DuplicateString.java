package Recursion;

public class DuplicateString {
    public static void removeDuplicate(String str,int idx, StringBuilder newString,boolean map[]){
        //Base Case
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        //Main Function
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            //Duplicate Entry
            removeDuplicate(str, idx+1, newString, map);
        }
        else{
            //Non-Duplicate Entry
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, newString.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String word = "vaaibbhavv";
        removeDuplicate(word, 0,new StringBuilder(""),new boolean[26]);
    }
}