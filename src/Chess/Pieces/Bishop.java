package Chess.Pieces;

import Boardgame.Board;
import Chess.ChessPiece;
import Chess.Color;

public class Bishop extends ChessPiece {

    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "B";
    }
}