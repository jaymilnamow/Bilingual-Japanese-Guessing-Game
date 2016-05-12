public class App {

    public static void main(String[] args){
        System.out.println("Welcome to the Number Guessing Game! \nEnter a number between 1 and 50 and I'll totally guess it! ");

        Game game = new Game();
        Player player = new Player();

        game.startGame(player);
    }

}
