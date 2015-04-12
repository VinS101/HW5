
package Ch7Q3;


public class SummerTest
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
}
