
/**
 * Write a description of class ConsecutiveVowels here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ConsecutiveVowels
{
    private static final int NO_VOWEL = 0;
    private static final int ONE_VOWEL = 1;
    private static final int TWO_VOWEL = 2;
    private static final String VOWELS = "aeiou";

    public static boolean hasTwoConsecutiveVowels(String word)
    {
        int currentState = NO_VOWEL;
        word = word.toLowerCase();
        for (int index = 0; index< word.length() && currentState != TWO_VOWEL; index++){
            char ch = word.charAt(index);
            if (currentState == NO_VOWEL){
                if (VOWELS.indexOf(ch) > -1){
                    currentState = ONE_VOWEL;
                }
            } else if (currentState == ONE_VOWEL){
                if (VOWELS.indexOf(ch) > -1){
                    currentState = TWO_VOWEL;
                } else {
                    currentState = NO_VOWEL;
                }
            } 
        }
        return currentState == TWO_VOWEL;
    }

    public static void main(String[] argv)
    {
        

    }

}
