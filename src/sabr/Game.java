package sabr;

import sabr.pieces.Piece;

import java.util.Set;

import static sabr.InputCoordinates.inputPieceCoordinatesForColor;

public class Game {

    private final Board board;
    private final BoardConsoleRenderer renderer = new BoardConsoleRenderer();

    public Game(Board board) {
        this.board = board;
    }

    public void gameLoop(){
        boolean isWhiteToMove = true;

        while(true){
            //render
            renderer.render(board);

            //input
            Coordinates sourceCoordinate =  inputPieceCoordinatesForColor(
                    isWhiteToMove ? Color.WHITE : Color.BLACK, board
            );

            Piece piece = board.getPiece(sourceCoordinate);
            Set<Coordinates> availableMoveSquares =  piece.getAvailableMoveSquares(board);
            Coordinates targetCoordinates = InputCoordinates.inputAvailableSquare(availableMoveSquares);

            //make move
            board.movePiece(sourceCoordinate, targetCoordinates, piece);
            //pass move
            isWhiteToMove =! isWhiteToMove;
        }
    }
}
