package Program;

import Chess.ChessMatch;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        ChessMatch chessMatch = new ChessMatch();
        UserInterface.printBoard(chessMatch.getPieces());
    }
}
