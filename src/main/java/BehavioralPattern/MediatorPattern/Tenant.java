package BehavioralPattern.MediatorPattern;

public class Tenant extends PersonInLease {
    public Tenant(String name, int acceptableRent, LeasePersonType type, Mediator mediator) {
        super(name, acceptableRent, type, mediator);
    }

    @Override
    public void match(PersonInLease person) {
        this.mediator.setTenant(this);
        this.mediator.match(person);
    }
}
