class Solution {
    public boolean isValidSquare(char[][] board, int top,int left){
        int[] validity = new int[9];
        for(int i=top;i<top+3;i++){
            for(int j=left;j<left+3;j++){
                if(board[i][j]-'0'>0)
                    validity[(board[i][j]-'0')-1]++;
            }
        }
        for(int i: validity)
            if(i>1)
                return false;
        return true;
    }
    public boolean isValidRow(char[][] board, int row){
        int[] validity = new int[9];
        for(int j=0;j<board[row].length;j++)
            if(board[row][j]-'0'>0)
                validity[(board[row][j]-'0')-1]++;
        for(int i: validity)
            if(i>1)
                return false;
        return true;
    }
    public boolean isValidColumn(char[][] board, int column){
        int[] validity = new int[9];
        for(int i=0;i<board.length;i++)
            if(board[i][column]-'0'>0)
                validity[(board[i][column]-'0')-1]++;
        for(int i: validity)
            if(i>1)
                return false;
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i+=3){
            for(int j=0;j<board[i].length;j+=3){
                if(!isValidSquare(board,i,j))
                    return false;
            }
        }

        for(int i=0;i<board.length;i++){
            if(!isValidRow(board,i))
                return false;
        }
        for(int j=0;j<board[0].length;j++){
            if(!isValidColumn(board,j))
                return false;
        }
        return true;
    }
}
