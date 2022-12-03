package shufflegame;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleGame implements GameRoadMap{

    Scanner sc = new Scanner(System.in);

    int[] array = {1, 0 ,1};

    /**
     * method that takes an array shuffles the components in random way and returns it
     * @param array: array to shuffle
     * @return array: shuffled array
     */
    public int[] shuffleGame(int[] array) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        return array;
    }

    /**
     * captures the user input (1, 2 or 3) saves it in an integer variable and returns it
     * @return playerGuess: userInput value
     */
    public int playerGuess() {
        int userInput = sc.nextInt();
        return (userInput);
    }

    /**
     * checks whether the player guess position is in a correct position in the shuffled array or not
     * and prints the corresponding statements
     * @param shuffledArray: takes the shuffled array
     * @param playerGuess: takes the chosen position user input
     */
    public void checkGuess(int[] shuffledArray, int playerGuess) {
        shuffledArray=shuffleGame(array);
        if (String.valueOf(playerGuess).equals("1"));
        {
            if (shuffledArray[0] == 0) {
                System.out.println("good guess");
            } else
                System.out.println("sorry wrong guess");

        }
         if (String.valueOf(playerGuess).equals("2")) {
            if (shuffledArray[1] == 0) {
                System.out.println("good guess");
            } else System.out.println("sorry wrong guess");
        }else if (String.valueOf(playerGuess).equals("3")) {
                    if (shuffledArray[2] == 0) {
                        System.out.println("good guess");
                    } else System.out.println("sorry  wrong guess");

                } else {
                    System.out.println("invalid number");
                    playAgain();
                }

        }
    /**
     * uses the previous functions in a good sequential way to run the game
     * uses the method recursion in order to loop in the game
     */
    public void playAgain(){
        System.out.println("do you want to try again? yes/no");
        String answer = sc.nextLine();
        if (answer.equals("yes")){
            System.out.println("pick 1, 2 or 3");
            checkGuess(array, playerGuess());
            playAgain();
        } else if (answer.equals("no")) {
            System.out.println("see you next time!");
        }else {
            playAgain();
        }
    }

public void play() {
    System.out.println("----------------------------------welcome to shuffle game-------------------------------");
    System.out.println("guess where the 0 is ?");
    System.out.println("are you ready to play? yes/no");
    String answer = sc.nextLine();
    if (answer.equals("yes")) {
        System.out.println("pick 1, 2 or 3");
        checkGuess(array, playerGuess());
    } else if (answer.equals("no")) {
        System.out.println("see you next time");
    } else {
        System.out.println("are you ready to play? yes/no");
        play();
    }
}

}
