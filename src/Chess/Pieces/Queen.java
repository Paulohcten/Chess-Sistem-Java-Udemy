package Chess.Pieces;

import Boardgame.Board;
import Chess.ChessPiece;
import Chess.Color;

public class Queen extends ChessPiece {

    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "Q";
    }
}