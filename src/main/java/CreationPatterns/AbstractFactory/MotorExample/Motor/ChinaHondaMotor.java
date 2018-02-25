package CreationPatterns.AbstractFactory.MotorExample.Motor;

import CreationPatterns.AbstractFactory.MotorExample.Elements.ElementsAggregator;

public class ChinaHondaMotor extends HondaMotor {

    // Motor in China doesn't allow flame and turbo
    private ChinaHondaMotor(ElementsAggregator elements) {
        this.owner = elements.getBuyer();
        this.engine = elements.getEngine();

        System.out.println(this.owner + "'s ChinaYamahaMotor is built");
    }

    public static Motor buildChinaHondaMotor(ElementsAggregator elements) {
        return new ChinaHondaMotor(elements);
    }
}
