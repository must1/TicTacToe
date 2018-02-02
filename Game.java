package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

class Game {
    private BoardPrinter map = new BoardPrinter();
    private PlayerChanger playerChanger = new PlayerChanger();
    private ConditionsChecker conditionsChecker = new ConditionsChecker();
    private Scanner input = new Scanner(System.in);
    private char[][] board = new char[3][3];
    private int row, col;
    private boolean isTrue = true;


    void StartGame() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '_';
            }
        }

        map.printBoard(board);

        while (isTrue) {
            try {
                if (conditionsChecker.checkIfWinner(board)) {
                    isTrue = false;
                }
                while (!conditionsChecker.checkIfWinner(board)) {

                    row = input.nextInt();
                    col = input.nextInt();

                    if (!conditionsChecker.checkIfOutOfBoard(row, col)) {

                        if (!conditionsChecker.checkIfOccupied(row, col, board)) {

                            board[row - 1][col - 1] = playerChanger.getTurn();
                            map.printBoard(board);
                            playerChanger.changePlayer();
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.err.println("You have inputed something else\nTry again!");
                input.nextLine();
            }
        }
        playerChanger.changePlayer();
        System.out.println("The winner is " + playerChanger.getTurn());

    }
}