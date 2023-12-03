package sabr;

public class Game {

    private final Board board;

    private BoardConsoleRenderer renderer = new BoardConsoleRenderer();
    public void gameLoop(){
        boolean isWhiteToMove = true;

        while(true){
            //render
            renderer.render(board);

            //input
            //make move
            //pass move
            isWhiteToMove =! isWhiteToMove;
        }
    }
}
