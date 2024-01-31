import java.util.Scanner;

public class WordGuesser {

    // TODO: Add javadoc
    public static void main(String[] args) {

        // initialize variables and constants - some of these could be static final I guess
        String secretWord = "GHETTO";
        int MAXGUESSES = 6;
        int numGuesses = 0;
        int correctPos = 0;
        int correctLetters = 0;

        // initialize input
        Scanner input = new Scanner(System.in);

        while ((numGuesses < MAXGUESSES) && )   {
            System.out.println("Type a six-letter word");
            String guess = input.nextLine();

            // check input
            // code goes here?

            // process input
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.contains(String.valueOf(guess.charAt(i)))) {
                    correctLetters++;
                    if (secretWord.charAt(i) == guess.charAt(i))
                        correctPos++;
                }

            }

            // output results
            System.out.println(correctLetters);
            System.out.println(correctPos);
            numGuesses++;
        }
    }

    // TODO: Fully implement these checks, call them in main(), and create proper javadocs for all of them

    /**
     *
     * Check whether all input is an alphabetic character
     * Return false if this is not the case
     * @param toCheck The string that we are testing to see if it is all alphabetic
     * @return false If toCheck contains a non-alphabetic character; true if all characters are alphabetic
     */
    boolean checkAllAlpha(String toCheck) {
        return false;
    }

    boolean checkWordLength(String toCheck, int wordLength)
    {
        return false;
    }

    // do I need this? Take it out if I don't, I guess
    boolean checkIsWord(String toCheck)
    {
        return false;
    }
}