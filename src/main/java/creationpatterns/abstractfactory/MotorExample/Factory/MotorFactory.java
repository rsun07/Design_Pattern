package creationpatterns.abstractfactory.MotorExample.Factory;

import creationpatterns.abstractfactory.MotorExample.Elements.*;
import creationpatterns.abstractfactory.MotorExample.Motor.Motor;

public interface MotorFactory {
    Motor buildHondaMotor(CustomizedChoicedElements elements);

    Motor buildYamahaMotor(CustomizedChoicedElements elements);

    default ElementsAggregator buildMotor(CustomizedChoicedElements elements) {
        Flame flame = elements.isFlame() ? new Flame() : null;
        Turbo turbo = elements.isTurbo() ? new Turbo() : null;
        Engine engine = EngineFactory.buildEngine(elements.getEngine().getVolume());

        return ElementsAggregator.builder()
                .buyer(elements.getBuyer())
                .flame(flame)
                .turbo(turbo)
                .engine(engine)
                .build();
    }
}
