/**
 * 
 */
package app.simuduck;

import app.simuduck.behavior.fly.FlyNoWay;
import app.simuduck.behaviour.quack.MuteQuack;

/**
 * @author Akash.Singh
 *
 */
public class ModelDuck extends Duck
{
    
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display()
    {
        System.out.println( "I'm a model duck" );
    }

}
