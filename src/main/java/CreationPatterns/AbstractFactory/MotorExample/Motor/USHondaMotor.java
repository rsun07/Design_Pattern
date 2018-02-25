package CreationPatterns.AbstractFactory.MotorExample.Motor;

import CreationPatterns.AbstractFactory.MotorExample.Elements.*;

public class USHondaMotor extends HondaMotor {

    private Turbo turbo;
    private Flame flame;

    private USHondaMotor(ElementsAggregator elements) {
        this.owner = elements.getBuyer();
        this.engine = elements.getEngine();
        this.flame = elements.getFlame();
        this.turbo = elements.getTurbo();

        System.out.println(this.owner + "'s USHondaMotor is built");
    }

    public static Motor buildUSHondaMotor(ElementsAggregator elements) {
        return new USHondaMotor(elements);
    }

    @Override
    public void run() {
        String flameMessage = flame != null ? " With Flame " : " Without Flame ";
        String turboMessage = this.turbo != null ?  " With Turbo " : " Without Turbo ";
        System.out.println(this.owner + "'s USHondaMotor " + flameMessage + turboMessage + " is running");
    }
}
