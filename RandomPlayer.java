import java.util.ArrayList;

public class RandomPlayer extends Player {
    
    public RandomPlayer(String name) {
        super(name); //Constructor
    }

    public String getNextMove(GameState state) {
        ArrayList<String> moves= state.getCurrentMoves();
        if (moves.size()==0) { //Checks if there are no valid moves
            return "no moves";
        } else {
            int random = (int) (Math.random()*moves.size()); //Returns a random move
            return moves.get(random);
        }
    }
}
