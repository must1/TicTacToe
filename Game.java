package TicTacToeGame;

import java.util.Scanner;

class Game {
    PrintBoard map = new PrintBoard();
    private FullPlace fullPlace = new FullPlace();
    ChangePlayer playerChanger = new ChangePlayer();
    WinnerConditions winner = new WinnerConditions();
    Scanner input = new Scanner(System.in);
    char[][] board = PrintBoard.board;
    NoPlace noPlace = new NoPlace();
    private int row, col;


    void StartGame() {

        map.printBoard();
        do {

            System.out.println("Player " + playerChanger.getTurn() + " choose row or column!");
            row = input.nextInt();
            col = input.nextInt();
            if (noPlace.OutOfArray(row, col)) {

            } else {
                if (fullPlace.isFull(row, col)) {
                    System.err.println("The place is taken");

                } else {
                    board[row - 1][col - 1] = playerChanger.getTurn();
                    map.printBoard();
                    playerChanger.whichPlayer();


                }
            }

        }
        while (winner.VerticalWinner(col) && winner.DiagonalWinner() && winner.HorizontalWinner(row));
        System.out.println("Player " + playerChanger.getTurn() + " won!");


    }
}
