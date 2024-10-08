package BackTracking;

public class NQueens {
    public static boolean isSafe(char board[][],int row,int col){
        //Vertical Up
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //Diagonal Left Up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //Diagonal Right Up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void queenSolution(char board[][],int row){
        //Base Case
        if(row == board.length){
            printBoard(board);
            return;
        }
        //Column Loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                queenSolution(board, row+1); //Function Call
                board[row][j] = 'X'; //Backtracking
            }
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("-----Chess Board-----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        // Initialize Board
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        queenSolution(board,0);
    }
}