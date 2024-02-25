public class GameDriver {
    
    private GameState state; //The current state of the game

    public GameDriver(GameState state) {
        this.state=state;
    }

    public void play() {
        System.out.println("The initial state of the game is: " + state); //Prints initial state

        while (!state.isGameOver()) {
            Player currentPlayer= state.getCurrentPlayer(); //Creates current player object
            String currentMove= state.toString(); //Creates current move string
            System.out.println("Current player: " + currentPlayer); //Prints current player
            System.out.println("Current player's move: " + currentMove); //Prints current string
            state.makeMove(currentMove); //Makes the move
        }

        Player victor = state.getWinner();
        if (victor != null) {
            System.out.println(victor + " wins"); //Win
        } else {
            System.out.println("Game ends in a draw"); //Draw
        }
    }


}
