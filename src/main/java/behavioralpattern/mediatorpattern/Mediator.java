package behavioralpattern.mediatorpattern;

public interface Mediator {
    boolean match(PersonInLease person);

    void setLandlord(PersonInLease person);

    void setTenant(PersonInLease person);
}
