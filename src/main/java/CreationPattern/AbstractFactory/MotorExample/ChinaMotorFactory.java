package CreationPattern.AbstractFactory.MotorExample;

import CreationPattern.AbstractFactory.MotorExample.Elements.CustomizedChoicedElements;

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
