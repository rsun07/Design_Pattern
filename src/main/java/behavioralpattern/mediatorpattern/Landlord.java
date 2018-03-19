package behavioralpattern.mediatorpattern;

public class Landlord extends PersonInLease {
    Landlord(String name, int acceptableRent, LeasePersonType type, Mediator mediator) {
        super(name, acceptableRent, type, mediator);
    }

    @Override
    public void match(PersonInLease person) {
        if (this.getType() == person.getType()) {
            throw new IllegalArgumentException("Cannot math with another landlord");
        }
        this.mediator.setLandlord(this);
        this.mediator.match(person);
    }
}
