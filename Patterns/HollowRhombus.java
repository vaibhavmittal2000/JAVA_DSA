package Patterns;

public class HollowRhombus {
    public static void shapeHollow(int totalRows) {
        //Outer Loop
        for(int i=1;i<=totalRows;i++){
            //Spaces
            for(int j=1;j<=totalRows-i;j++){
                System.out.print(" ");
            }
            //Hollow Rectangle => Stars
            for(int j=1;j<=totalRows;j++){
                if(i == 1 || i == totalRows || j == 1 || j == totalRows){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        shapeHollow(5);
    }
}
