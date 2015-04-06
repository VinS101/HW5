package Ch7Q2;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *Pair class to demonstrate generic data types
 * @param <K> key
 * @param <V> value
 */
public class Pair<K,V> implements Cloneable, Serializable, Comparable<Pair>
{
    Pair(K k, V v)
    {
        this.k = k;
        this.v = v;
    }

    /**
     * Checks for equality
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj)
    {
        return obj.hashCode() == this.hashCode();
    }
    
    /**
     * Creates a hashcode for k and v
     * @return hashcode
     */
    @Override
    public int hashCode() 
    {
        return 11 * k.hashCode() + 13 * v.hashCode();
    }
    
    @Override
    public String toString() 
    {
        String result = "The Int value of " + this.k.toString() + " is " + this.v.toString();
        return result;
    }

    /**
     * Returns a clone
     * @return this.clone
     */
    @Override
    public Object clone() 
    {
        try
        {
            return super.clone();
        } catch (CloneNotSupportedException ex)
        {
            Logger.getLogger(Pair.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    /**
     * Accessor for key
     * @return this.k
     */
    public K k() {return this.k;}
    /**
     * Accessir for value
     * @return this.v
     */
    public V v() {return this.v;}

    private final K k;
    private final V v;

   

    @Override
    public int compareTo(Pair t)
    {
        if(this.k.hashCode() == t.k.hashCode())
        {
            return 0;
        }
        else if(this.k.hashCode() > t.k.hashCode())
        {
            return 1;
        }
        
        else
        {
            return -1;
        }
    }
}
    
    
   

