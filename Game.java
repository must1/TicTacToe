package tictactoe;

import java.util.Scanner;

class Game {
    private BoardPrinter map = new BoardPrinter();
    private PlayerChanger playerChanger = new PlayerChanger();
    private ConditionsChecker conditionsChecker = new ConditionsChecker();
    private Scanner input = new Scanner(System.in);
    private char[][] board = new char[3][3];
    private int row, col;


    void StartGame() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }

        map.printBoard(board);
        while (conditionsChecker.checkIfWinner(board)) {

            row = input.nextInt();
            col = input.nextInt();
            if (conditionsChecker.checkIfOutOfBoard(row, col)) {

            } else {
                if (conditionsChecker.checkIfOccupied(row, col, board)) {

                } else {
                    board[row - 1][col - 1] = playerChanger.getTurn();
                    map.printBoard(board);
                    playerChanger.changePlayer();
                }
            }


        }
        playerChanger.changePlayer();
        System.out.println("The winner is " + playerChanger.getTurn());
    }
}