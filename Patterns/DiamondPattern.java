package Patterns;

public class DiamondPattern {
    public static void shapeDiamond(int totalRows) {
        //1st Outer Loop
        for(int i=1;i<=totalRows;i++){
            //Space
            for(int j=1;j<=totalRows-i;j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd Outer Loop
        for(int i=totalRows;i>=1;i--){
            //Space
            for(int j=1;j<=totalRows-i;j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        shapeDiamond(4);
    }
}