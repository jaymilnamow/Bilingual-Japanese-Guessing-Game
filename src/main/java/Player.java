import java.util.Scanner;


public class Player {

    /**
     * Prompt Player for number input
      */

    public int takeAGuess() {
        Scanner input = new Scanner(System.in);

        System.out.println("Guess a number from 1-50:");
        return input.nextInt();
    }






}
