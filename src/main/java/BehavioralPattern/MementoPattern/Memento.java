package BehavioralPattern.MementoPattern;

import lombok.Data;

@Data
public class Memento {
    private String name;
    private int age;

    public Memento(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
