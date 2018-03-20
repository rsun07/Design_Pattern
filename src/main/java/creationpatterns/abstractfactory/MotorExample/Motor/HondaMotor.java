package creationpatterns.abstractfactory.MotorExample.Motor;

import creationpatterns.abstractfactory.MotorExample.Elements.Engine;

public abstract class HondaMotor implements Motor {
    String owner;
    Engine engine;

    @Override
    public void run() {
        System.out.println(this.owner + "'s HondaMotor is running");
    }

}
