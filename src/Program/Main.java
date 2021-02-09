package Program;

import Chess.ChessException;
import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<ChessPiece> captured = new ArrayList<>();

        System.out.println();
        ChessMatch chessMatch = new ChessMatch();
        while (!chessMatch.getCheckMate()){
            try {
                UserInterface.clearScreen();
                UserInterface.printMatch(chessMatch,captured);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UserInterface.readChessPosition(sc);

                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UserInterface.clearScreen();
                UserInterface.printBoard(chessMatch.getPieces(),possibleMoves);
                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UserInterface.readChessPosition(sc);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
                if (capturedPiece != null){
                    captured.add(capturedPiece);
                }
                if(chessMatch.getPromoted() != null){
                    System.out.print("Enter piece for promotion (Q/B/N/R): ");
                    String type = sc.nextLine().toUpperCase();
                    while (!type.equals("Q") && !type.equals("B") && !type.equals("N") && !type.equals("R")){
                        System.out.print("Invalid value!\nEnter piece for promotion (Q/B/N/R): ");
                        type = sc.nextLine().toUpperCase();
                    }
                    chessMatch.replacePromotionPiece(type);
                }
            }
            catch (ChessException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
        UserInterface.clearScreen();
        UserInterface.printMatch(chessMatch,captured);
    }
}
