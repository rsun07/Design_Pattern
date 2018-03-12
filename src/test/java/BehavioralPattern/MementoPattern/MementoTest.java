package BehavioralPattern.MementoPattern;

import org.junit.Assert;
import org.junit.Test;

public class MementoTest {
    @Test
    public void test() {
        Person person = new Person("John", 28);
        CareTaker careTaker = new CareTaker(person.createMemento());

        assertEquals(person, careTaker.getMemento());

        // modify person
        person.setAge(38);
        assertNotEquals(person, careTaker.getMemento());

        // recover from memento
        person.setMemento(careTaker.getMemento());
        assertEquals(person, careTaker.getMemento());
    }

    private void assertEquals(Person person, Memento memento) {
        Assert.assertEquals(person.getAge(), memento.getAge());
        Assert.assertEquals(person.getName(), memento.getName());
    }

    private void assertNotEquals(Person person, Memento memento) {
        boolean ageEquals = person.getAge() == memento.getAge();
        boolean nameEquals = person.getName() == null ? memento.getName() == null :
                person.getName().equals(memento.getName());
        Assert.assertFalse(ageEquals && nameEquals);
    }
}
