package CreationPatterns.AbstractFactory.MotorExample.Factory;

import CreationPatterns.AbstractFactory.MotorExample.Elements.CustomizedChoicedElements;
import CreationPatterns.AbstractFactory.MotorExample.Motor.Motor;
import CreationPatterns.AbstractFactory.MotorExample.Motor.USHondaMotor;
import CreationPatterns.AbstractFactory.MotorExample.Motor.USYamahaMotor;

public class USMotorFactory implements InternationalMotorFactory {
        @Override
        public Motor buildHondaMotor(CustomizedChoicedElements elements) {
            return USHondaMotor.buildUSHondaMotor(buildMotor(elements));
        }

        @Override
        public Motor buildYamahaMotor(CustomizedChoicedElements elements) {
            return USYamahaMotor.buildUSYamahaMotor(buildMotor(elements));
        }
}
