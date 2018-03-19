package behavioralpattern.mediatorpattern;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public abstract class PersonInLease {
    private String name;

    // For Landlord, it's the min rent required.
    // For Tenant, it's the max rent accepted.
    private int acceptableRent;

    @Setter(AccessLevel.NONE)
    private LeasePersonType type;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    protected Mediator mediator;

    public abstract void match(PersonInLease person);
}
