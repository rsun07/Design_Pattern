package creationpatterns.abstractfactory.MotorExample.Factory;

import creationpatterns.abstractfactory.MotorExample.Motor.ChinaHondaMotor;
import creationpatterns.abstractfactory.MotorExample.Motor.ChinaYamahaMotor;
import creationpatterns.abstractfactory.MotorExample.Elements.CustomizedChoicedElements;
import creationpatterns.abstractfactory.MotorExample.Motor.Motor;

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
