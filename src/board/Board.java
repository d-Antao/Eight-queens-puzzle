package board;
import board.lines.*;


public class Board {
    
    public static final int n = 8;
    Piece[][] pieces;
    

    public Board(String conf) throws IllegalArgumentException {
        
        if(conf.length() != n*n){
            throw new IllegalArgumentException("Argumento inválido!");
        }
        this.pieces = new Piece[n + 1][n + 1];
        
        

        for(int i = 0 ; i < n ;i++ ){
            for(int j = 0 ; j < n ; j++){
                char pos = conf.charAt(i*n +j);
                if(pos == 'Q'){
                    pieces [i+1][j+1] = Piece.QUEEN;
                }
                else if( pos == '-'){
                    pieces [i+1][j+1] = Piece.NONE;
                }
                else{
                    throw new IllegalArgumentException("Argumento inválido!");
                }
            }
        }
    }
    
    public void cont(){

    }
    

    public boolean isValid(){

    

    public Piece getPiece(long row, long column) throws IndexOutOfBoundsException{
        if (row <= 0 || row > n ||  column <= 0 ||column > n )
            throw new IndexOutOfBoundsException("Fora do tabuleiro!");
        return pieces[(int) row][(int) column];
    }

    public boolean isTarget(Long row, long column) throws IndexOutOfBoundsException{
        if (row <= 0 || row > n ||  column <= 0 ||column > n )
            throw new IndexOutOfBoundsException("Fora do tabuleiro!");
        int cont = 0;

        for(int i=0; i < n ;i++){
            for(int j = 0 ;j < n;j++){
                if(pieces[i + 1][j+1] == Piece.QUEEN){
                    cont +=1;
                    if(cont != 1){
                        return true;
                    }
                }
            }
            cont=0;
        }
        return false;
    }

    public Piece[] getRow(long row) throws IndexOutOfBoundsException{
        if (row <= 0 || row > n)
            throw new IndexOutOfBoundsException("Fora do tabuleiro!");
        Piece[] result = new Piece[pieces.length];
        for (int i = 0; i < pieces.length; i++) {
            result[i] = pieces[i][(int) row];
        }
        return result; 
    }


    public Piece[] getColumn(long column) throws IndexOutOfBoundsException{
        if (column <= 0 ||column > n )
            throw new IndexOutOfBoundsException("Fora do tabuleiro!");
        Piece[] result = new Piece[pieces.length];
        for (int j = 0; j < pieces.length; j++) {
            result[j] = pieces[j][(int) column];
        }
        return result;  
    }

    
    public Diagonal getDiagonal(long row, long column) throws IndexOutOfBoundsException{

    }

    public Piece[] getAntidiagonal(long row, long column) throws IndexOutOfBoundsException{
        if (row <= 0 || row > n ||  column <= 0 ||column > n )
            throw new IndexOutOfBoundsException("Fora do tabuleiro!");
        Piece[] resul = new Piece[pieces.length];
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces.length; j++) {
                resul[i-j] = pieces[i-j][(int) column];
            
            }
        }   
        return resul;
    
    }
}



