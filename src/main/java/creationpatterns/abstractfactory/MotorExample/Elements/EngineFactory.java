package creationpatterns.abstractfactory.MotorExample.Elements;

// a simple factory
public class EngineFactory {
    public static Engine buildEngine(int volumn) {
        switch (volumn) {
            case 300 : return new Engine300();
            case 500 : return new Engine500();
            default : return new Engine() {};
        }
    }
}
