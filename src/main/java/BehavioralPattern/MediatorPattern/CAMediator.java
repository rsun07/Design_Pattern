package BehavioralPattern.MediatorPattern;

import lombok.Setter;

// California Mediator
@Setter
public class CAMediator implements Mediator {
    private PersonInLease landlord;
    private PersonInLease tenant;

    public boolean match(PersonInLease person) {
        if (person.getType().equals(LeasePersonType.Landlord)) {
            this.setLandlord(person);
        } else if (person.getType().equals(LeasePersonType.Tenant)) {
            this.setTenant(person);
        } else {
            throw new IllegalArgumentException("Person type not support");
        }

        if (landlord == null || tenant == null) {
            throw new RuntimeException("Not enough resource for match");
        }

        if (landlord.getAcceptableRent() <= tenant.getAcceptableRent()) {
            System.out.printf(
                    "\n%s could rent from %s, rent will be %d\n",
                    tenant.getName(),
                    landlord.getName(),
                    landlord.getAcceptableRent()
            );
            return true;
        } else {
            System.out.printf(
                    "\n%s request more rent than %s could accept.\n" +
                    "either %s reduce the rent request to %d, or %s willing to pay %d\n",
                    landlord.getName(),
                    tenant.getName(),
                    landlord.getName(),
                    tenant.getAcceptableRent(),
                    tenant.getName(),
                    landlord.getAcceptableRent()
            );
            return false;
        }
    }
}
