
package Ch10Q1;

import java.util.Collection;
import java.util.LinkedList;

/**
 * This class implements MyQueue and 
 * acts as an adapter that uses a LinkedList
 * 
 * @param <E>
 */
public class LQueue<E> implements MyQueue
{
    public LQueue (LinkedList<E> list)
    {
        this.list = list;
    }
    /**
     * Returns the head of the queue
     * @return list.getFirst()
     */
    @Override
    public Object head()
    {
        return this.list.getFirst();
    }
    /**
     * Removes the head, then returns the head of the queue
     * @return list.getFirst()
     */
    @Override
    public Object dequeue()
    {
       try
       {
       this.list.remove(this.list.getFirst());
       }
       catch (Exception e) { }
       
       return this.list.getFirst();
    }
    /**
     * Adds an object into the queue
     * @param e the object
     */
    @Override
    public void enqueue(Object e)
    {
       this.list.add(e);
    }
    /**
     * Gets the size of the queue/
     * @return list.size();
     */
    @Override
    public int size()
    {
        return this.list.size();
    }
    /**
     * Checks if the queue is empty
     * @return list.isEmpty()
     */
    @Override
    public boolean isEmpty()
    {
        return this.list.isEmpty();
    }
    /**
     * Adds a collection to the list
     * @param c 
     */
    @Override
    public void addAll(Collection c)
    {
        this.list.addAll(c);
    }
    
    private final LinkedList list;
}
