package sabr;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.setupDefaultPiecesPosition();

        BoardConsoleRenderer renderer = new BoardConsoleRenderer();
        renderer.render(board);

    }
}