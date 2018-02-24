package CreationPattern.AbstractFactory;

import CreationPattern.AbstractFactory.Elements.CustomizedChoicedElements;

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
