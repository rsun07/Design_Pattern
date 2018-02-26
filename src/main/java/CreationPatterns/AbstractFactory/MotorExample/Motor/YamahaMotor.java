package CreationPatterns.AbstractFactory.MotorExample.Motor;

import CreationPatterns.AbstractFactory.MotorExample.Elements.Engine;

public abstract class YamahaMotor implements Motor {
    String owner;
    Engine engine;

    @Override
    public void run() {
        System.out.println(this.owner + "'s YamahaMotor is running");
    }
}