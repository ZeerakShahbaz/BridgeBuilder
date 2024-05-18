package BridgeBuilderAdv;

/**
 * The Player class represents a player in the game.
 */
public class Player {
    /**
     * The token that represents the player's moves on the game board.
     */
    private char token;

    /**
     * The player's score for the game.
     */
    private int score;

    /**
     * Default constructor that initializes the player with a '+' token and a score of 0.
     */
    public Player() {
        this.token = '+';
        this.score = 0;
    }

    /**
     * Allows the player to make a move on the game board at a given row and column.
     * It first checks if the position is empty before placing the token.
     * If the position is not empty, an error message is printed.
     *
     * @param board The game board to make a move on.
     * @param row   The row to place the token.
     * @param col   The column to place the token.
     */
    public void makeMove(GameBoard board, int row, int col) {
        if(board.isPositionEmpty(row, col)) {
            board.placeToken(row, col, this.token);
        } else {
            System.out.println("Invalid move, please try again!");
        }
    }

    /**
     * Returns the player's token.
     *
     * @return The player's token.
     */
    public char getToken() {
        return this.token;
    }

    /**
     * Returns the player's score.
     *
     * @return The player's score.
     */
    public int getScore() {
        return this.score;
    }

    /**
     * Increases the player's score by a specified amount.
     *
     * @param increment The amount to increase the score by.
     */
    public void addScore(int increment) {
        this.score += increment;
    }
}
