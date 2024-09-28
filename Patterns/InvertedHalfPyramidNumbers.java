package Patterns;

public class InvertedHalfPyramidNumbers {
    public static void shapePyramid(int totalRows){
        //Outer Loop
        for(int i=1;i<=totalRows;i++){
            //Inner Loop
            for(int j=1;j<=totalRows-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        shapePyramid(5);
    }
}