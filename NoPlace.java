package TicTacToeGame;

public class NoPlace {
    char[][] board = PrintBoard.board;

    public boolean OutOfBoard(int row, int col) {
        if (row > 3 || col > 3) {
            System.err.println("There is no row or column");
            return true;

        }
        return false;

    }
}
