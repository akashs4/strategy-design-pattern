/**
 * 
 */
package app.simuduck.simulator;

import app.simuduck.Duck;
import app.simuduck.MallardDuck;
import app.simuduck.ModelDuck;
import app.simuduck.behavior.fly.FlyRocketPowered;

/**
 * @author Akash.Singh
 *
 */
public class MiniDuckSimilator
{
    public static void main( String[] args )
    {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior( new FlyRocketPowered() );
        modelDuck.performFly();
    }
}
