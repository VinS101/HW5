package Ch10Q2;


/**
 * Stdout class to demonstrate the singlton pattern
 * 
 */
public class Stdout
{
    /**
     * Empty constructor for Stdout class
     */
    private Stdout(){}
    
    /**
     * Main method to test the singlton pattern
     * @param args 
     */
    public static void main(String[] args)
    {
       Stdout.getInstance().printline("Hellow");
    }
    
    /**
     * Print out whatever inputted
     * @param input 
     */
    public void printline(String input) 
    {
        System.out.println(input);  // print String input to System.out
    }
    
    /**
     * Returns single instance of Stdout implementing the Singleton pattern.
     * @return sdoutInstance
     */
    public static Stdout getInstance(){ return sdoutInstance; }
    
    private static Stdout sdoutInstance = new Stdout();
}


