package TicTacToeGame;

public class WinnerConditions {
    char[][] board = PrintBoard.board;


    /*public boolean VerticalWinner(int col) {
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
        if (board[0][0] == 'X' || board[0][0] == 'O') {
            if (board[0][0] == board[1][1] &&
                    board[1][1] == board[2][2])
                return false;
        }
        if (board[0][1] == 'X' || board[0][1] == 'O') {
            if (board[0][1] == board[1][1] &&
                    board[1][1] == board[2][0])
                return false;
        }


        return true;
    }*/

    public boolean Winner() {

        if (board[0][0] != '_' && board[0][0] == board[0][1] && board[0][0] == board[0][2])
            return false;
        if (board[1][0] != '_' && board[1][0] == board[1][1] && board[1][0] == board[1][2])
            return false;
        if (board[2][0] != '_' && board[2][0] == board[2][1] && board[2][0] == board[2][2])
            return false;
        if (board[0][0] != '_' && board[0][0] == board[1][0] && board[0][0] == board[2][0])
            return false;
        if (board[0][1] != '_' && board[0][1] == board[1][1] && board[0][1] == board[2][1])
            return false;
        if (board[0][2] != '_' && board[0][2] == board[1][2] && board[0][2] == board[2][2])
            return false;
        if (board[0][0] != '_' && board[0][0] == board[1][1] && board[0][0] == board[2][2])
            return false;
        if (board[0][2] != '_' && board[0][2] == board[1][1] && board[0][2] == board[2][0])
            return false;

        return true;
    }

}
