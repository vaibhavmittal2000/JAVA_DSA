package Recursion;

public class BinaryString {
    public static void printBinary(int n,int lastPlace,String str){
        //Base Case
        if(n == 0){
            System.out.println(str);
            return;
        }

        // if(lastPlace == 0){
        //     printBinary(n-1, 0, str+"0");
        //     printBinary(n-1, 1, str+"1");
        // }
        // else{
        //     printBinary(n-1, 0, str+"0");
        // }

        printBinary(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinary(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        printBinary(n,0,"");
    }
}