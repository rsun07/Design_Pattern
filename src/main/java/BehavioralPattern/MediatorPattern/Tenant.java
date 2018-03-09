package BehavioralPattern.MediatorPattern;

public class Tenant extends PersonInLease {
    public Tenant(String name, int acceptableRent, LeasePersonType type, Mediator mediator) {
        super(name, acceptableRent, type, mediator);
    }

    @Override
    public void match(PersonInLease person) {
        if (this.getType() == person.getType()) {
            throw new IllegalArgumentException("Cannot math with another tenant");
        }
        this.mediator.setTenant(this);
        this.mediator.match(person);
    }
}
