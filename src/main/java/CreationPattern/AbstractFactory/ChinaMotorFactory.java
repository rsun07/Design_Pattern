package CreationPattern.AbstractFactory;

import CreationPattern.AbstractFactory.Elements.CustomizedChoicedElements;
import CreationPattern.AbstractFactory.Elements.Flame;

public class ChinaMotorFactory implements InternationalMotorFactory {
    @Override
    public Motor buildHondaMotor(CustomizedChoicedElements elements) {
        return ChinaHondaMotor.buildChinaHondaMotor(buildMotor(elements));
    }

    @Override
    public Motor buildYamahaMotor(CustomizedChoicedElements elements) {
        return ChinaYamahaMotor.buildChinaHondaMotor(buildMotor(elements));
    }
}
