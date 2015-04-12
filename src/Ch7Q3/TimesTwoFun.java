
package Ch7Q3;


public class TimesTwoFun implements Functor <Integer, Integer>
{

    @Override
    public Integer apply(Integer param)
    {
        return param * 2;
    }

}
