import Model.*;

import java.util.*;
import java.util.LinkedList;

public class TicTacToeGame {

    Deque<Player> players;
    Board gameBoard;

    public void initializeGame(){
        players=new LinkedList<>();
        PlayingPieceX crossPiece=new PlayingPieceX();
        Player player1=new Player("Player1", crossPiece);

        PlayingPieceO naughtsPiece=new PlayingPieceO();
        Player player2=new Player("Player2", naughtsPiece);

        players.add(player1);
        players.add(player2);

        gameBoard=new Board(3);
    }

    public String startGame(){
        boolean noWinner=true;

        while(noWinner){
            Player playerTurn=players.removeFirst();

            gameBoard.printBoard();

            List<Pair<Integer, Integer>> freeSpaces=gameBoard.getFreeCells();
            if(freeSpaces==null){
                noWinner=false;
                continue;
            }

            Scanner sc=new Scanner(System.in);
            System.out.println("Player: "+playerTurn.getName()+" Enter row, column:");
            System.out.println("Enter X:");
            int inputRow=sc.nextInt();
            System.out.println("Enter Y:");
            int inputColumn=sc.nextInt();

            boolean pieceAdded=gameBoard.addPiece(inputRow, inputColumn, playerTurn.getPlayingPiece());
            if(!pieceAdded){
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }

            players.addLast(playerTurn);

            boolean winner=isThereWinner(inputRow, inputColumn, playerTurn.getPlayingPiece());
            if(winner){
                return playerTurn.getName();
            }
        }

        return "Tie";
    }

    private boolean isThereWinner(int row, int column, PlayingPiece pieceType) {

        boolean rowMatch=true;
        boolean columnMatch=true;
        boolean diagonalMatch=true;
        boolean antiDiagonalMatch=true;

        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType!=pieceType.getPieceType()) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType.getPieceType()) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.size;i++,j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType.getPieceType()) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType.getPieceType()) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;


    }
}
