package BehavioralPattern.MementoPattern;

import lombok.Getter;

public class CareTaker {

    @Getter
    private Memento memento;

    public CareTaker(Memento memento) {
        this.memento = memento;
    }
}
