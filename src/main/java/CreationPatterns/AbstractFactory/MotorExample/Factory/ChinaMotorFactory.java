package CreationPatterns.AbstractFactory.MotorExample.Factory;

import CreationPatterns.AbstractFactory.MotorExample.Motor.ChinaHondaMotor;
import CreationPatterns.AbstractFactory.MotorExample.Motor.ChinaYamahaMotor;
import CreationPatterns.AbstractFactory.MotorExample.Elements.CustomizedChoicedElements;
import CreationPatterns.AbstractFactory.MotorExample.Motor.Motor;

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
