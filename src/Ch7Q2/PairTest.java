package Ch7Q2;

import Ch7Q2.Pair;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Main class to test the Pair class 
 * 
 */
public class PairTest
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        
        
       
        Pair <Integer, String> p1 = new Pair(1, "one");
        Pair <Integer, String> p2 = new Pair(2, "two");
        
        System.out.println("Equals? " + p1.equals(p2));
        System.out.println("hash code: " + p1.hashCode());
        System.out.println(p1.toString());
        
        Pair p = (Pair) p1.clone();
        System.out.println("Cloned: " + p.toString());
        
        //output
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("p1.dat"));
        out.writeObject(p1);
        out.close();
        
        //input
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("p1.dat"));
        Pair gotP = (Pair) in.readObject();
        System.out.println("Serialized equals? " + p1.equals(gotP));
    }
}
