package CompositePattern;

import StructuralPattern.CompositePattern.*;
import org.junit.Test;

public class EmployeeTest {
    @Test
    public void test() {
        Employee ceo = new Manager("Mike", Team.Leadership);

        Employee John = new Manager("John", Team.HR);
        Employee Jane = new IndividualContributer("Jane", Team.HR);
        Employee Marry = new IndividualContributer("Marry", Team.HR);
        John.addSubordinate(Jane);
        John.addSubordinate(Marry);

        Employee Ryan = new Manager("Ryan", Team.Engineer);
        Employee Hon = new IndividualContributer("Hon", Team.Engineer);
        Employee icJohn = new IndividualContributer("John", Team.Engineer);
        Ryan.addSubordinate(Hon);
        Ryan.addSubordinate(icJohn);

        Employee Park = new IndividualContributer("Park", Team.Finance);

        ceo.addSubordinate(John);
        ceo.addSubordinate(Ryan);
        ceo.addSubordinate(Park);

        PrintEmployees.printEmployees(ceo, 1);
    }
}
