package creationpatterns.abstractfactory.MotorExample.Elements;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ElementsAggregator {
    private String buyer;
    private Flame flame;
    private Engine engine;
    private Turbo turbo;
}
