/**
 * This program sings the song Old MacDonald Had a Farm.
 *
 * Version 2 - singIt() method eliminates duplicate code and make it easier to add more animals.
 * 
 * @author Jon Cooper
 * @version August 18, 2016 (v0)
 */


public class OldMacDonald2 
{
    
    /**
     * Prints the first verse of the song.
     */
    public static void eieio() 
    { 
        System.out.println("Old MacDonald had a farm, E I E I O.");
    }

    /**
     * Prints the verse about what animal the farmer has.
     * 
     * @param animal The name of the animal as a String.
     */
    public static void hadA(String animal) 
    { 
        System.out.println("And on that farm he had a " + animal + ", E I E I O.");
    }

    /**
     * Prints the two verses about the sounds the animal makes.
     * 
     * @param sound An onomotopoeia that describes the animal's sound, as a String.
     */
    public static void withA(String sound) 
    { 
        System.out.println("With a " + sound + " " + sound +  " here and a " + sound + " " + sound +  " there.");
        System.out.println("Here a " + sound + ", there a " + sound + ", everywhere a " + sound + ", " + sound + ".");  
    }

    /**
     * Prints one full verse of the song using the other helper methods.
     * 
     * @param animal The name of the animal as a String.
     * @param sound An onomatopoeia that describes the animal's sound, as a String. 
     */
    public static void singIt(String animal, String sound) 
    {
        eieio();
        hadA(animal);
        withA(sound);
        eieio();
        System.out.println();
    }

    /**
     * Makes calls to the singIt() method to sing the whole song.
     */
    public static void main(String[] args) 
    {
        System.out.println("Old MacDonald Had A Farm\n"); // Give our        song a title

        singIt("duck", "quack");
        singIt("cow", "moo");
        singIt("horse", "neigh");
        singIt("platypus","gdggdggddgdg");
        
        // now see how easy it is to add some more animals  
        
        singIt("cat", "meow");
        singIt("dog", "bark");
        singIt("snake", "slither");
        
        // modify the methods above to get quotation marks around the animal sounds
    }
    
}
