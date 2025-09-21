package oops;
import java.util.*;

public class tictactoe {
    static char[] board = new char[10]; 
    static char playerLetter, computerLetter;
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    public static void createBoard() {
        for (int i = 1; i < 10; i++) {
            board[i] = ' ';
        }
    }                  
    public static void chooseLetter() {
        System.out.print("Choose your letter (X or O): ");
        playerLetter = sc.next().toUpperCase().charAt(0);
        computerLetter = (playerLetter == 'X') ? 'O' : 'X';
        System.out.println("Player: " + playerLetter + " | Computer: " + computerLetter);
    }
    public static void showBoard() {
        System.out.println(" " + board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("---+---+---");
        System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("---+---+---");
        System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9]);
    }
    public static boolean isSpaceFree(int index) {
        return board[index] == ' ';
    }
    public static void makeMove(char letter, int index) {
        if (isSpaceFree(index)) {
            board[index] = letter;
        }
    }
    public static String toss() {
        return (rand.nextInt(2) == 0) ? "Player" : "Computer";
    }
    public static boolean isWinner(char letter) {
        return ((board[1] == letter && board[2] == letter && board[3] == letter) ||
                (board[4] == letter && board[5] == letter && board[6] == letter) ||
                (board[7] == letter && board[8] == letter && board[9] == letter) ||
                (board[1] == letter && board[4] == letter && board[7] == letter) ||
                (board[2] == letter && board[5] == letter && board[8] == letter) ||
                (board[3] == letter && board[6] == letter && board[9] == letter) ||
                (board[1] == letter && board[5] == letter && board[9] == letter) ||
                (board[3] == letter && board[5] == letter && board[7] == letter));
    }
    public static int computerMove() {
    	for (int i = 1; i < 10; i++) {
            if (isSpaceFree(i)) {
                board[i] = computerLetter;
                if (isWinner(computerLetter)) {
                    board[i] = ' ';
                    return i;
                }
                board[i] = ' ';
            }
        }
        for (int i = 1; i < 10; i++) {
            if (isSpaceFree(i)) {
                board[i] = playerLetter;
                if (isWinner(playerLetter)) {
                    board[i] = ' ';
                    return i;
                }
                board[i] = ' ';
            }
        }
        int[] corners = {1, 3, 7, 9};
        for (int pos : corners) if (isSpaceFree(pos)) return pos;
        if (isSpaceFree(5)) return 5;
        int[] sides = {2, 4, 6, 8};
        for (int pos : sides) if (isSpaceFree(pos)) return pos;
        return -1;
    }
    public static boolean isBoardFull() {
        for (int i = 1; i < 10; i++) {
            if (isSpaceFree(i)) return false;
        }
        return true;
    }
    public static boolean playAgain() {
        System.out.print("Do you want to play again? (yes/no): ");
        String ans = sc.next().toLowerCase();
        return ans.startsWith("y");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe!");
        do {
            createBoard();
            chooseLetter();
            String turn = toss();
            System.out.println(turn + " will start first.");
            boolean gameOn = true;

            while (gameOn) {
                if (turn.equals("Player")) {
                    showBoard();
                    int move;
                    do {
                        System.out.print("Enter your move (1-9): ");
                        move = sc.nextInt();
                    } while (move < 1 || move > 9 || !isSpaceFree(move));
                    makeMove(playerLetter, move);

                    if (isWinner(playerLetter)) {
                        showBoard();
                        System.out.println("Player wins!");
                        gameOn = false;
                    } else if (isBoardFull()) {
                        showBoard();
                        System.out.println("It's a tie!");
                        gameOn = false;
                    } else {
                        turn = "Computer";
                    }
                } else {
                    int move = computerMove();
                    makeMove(computerLetter, move);
                    System.out.println("Computer chose: " + move);

                    if (isWinner(computerLetter)) {
                        showBoard();
                        System.out.println("Computer wins!");
                        gameOn = false;
                    } else if (isBoardFull()) {
                        showBoard();
                        System.out.println("It's a tie!");
                        gameOn = false;
                    } else {
                        turn = "Player";
                    }
                }
            }
        } while (playAgain());
    }
}
