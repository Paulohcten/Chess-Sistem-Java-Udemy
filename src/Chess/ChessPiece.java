package Chess;

import Boardgame.Board;
import Boardgame.Piece;
import Boardgame.Position;

public abstract class ChessPiece extends Piece {

    private Color color;
    private int moveCount;


    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public int getMoveCount(){
        return moveCount;
    }

    public Color getColor() {
        return color;
    }
    protected  boolean isThereOpponentPiece (Position position){
         ChessPiece somePiece = (ChessPiece)getBoard().piece(position);
         return somePiece != null && somePiece.getColor() != color;
    }

    public ChessPosition getChessPosition(){
        return ChessPosition.fromPosition(position);
    }

    public void increaseMoveCount(){
        moveCount++;
    }

    public void decreaseMoveCount(){
        moveCount--;
    }

}
