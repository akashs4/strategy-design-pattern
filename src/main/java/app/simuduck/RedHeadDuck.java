/**
 * 
 */
package app.simuduck;

import app.simuduck.behavior.fly.FlyWithWings;
import app.simuduck.behaviour.quack.Quack;

/**
 * @author Akash.Singh
 *
 */
public class RedHeadDuck extends Duck
{

    public RedHeadDuck()
    {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display()
    {
        System.out.println( "I'm a red head duck" );
    }

}
