public class Game {

    private int secretNumber;
    private int guess;
    private int guessCounter;
    private int previousGuess;


    public void startGame(Player player){
        secretNumberGenerator();
        //setSecretNumber(10);

        while(secretNumber != guess){
            guess = player.takeAGuess();
            checkGuess();
        }
    }

    public void secretNumberGenerator() {
        secretNumber = (int) (Math.random() * 50  + 1);
    }

    public void setSecretNumber(int secretNumber) {
        this.secretNumber = secretNumber;
    }

    public void checkGuess() {
        if (checkForRepeat()) {
            return;
        } else {
            guessCounter++;
        }

        if (guessIsEqual()) {
            System.out.println("正解！よくできました！ \n(Correct! Great job!)");
            System.out.println("You got it in " + guessCounter + " tries.");
        } else if (guessTooLow()) {
            System.out.println("低いすぎる。。当てください: \n(Too low.. Guess again)");
            System.out.println("Guess count: " + guessCounter);
            previousGuess = guess;
        } else if (guessTooHigh()) {
            System.out.println("高いすぎる！当てください: \n(Too high! Guess again)");
            System.out.println("Guess count: " + guessCounter);
            previousGuess = guess;
        }
    }

    public boolean guessTooHigh(){
        return (secretNumber < guess);
    }

    public boolean guessTooLow(){
        return (secretNumber > guess);
    }

    public boolean guessIsEqual(){
        return (secretNumber == guess);
    }

    public boolean checkForRepeat(){
        return (previousGuess == guess);
    }

}
