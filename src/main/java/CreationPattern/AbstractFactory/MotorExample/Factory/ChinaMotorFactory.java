package CreationPattern.AbstractFactory.MotorExample.Factory;

import CreationPattern.AbstractFactory.MotorExample.Motor.ChinaHondaMotor;
import CreationPattern.AbstractFactory.MotorExample.Motor.ChinaYamahaMotor;
import CreationPattern.AbstractFactory.MotorExample.Elements.CustomizedChoicedElements;
import CreationPattern.AbstractFactory.MotorExample.Motor.Motor;

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
