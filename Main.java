
/**
 * Runner for Problem Set 2.
 * Instructions at https://github.com/kellylougheed/java-pset2
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        Palindrome pal = new Palindrome();
        Chatbot bot = new Chatbot();
     
        String[] arg = {};
        
        System.out.println("Problem 2-0: Palindrome");
        pal.main(arg);
        
        System.out.println("Problem 2-1: Dragon Class");
        // Construct a dragon
        // Have it gain enough experience until it breathes fire when it attacks
        // Then call the attack method!
        
        System.out.println("Problem 2-2: Library");
        // Construct a few books
        // Print out the values of totalBooks and totalPageCount
        
        System.out.println("Problem 2-3: Clothing Store");
        // Construct one of each: Clothing, TShirt, Jeans, Sweatshirt
        
        System.out.println("Problem 2-4: Chatbot");
        bot.main(arg);
    }
}
