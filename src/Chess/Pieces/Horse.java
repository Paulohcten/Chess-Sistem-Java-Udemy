package Chess.Pieces;

import Boardgame.Board;
import Chess.ChessPiece;
import Chess.Color;

public class Horse extends ChessPiece {

    public Horse(Board board, Color color){
        super(board,color);
    }
    @Override
    public String toString(){
        return "H";
    }

}