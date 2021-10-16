/**
 * 
 */
package app.simuduck.behaviour.quack;

import app.simuduck.behaviour.quack.QuackBehavior;

/**
 * @author Akash.Singh
 *
 */
public class Quack implements QuackBehavior
{

    @Override
    public void quack()
    {
        System.out.println( "Quack" );
    }

}
