package tictactoe;

public class PlayerChanger
{

    private char turn = 'X';

    public void changePlayer()
    {
        if (turn == 'X')
        {
            turn = 'O';
        }
        else
        {
            turn = 'X';
        }
    }

    public char getTurn()
    {
        return turn;
    }

}
