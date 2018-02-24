package CreationPattern.AbstractFactory;

import CreationPattern.AbstractFactory.Elements.ElementsAggregator;

public class USYamahaMotor extends YamahaMotor {
    // Motor in China doesn't allow flame and turbo
    private USYamahaMotor(ElementsAggregator elements) {
        this.owner = elements.getBuyer();
        this.engine = elements.getEngine();

        System.out.println(this.owner + "'s USYamahaMotor is built");
    }

    public static Motor buildUSYamahaMotor(ElementsAggregator elements) {
        return new USYamahaMotor(elements);
    }
}
