package creationpatterns.abstractfactory.MotorExample.Factory;

import creationpatterns.abstractfactory.MotorExample.Elements.CustomizedChoicedElements;
import creationpatterns.abstractfactory.MotorExample.Motor.Motor;
import creationpatterns.abstractfactory.MotorExample.Motor.USHondaMotor;
import creationpatterns.abstractfactory.MotorExample.Motor.USYamahaMotor;

public class USMotorFactory implements MotorFactory {
        @Override
        public Motor buildHondaMotor(CustomizedChoicedElements elements) {
            return USHondaMotor.buildUSHondaMotor(buildMotor(elements));
        }

        @Override
        public Motor buildYamahaMotor(CustomizedChoicedElements elements) {
            return USYamahaMotor.buildUSYamahaMotor(buildMotor(elements));
        }
}
