package BehavioralPattern.MementoPattern;

import lombok.Data;

// Originator in Memento Pattern
@Data
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Memento createMemento() {
        return new Memento(this.name, this.age);
    }

    // recover memento
    public void setMemento(Memento memento) {
        this.name = memento.getName();
        this.age = memento.getAge();
    }
}
