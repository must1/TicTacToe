package TicTacToeGame;

public class WinnerConditions {
    char[][] board = PrintBoard.board;


    public boolean VerticalWinner(int col) {
        if (board[0][col - 1] == board[1][col - 1] &&
            board[1][col - 1] == board[2][col - 1]) {
            return false;
        }
        return true;
    }


    public boolean HorizontalWinner(int row) {
        if (board[row - 1][0] == board[row - 1][1] &&
            board[row - 1][1] == board[row - 1][2]) {
            return false;
        }
        return true;
    }


    public boolean DiagonalWinner() {
        if (board[0][0] == board[1][1] &&
            board[1][1] == board[2][2])
            return false;

        return true;
    }

}
