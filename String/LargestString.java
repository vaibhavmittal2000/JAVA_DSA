package String;

public class LargestString {
    public static void compare(String str[]) {
        String largest = str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareToIgnoreCase(str[i]) < 0){
                largest = str[i];
            }
        }
        System.out.println("Largest string is: "+largest);
    }
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana"};  
        compare(fruits);
    }
}