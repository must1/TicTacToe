package tictactoe;

public class ConditionsChecker {

    public boolean checkIfWinner(char[][] board)
    {
        for(int i = 0; i <= board.length-1; i++)
        {
            if (board[i][0] != '_' && board[i][0] == board[i][1] && board[i][0] == board[i][2])
                return true;
        }
        for(int i = 0; i <= board.length-1; i++)
        {
            if (board[0][i] != '_' && board[0][i] == board[1][i] && board[0][i] == board[2][i])
                return true;
        }
        if (board[0][0] != '_' && board[0][0] == board[1][1] && board[0][0] == board[2][2])
        {
            return true;
        }
        if (board[0][2] != '_' && board[0][2] == board[1][1] && board[0][2] == board[2][0])
        {
            return true;
        }
        return false;
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
        if (row > 3 || row < 1 || col > 3 || col < 1) {

            System.err.println("You've inputed place, which is out of the board!\nTry again!");
            return true;

        }
        return false;
    }
}
