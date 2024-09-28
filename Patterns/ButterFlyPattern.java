package Patterns;

public class ButterFlyPattern {
    public static void shapeFly(int totalRows) {   
        //1st Half Outer Loop
        for(int i=1;i<=totalRows;i++){
            //Stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Space
            for(int j=1;j<=2*(totalRows-i);j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }  
        //2nd Half Outer Loop
        for(int i=totalRows;i>=1;i--){
            //Stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Space
            for(int j=1;j<=2*(totalRows-i);j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }   
    }
    public static void main(String[] args) {
        shapeFly(4);
    }
}