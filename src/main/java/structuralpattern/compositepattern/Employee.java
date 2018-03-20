package structuralpattern.compositepattern;

import java.util.List;

public interface Employee {

    String getName();

    Team getTeam();

    Employee addSubordinate(Employee employee);

    Employee removeSubordinate(Employee employee);

    List<Employee> getSubordinates();
}
