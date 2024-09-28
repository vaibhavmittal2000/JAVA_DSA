package Patterns;
public class HollowRectangle {
    public static void shapeHollow(int totalRows, int totalColumns){
        //Outer Loop
        for(int i=1;i<=totalRows;i++){
            //Inner Loop
            for(int j=1;j<=totalColumns;j++){
                // Cell => (i,j)
                if(i == 1 || i == totalRows || j == 1 || j == totalColumns){
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
        shapeHollow(4, 5);
    }
}