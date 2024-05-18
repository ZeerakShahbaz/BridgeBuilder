package BridgeBuilderAdv;
/**
 * The GameBoard class represents the game board (lake) where the player constructs the bridge.
 * It holds a 2D char array that represents the state of the game board, and the size of the game board.
 */
public class GameBoard {
    private char[][] board;
    private int size;

    /**
     * Constructor for GameBoard class.
     * Initializes a game board of given size and fills it with '.' to represent empty spaces.
     *
     * @param size Size of the game board.
     */

    public GameBoard(int size) {
        this.size = size;
        board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '.';
            }
        }
    }

    /**
     * Place a given token at specified position in the game board if the position is empty.
     *
     * @param row   Row of the position.
     * @param col   Column of the position.
     * @param token Token to be placed.
     */
    public void placeToken(int row, int col, char token) {
        if(isPositionEmpty(row, col)) {
            board[row][col] = token;
        }
    }

    /**
     * Checks whether the position specified by given row and column is empty.
     *
     * @param row Row of the position.
     * @param col Column of the position.
     * @return True if position is empty, false otherwise.
     */
    public boolean isPositionEmpty(int row, int col) {
        return board[row][col] == '.';
    }

    /**
     * Returns the size of the game board.
     *
     * @return Size of the game board.
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Prints the current state of the game board.
     */
    public void displayBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    /**
     * Checks whether there is a line with only the specified token in specified direction starting from given position.
     *
     * @param startRow     Row of the start position.
     * @param startCol     Column of the start position.
     * @param rowIncrement Row increment for checking in the direction.
     * @param colIncrement Column increment for checking in the direction.
     * @param token        Token to be checked.
     * @return True if there is a line, false otherwise.
     */
    private boolean checkLineForWin(int startRow, int startCol, int rowIncrement, int colIncrement, char token) {
        for (int i = 0; i < size; i++) {  // changed from 4 to size
            if (board[startRow + i * rowIncrement][startCol + i * colIncrement] != token) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks whether there is a win for the given player in any direction.
     *
     * @param player The player to be checked.
     * @return An integer representing the winning direction if there is a win, 0 otherwise.
     */
    public int checkForWinDirection(Player player) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + size <= size) {  // changed from i + 3 < size to i + size <= size
                    if (checkLineForWin(i, j, 1, 0, player.getToken())) return 1;
                }
                if (j + size <= size) {  // changed from j + 3 < size to j + size <= size
                    if (checkLineForWin(i, j, 0, 1, player.getToken())) return 2;
                }
                if (i + size <= size && j + size <= size) {  // changed from i + 3 < size and j + 3 < size to i + size <= size and j + size <= size
                    if (checkLineForWin(i, j, 1, 1, player.getToken())) return 3;
                }
            }
        }
        return 0;
    }

    /**
     * Checks whether the game board is completely filled with tokens.
     *
     * @return True if the game board is full (no empty spaces), false otherwise.
     */
    public boolean checkForTie() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == '.') {
                    return false;
                }
            }
        }
        return true;
    }
}
/**
The game "BridgeBuilder" is a strategic command-line game where players, represented by '+',
build bridges across a grid-like lake while an AI opponent, the 'Engineer' denoted by '0', obstructs them.
The objective is to link one side of the grid to another, either horizontally, vertically, or diagonally, with points assigned accordingly.
The GameBoard class acts as the environment, validating moves and managing the game state.
Difficulty levels impact the Engineer's tactics - in easy mode, obstructions are placed randomly, while in hard mode,
the Engineer strategically blocks the player. Players earn points based on bridge direction, and bonus points on larger grids.
The game uses object-oriented programming, with three core classes: Player, GameBoard, and Engineer, each encapsulating distinct roles and methods.
This game challenges players to think strategically, making every move significant.
*/