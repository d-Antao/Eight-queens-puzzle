
package board.lines;

public abstract class BoardLine {

    long length;
    long nPieces;

    public BoardLine(){
        this.length = 0;
        this.nPieces = 0;
    }
    public long length(){
        return length;
    }

    public void cont(){
        this.nPieces++;
    }

}
