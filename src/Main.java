import board.Board;
import board.lines.Piece;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String validConfiguration;
        String invalidConfiguration;

        System.out.println("Test 1 (true):");
        validConfiguration = "-Q------" + "---Q----" + "-----Q--" + "-------Q" + "--Q-----" + "Q-------"
                + "------Q-" + "----Q---";
        try {
            Board b1 = new Board(validConfiguration);
            System.out.println(b1.isValid());
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        


       
    }
                
        
        
}
