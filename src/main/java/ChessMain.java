import java.util.ArrayList;
import java.util.HashMap;

public class ChessMain {
    public static void main(String[] args) {
        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();
        for (Player player: players){
            System.out.println(player);
        }
        main.createPieces();
        HashMap<String, Piece> pieceHashMap = main.createPieces();
        System.out.println(pieceHashMap);
        main.play(players, pieceHashMap);
    }
    public ArrayList<Player> createPlayers(){
        Player whitePlayer = new Player("Nuer", "amanda_ferz@gmail.com", true, 2000, 20);
        Player blackPlayer = new Player("Met Knight", "met_knight@gmail.com", false, 2500, 15);
        ArrayList<Player> players = new ArrayList<>();
        players.add(whitePlayer);
        players.add(blackPlayer);
        return players;
    }
    public  HashMap<String, Piece> createPieces(){
        King blackKing = new King(new Spot("d", 8), "black_king", false);
        System.out.println(blackKing);
        Knight blackKnight = new Knight(new Spot("d", 6), "blackKnight", false);
        System.out.println(blackKnight);
//////////////////////////////////////////////////////////////////////////////////////
        King whiteKing = new King(new Spot("h", 7), "white_king", true);
        System.out.println(whiteKing);
        Rook whiteRookOne = new Rook(new Spot("a", 7), "whiteRookOne", true);
        System.out.println(whiteRookOne);
        Rook whiteRookTwo = new Rook(new Spot("g", 7), "whiteRookTwo", true);
        System.out.println(whiteRookTwo);
        /////////////////////////////////////////////////////////
        HashMap<String, Piece> pieceHashMap = new HashMap<>();
        pieceHashMap.put(whiteKing.getId(), whiteKing);
        pieceHashMap.put(blackKing.getId(), blackKing);
        pieceHashMap.put(blackKnight.getId(), blackKnight);
        pieceHashMap.put(whiteRookOne.getId(), whiteRookOne);
        pieceHashMap.put(whiteRookTwo.getId(), whiteRookTwo);
        return pieceHashMap;
    }
    public void  play(ArrayList<Player> players, HashMap<String, Piece> hashMap){
        //move1
        try {
            players.get(0).movePiece(hashMap.get("whiteRookOne"), new Spot("a", 8));
        }
        catch (IllegalArgumentException error){
            System.out.println("The move incorrect, please try again!");
            //retry functionality
        }
        players.get(1).movePiece(hashMap.get("blackKnight"), new Spot("c", 8));

    }
    }
