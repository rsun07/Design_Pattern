package CreationPattern.AbstractFactory;

import CreationPattern.AbstractFactory.Elements.*;

public interface InternationalMotorFactory {
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
