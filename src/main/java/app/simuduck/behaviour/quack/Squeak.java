/**
 * 
 */
package app.simuduck.behaviour.quack;

import app.simuduck.behaviour.quack.QuackBehavior;

/**
 * @author Akash.Singh
 *
 */
public class Squeak implements QuackBehavior
{

    @Override
    public void quack()
    {
        System.out.println( "Squeak" );
    }

}
