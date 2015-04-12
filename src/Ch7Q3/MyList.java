
package Ch7Q3;

import java.util.LinkedList;


public class MyList<T>  extends  LinkedList<T>
{

    
    
    public static void main(String[] args)
    {
        
        Summer summer = new Summer();
        MyList<Integer> l = new MyList<>();
        l.add(3);
        l.add(-1);
        l.add(1);
        l.add(4);
        
        Integer result = l.reduce(summer,0);
        System.out.println(result);
       
    }
    
    
    public <T, R extends Functor> MyList<T> map (R element)
    {
        MyList<T> newList = new MyList();
        
        for(int i = 0; i < this.size(); i++)
        {
            T applied = (T) element.apply(this.get(i));
            newList.add(applied);
        }
        return newList;
    }
    
    public <T, R extends Functor2> T reduce(Functor2 element, T initialValue)
    {
        T temp;
        
        temp = (T) element.apply(this.get(0), initialValue);
        for(int i = 1; i<this.size(); i++)
        {
            temp = (T) element.apply(this.get(i), temp);
            
        }
        return temp;
    }

    
      
}
