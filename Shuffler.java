/**
 * This class provides a convenient way to test shuffling methods.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shuffler 
{
    /**
     * Apply a "perfect shuffle" to the argument.
     * The perfect shuffle algorithm splits the deck in half, then interleaves
     * the cards in one half with the cards in the other.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static int[] perfectShuffle(int[] values) 
    {
        int length = values.length;
        int[] shuffled = new int[length];
        int k = 0;
        for (int j = 0; j < length / 2; j++)
        {
            shuffled[k] = values[j];
            k += 2;
        }
        k = 1;
        for (int j = length / 2; j < length; j++)
        {
            shuffled[k] = values[j];
            k += 2;
        }
        return shuffled;    // replace this line
    }

    /**
     * Apply an "efficient selection shuffle" to the argument.
     * The selection shuffle algorithm begins by exchanging the last element
     * in the array with randomly selected element preceeding it, and then 
     * exchanging the second-to-the-last element with another randomly 
     * selected element preceeding it.  The selection thus continues from 
     * the back to the front with random elements selected from those 
     * preceeding it.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void selectionShuffle(int[] values) 
    {
        for (int k = values.length - 1; k >= 0; k--)
        {
            int r = (int)Math.random() * (k);
            int temp = values[r];
            values[r] = values[k];
            values[k] = temp;
        }
    }
}
