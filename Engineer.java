package BridgeBuilderAdv;
import java.util.Random;

/**
 * The Engineer class represents a computer-controlled player in the game.
 */
public class Engineer {
    /**
     * The token that represents the Engineer's moves on the game board.
     */
    private char token;

    /**
     * The difficulty level of the Engineer player. If true, the Engineer plays in hard mode.
     */
    private boolean hardMode;

    /**
     * Constructor that initializes the Engineer with a '0' token and a specific difficulty level.
     *
     * @param hardMode If true, the Engineer will play in hard mode.
     */
    public Engineer(boolean hardMode) {
        this.token = '0'; // Assigning a default token, you can adjust it according to your game rules
        this.hardMode = hardMode;
    }

    /**
     * Allows the Engineer to make a move on the game board based on the last player's move and the difficulty level.
     *
     * @param board The game board to make a move on.
     * @param playerLastRow The row of the last move made by the player.
     * @param playerLastCol The column of the last move made by the player.
     */
    public void makeMove(GameBoard board, int playerLastRow, int playerLastCol) {
        // ... implementation details
    }

    /**
     * Returns the Engineer's token.
     *
     * @return The Engineer's token.
     */
    public char getToken() {
        return this.token;
    }
}
