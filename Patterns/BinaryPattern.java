package Patterns;

public class BinaryPattern {
    public static void shapeBinary(int totalRows) {
        //Outer Loop
        for(int i=1;i<=totalRows;i++){
            //Inner Loop
            for(int j=1;j<=i;j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        shapeBinary(5);
    }
}
