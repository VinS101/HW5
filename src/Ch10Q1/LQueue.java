
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

    @Override
    public Object head()
    {
        return this.list.getFirst();
    }

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

    @Override
    public void enqueue(Object e)
    {
       this.list.add(e);
    }

    @Override
    public int size()
    {
        return this.list.size();
    }

    @Override
    public boolean isEmpty()
    {
        return this.list.isEmpty();
    }

    @Override
    public void addAll(Collection c)
    {
        this.list.addAll(c);
    }
    
    private final LinkedList list;
}
