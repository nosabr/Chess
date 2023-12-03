package sabr;

import java.util.Scanner;

public class InputCoordinates {
    Scanner scanner = new Scanner(System.in);

    public  Coordinates input(){
        while(true){
            System.out.println("Enter coordinates (ex: a1) ");
            String line = scanner.nextLine();
            if (line.length() != 2){
                System.out.println("Invalid format");
                continue;
            }
            char fileChar = line.charAt(0);
            char rankChar = line.charAt(1);

            if(!Character.isLetter(fileChar)){
                System.out.println("Invalid Format");
            }
            if (!Character.isDigit(rankChar)){
                System.out.println("Invalid Format");
            }
        }
    }
}
