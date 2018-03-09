package CreationPatterns.AbstractFactory.MotorExample.Elements;

public enum EngineChoice {
    ENGINE_500(500),
    ENGINE_300(300);

    private int volume;

    EngineChoice(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
