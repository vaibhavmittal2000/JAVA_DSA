package Practice;

public class Practice2 {
    //Question 1
    public static int countTimes(int matrix[][], int key){
        int count = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    count++;
                }
            }
        }
        return count;
    }
    //Question 2
    public static int sumSecondRow(int matrix[][]){
        int sum = 0;
        //Sum of second row of matrix
        for(int j=0;j<matrix[0].length;j++){
            sum += matrix[1][j];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},{8,8,7}};
        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        System.out.println("Total count is: "+countTimes(matrix, 7));
        System.out.println("Sum of second row is: "+sumSecondRow(nums));
    }    
}