/**
 * 
 */
package app.simuduck.behavior.fly;

/**
 * @author Akash.Singh
 *
 */
public class FlyNoWay implements FlyBehavior
{

    @Override
    public void fly()
    {
        System.out.println( "I can't fly" );
    }

}
