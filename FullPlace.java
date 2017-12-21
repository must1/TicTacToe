package TicTacToeGame;

public class FullPlace {
    char[][] board = PrintBoard.board;

    public boolean isFull(int row, int col) {
        if (board[row - 1][col - 1] == 'X' ||
            board[row - 1][col - 1] == 'O') {
            return true;
        }
        return false;
    }


}
