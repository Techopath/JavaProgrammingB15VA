package replitExamples;
import java.util.*;
public class q134_chessBoard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE

        for (int i=0; i<chessBoard.length; i++){
            char[] letters = {'a','b','c','d','e','f','g','h'};

                for (int j=0; j<chessBoard.length;j++){
                    chessBoard[i][j]=(i+1)+"";

                }
        }


        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
}
