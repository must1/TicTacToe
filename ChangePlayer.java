package TicTacToeGame;

public class ChangePlayer {
    public static char turn = 'X';

    public void whichPlayer() {
        if (turn == 'X') {
            turn = 'O';
        } else {
            turn = 'X';

        }
    }

    public char getTurn() {
        return this.turn;
    }


}