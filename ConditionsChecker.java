package tictactoe;

public class ConditionsChecker {

    public boolean checkIfWinner(char[][] board) {

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

    public boolean checkIfOccupied(int row, int col, char[][] board) {
        if (board[row - 1][col - 1] == 'X' ||
                board[row - 1][col - 1] == 'O') {
            System.err.println("The place is taken");
            return true;
        }
        return false;
    }

    public boolean checkIfOutOfBoard(int row, int col) {
        if (row > 3 || col > 3) {
            System.err.println("You've inputed place, which is out of the board!\nTry again!");
            return true;
        }
        return false;
    }
}
