package sabr.pieces;

import sabr.Color;
import sabr.Coordinates;

abstract public class Piece {
    final Color color;
    public Coordinates coordinates;

    public Piece(Color color, Coordinates coordinates) {
        this.color = color;
        this.coordinates = coordinates;
    }
}
