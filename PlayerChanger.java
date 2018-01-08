package tictactoe;

public class PlayerChanger
{

    public char turn = 'X';

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
}