package Model;

public class PlayingPiece{
    public PieceType pieceType;

    public PieceType getPieceType() {
        return pieceType;
    }

    public PlayingPiece(PieceType pieceType){
        this.pieceType=pieceType;
    }
}