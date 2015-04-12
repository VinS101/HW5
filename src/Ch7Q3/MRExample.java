
package Ch7Q3;

import java.util.LinkedList;


public class MRExample
{
    public static void main(String[] args)
    {
        MyList<String> ls = new MyList();
        ls.add("one");
        ls.add("two");
        ls.add("three");
        
        LengthFun length = new LengthFun();
         
        
       
        
        MyList newList = ls.map(length);
        System.out.println("lengh of first value: " + newList.get(0));
        
        Summer s = new Summer();
        int result = (int) newList.reduce(s, 0);
        System.out.println("Total value:" + result);
    }
    
}
