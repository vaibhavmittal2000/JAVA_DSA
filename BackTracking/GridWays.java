package BackTracking;

public class GridWays {
    public static int findWays(int i,int j,int n,int m){
        //Base Case
        if(i == n-1 || j == m-1){ //Condition for last cell
            return 1;
        }
        else if(i == n || j == n){ //Boundary cross condition
            return 0;
        }
        //Recursion
        int w1 = findWays(i+1, j, n, m);
        int w2 = findWays(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(findWays(0, 0, n, m));
    }
}