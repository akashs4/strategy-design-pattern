package app.simuduck;

import app.simuduck.behavior.fly.FlyBehavior;
import app.simuduck.behaviour.quack.QuackBehavior;

public abstract class Duck
{
    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public abstract void display();
    
    public void swim()
    {
        System.out.println( "All ducks float, even decoys" );
    }

    public void performFly()
    {
        flyBehavior.fly();
    }

    public void performQuack()
    {
        quackBehavior.quack();
    }

    public void setQuackBehavior( QuackBehavior qb )
    {
        quackBehavior = qb;
    }

    public void setFlyBehavior( FlyBehavior fb )
    {
        flyBehavior = fb;
    }
}
