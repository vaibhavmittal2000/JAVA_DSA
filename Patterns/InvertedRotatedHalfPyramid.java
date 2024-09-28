package Patterns;

public class InvertedRotatedHalfPyramid {
    public static void shapePyramid(int totalRows){
        //Outer Loop
        for(int i=1;i<=totalRows;i++){
            //Print Space
            for(int j=1;j<=totalRows-i;j++){
                System.out.print(" ");
            }
            //Print Stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        shapePyramid(4);
    }
}
