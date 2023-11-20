package sabr;

public class BoardConsoleRenderer {



    public void render(Board board) {
        for (int rank = 8; rank >= 1; rank--) {
            for (File file : File.values()) {
                String line = "";
                System.out.println(file + String.valueOf(rank));
            }
        }
    }

    private String colorizeString(String sprite, Color placeColor, boolean isSquareDark){
        // format = background color + font color = text
        return "";
    }

    private String getStringForEmptySquare(Coordinates coordinates){
        return "";
    }
}
