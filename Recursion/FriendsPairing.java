package Recursion;

public class FriendsPairing {
    public static int pairing(int n){
        //Base Case
        if(n == 1 || n == 2){
            return n;
        }
        //Single 
        int singleWays = pairing(n-1);
        //Pair Up
        int remain = pairing(n-2);
        int pairWays = (n-1) * remain; //(n-1) is to pair up
        //Total Ways
        int total = singleWays + pairWays;
        return total;
        // return pairing(n-1) + (n-1) * pairing(n-2);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Total ways to pair up: "+pairing(n));
    }
}