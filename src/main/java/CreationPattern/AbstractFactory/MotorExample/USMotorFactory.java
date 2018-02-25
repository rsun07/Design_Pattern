package CreationPattern.AbstractFactory.MotorExample;

import CreationPattern.AbstractFactory.MotorExample.Elements.CustomizedChoicedElements;

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
