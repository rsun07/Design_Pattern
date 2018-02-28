package BehavioralPattern.MediatorPattern;

import org.junit.Test;

public class RentMatchTest {
    @Test
    public void testMatch() {
        Mediator caMediator = new CAMediator();

        PersonInLease tenant = new Tenant("John", 1000, LeasePersonType.Tenant, caMediator);
        PersonInLease landlord = new Landlord("Marry", 900, LeasePersonType.Landlord, caMediator);

        tenant.match(landlord);
        landlord.match(tenant);
    }

    @Test
    public void testMismatch() {
        Mediator caMediator = new CAMediator();

        PersonInLease tenant = new Tenant("John", 900, LeasePersonType.Tenant, caMediator);
        PersonInLease landlord = new Landlord("Marry", 1000, LeasePersonType.Landlord, caMediator);

        tenant.match(landlord);
        landlord.match(tenant);
    }

    @Test(expected = RuntimeException.class)
    public void testTwoTenant() {
        Mediator caMediator = new CAMediator();

        PersonInLease john = new Tenant("John", 900, LeasePersonType.Tenant, caMediator);
        PersonInLease marry = new Tenant("Marry", 1000, LeasePersonType.Tenant, caMediator);


        john.match(marry);
    }

    @Test(expected = RuntimeException.class)
    public void testTwoLandlord() {
        Mediator caMediator = new CAMediator();

        PersonInLease john = new Landlord("John", 900, LeasePersonType.Landlord, caMediator);
        PersonInLease marry = new Landlord("Marry", 1000, LeasePersonType.Landlord, caMediator);


        john.match(marry);
    }

    @Test
    public void multiMatch() {
        Mediator caMediator = new CAMediator();

        PersonInLease john = new Tenant("John", 900, LeasePersonType.Tenant, caMediator);
        PersonInLease peter = new Tenant("Peter", 1000, LeasePersonType.Tenant, caMediator);
        PersonInLease jane = new Tenant("Jane", 1100, LeasePersonType.Tenant, caMediator);

        PersonInLease marry = new Landlord("Marry", 1000, LeasePersonType.Landlord, caMediator);
        PersonInLease hey = new Tenant("Hey", 1100, LeasePersonType.Landlord, caMediator);


        john.match(marry);
        john.match(hey);

        peter.match(hey);
        peter.match(marry);

        jane.match(marry);
    }

    /*
        There is issue in this Mediator pattern,
        the tenant may be matched with a landlord he/she doesn't expected to.
        At the time when the tenant choose another tenant by mistake,
        however, the Mediator already has a landlord cached.

        To solve it, we should add check in the PersonInLease's match() method.
        If the input person has the same type as the person itself, raise exception.
     */
    @Test
    public void issue() {
        Mediator caMediator = new CAMediator();

        PersonInLease john = new Tenant("John", 900, LeasePersonType.Tenant, caMediator);
        PersonInLease peter = new Tenant("Peter", 1000, LeasePersonType.Tenant, caMediator);

        PersonInLease marry = new Landlord("Marry", 1000, LeasePersonType.Landlord, caMediator);


        john.match(marry);
        john.match(peter);
    }
}
