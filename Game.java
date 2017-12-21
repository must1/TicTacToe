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


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }


        map.printBoard();
        while (winner.Winner()) {

            row = input.nextInt();
            col = input.nextInt();
            if (row > 3 || col > 3) {
                System.out.println("You've inputed place, which is out of the board!\nTry again!");

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
        playerChanger.whichPlayer();
        System.out.println("the winner is " + playerChanger.getTurn());
    }
}