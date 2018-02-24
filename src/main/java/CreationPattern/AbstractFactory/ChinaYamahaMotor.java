package CreationPattern.AbstractFactory;

import CreationPattern.AbstractFactory.Elements.ElementsAggregator;

public class ChinaYamahaMotor extends YamahaMotor {
    // Motor in China doesn't allow flame and turbo
    private ChinaYamahaMotor(ElementsAggregator elements) {
        this.owner = elements.getBuyer();
        this.engine = elements.getEngine();

        System.out.println(this.owner + "'s ChinaYamahaMotor is built");
    }

    public static Motor buildChinaHondaMotor(ElementsAggregator elements) {
        return new ChinaYamahaMotor(elements);
    }
}
