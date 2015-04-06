/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Stdout
{
    private Stdout(){
        
    }
    
    public void printline(String s) {
          System.out.println(s);  // print s to System.out
       }
    
    /**
     * Returns single instance of Stdout implementing the Singleton pattern.
     * @return a single instance of Stdout "instance".
     */
    
    public static Stdout getInstance() { return instance; }
    
    private static Stdout instance = new Stdout();
    
}
