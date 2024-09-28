package Patterns;

public class FloydTriangle {
    public static void shapeTriangle(int totalRows) { 
        int counter = 1;
        //Outer Loop
        for(int i=1;i<=totalRows;i++){
            //Inner Loop
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }  
    }
    public static void main(String[] args) {
        shapeTriangle(5);
    }
}
