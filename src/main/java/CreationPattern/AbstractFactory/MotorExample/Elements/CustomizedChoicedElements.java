package CreationPattern.AbstractFactory.MotorExample.Elements;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomizedChoicedElements {
    private final String buyer;
    private final EngineChoice engine;
    private final boolean flame;
    private final boolean turbo;
}
