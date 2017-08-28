/**
 * This program sings the song "Ants Go Marching."
 * lyrics: http://www.kidspot.com.au/Baby-Baby-play-and-toys-The-ants-go-marching-lyrics+5210+425+article.htm
 *
 * @author  you
 * @version today
 */

public class AntsGoMarching 
{
    /**
     * Sings the first two lines.
     *
      * @param Number (as a word) for how the ants march
     */
    public static void goMarching(String number) 
    {
        System.out.printf("The ants go marching %s by %s.%n", number, number);
        System.out.println("Hurrah! Hurrah!");
    }
    
    /**
     * Sings the third line.
     *
     * @param Number (as a word) for how the ants march
     */ 
    public static void noHurrah(String number)
    {
        System.out.printf("The ants go marching %s by %s.%n", number, number);
    }
    
    /**
     * Sings the 4th line about the little ant.
     *
     * @param action What the little one stops to do
     */
    public static void littleAnt(String action)
    {   
        System.out.printf("The little one stops to %s,%n", action);
    }
    
    /**
     * Sings the last two lines of each verse.
     */ 
    public static void rain() 
    {
        System.out.println("And they all go marching down into the ground");
        System.out.println("To get out of the rain.");
        System.out.println("BOOM! BOOM! BOOM! BOOM!");
        System.out.println("BOOM! BOOM! BOOM! BOOM!");
    }

    /**
     * Sings a verse of Ants Go Marching.
     * 
     * @param number Number (as a word) for how the ants march
     * @param action What the little one stops to do
     */
    public static void singIt(String n, String action) 
    {
        goMarching(n);
        goMarching(n);
        noHurrah(n);
        littleAnt(action);
        rain();
        System.out.println();
    }

    /**
     * Calls the singIt() for each verse.
     */
    public static void main(String[] args) 
    {
        System.out.println("Ants Go Marching\n");
        
        singIt("one","suck his thumb");
        singIt("two", "tie his shoe");
        singIt("three", "climb a tree");
        singIt("four", "shut the door");
        singIt("five", "take a dive");
        singIt("six", "pick up sticks");
        singIt("seven", "pray to heaven");
        singIt("eight", "roller skate");
        singIt("nine", "check the time");
        singIt("ten", "shout the end");
    }
   
}