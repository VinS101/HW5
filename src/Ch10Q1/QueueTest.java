package Ch10Q1;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This class tests the LQueue 
 * Main method goes here
 */
public class QueueTest
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        MyQueue queue = new LQueue(list);
        
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println( "Size: " + queue.size());
        System.out.println("Head: " + queue.head());
        System.out.println("Next Head: " + queue.dequeue());
        
        ArrayList collection = new ArrayList();
        collection.add("a");
        collection.add("b");
        queue.addAll(collection);
        System.out.println("Head of collection: " + queue.dequeue());
        
    }
}
