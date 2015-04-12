
package Ch7Q3;


public class LengthFun implements Functor<Integer,String>
{
    @Override
    public Integer apply(String param)
    {
        return param.length();
    }
    
     public static void main(String[] args)
     {
         LengthFun fun = new LengthFun();
         System.out.println(fun.apply("Hello"));
     }
  
}
