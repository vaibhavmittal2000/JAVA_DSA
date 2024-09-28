package String;

public class ShortestPath {
    public static float getPath(String str) {
        int x = 0;
        int y = 0;
        for(int i=0;i<str.length();i++){
            char dir = str.charAt(i);
            //North
            if(dir == 'N'){
                y++;
            }
            //South
            else if(dir == 'S'){
                y--;
            }
            //West
            else if(dir == 'W'){
                x--;
            }
            //South
            else{
                x++;
            }
        }
        int XSquare = x*x;
        int YSquare = y*y;
        // Displacement = UnderRoot([(X2-X1)^2] + [(Y2-Y1)^2]) => X1 and Y1 is zero so UnderRoot((X^2) + (Y^2))
        return (float)Math.sqrt(XSquare + YSquare); //Displacement Formula
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN"; 
        System.out.println("Shortest distance is: "+getPath(path));  
    }
}