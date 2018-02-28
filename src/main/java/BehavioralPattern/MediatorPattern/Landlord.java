package BehavioralPattern.MediatorPattern;

public class Landlord extends PersonInLease {
    public Landlord(String name, int acceptableRent, LeasePersonType type, Mediator mediator) {
        super(name, acceptableRent, type, mediator);
    }

    @Override
    public void match(PersonInLease person) {
        this.mediator.setLandlord(this);
        this.mediator.match(person);
    }
}
