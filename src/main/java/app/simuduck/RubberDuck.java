/**
 * 
 */
package app.simuduck;

import app.simuduck.behavior.fly.FlyNoWay;
import app.simuduck.behaviour.quack.Squeak;

/**
 * @author Akash.Singh
 *
 */
public class RubberDuck extends Duck
{

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    
    @Override
    public void display()
    {
        System.out.println( "I'm a rubber duck" );
    }

}
