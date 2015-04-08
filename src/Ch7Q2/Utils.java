
package Ch7Q2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * 
 */
public class Utils
{
   
    public Utils ()
    {
    
    }
    
    /**
     *
     * @param <K>
     * @param <V>
     * @param <<error>>
     * @param <Collection>
     * @param col
     * @return
     */
    public static <K extends Comparable<? super K>,V> Collection<Pair<K,V>> sortPairCollection(Collection <Pair<K,V>> col)
    {
        ArrayList list = new ArrayList();
        list.addAll(col);
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) 
    {
        ArrayList list = new ArrayList();
        ArrayList sortedList = new ArrayList();
        Pair <String,Integer > p1 = new Pair("one",1 );
        Pair <String, Integer> p2 = new Pair("two", 2);
        Pair <String, Integer> p3 = new Pair("ten", 10 );
        Pair <String, Integer> p4 = new Pair("five", 5 );
        
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        
        sortedList.addAll(Utils.sortPairCollection(list));
        System.out.println(sortedList.get(0).toString());
        System.out.println(sortedList.get(1).toString());
        System.out.println(sortedList.get(2).toString());
        System.out.println(sortedList.get(3).toString());
    }

}
