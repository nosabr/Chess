package sabr;

import sabr.pieces.Pawn;
import sabr.pieces.Piece;

import java.util.HashMap;

public class Board {
    HashMap<Coordinates, Piece> pieces = new HashMap<>();

    public void setPiece(Coordinates coordinates, Piece piece){
        piece.coordinates = coordinates;
        pieces.put(coordinates,piece);
    }

    public void setupDefaultPiecesPosition(){
        for (File file : File.values()){
            setPiece(new Coordinates(file, 2), new Pawn(Color.WHITE, new Coordinates(file, 2)));
            setPiece(new Coordinates(file, 7), new Pawn(Color.BLACK, new Coordinates(file, 2)));

        }
    }
}
