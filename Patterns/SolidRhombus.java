package Patterns;

public class SolidRhombus {
    public static void shapeRhombus(int totalRows) {
        //Outer Loop
        for(int i=1;i<=totalRows;i++){
            //Spaces
            for(int j=1;j<=totalRows-i;j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1;j<=totalRows;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        shapeRhombus(5);
    }
}
