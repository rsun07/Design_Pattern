package structuralpattern.compositepattern;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class IndividualContributer implements Employee {
    @Getter @Setter
    private String name;

    @Getter @Setter
    private Team team;

    public IndividualContributer(String name, Team team) {
        this.name = name;
        this.team = team;
    }

    @Override
    public Employee addSubordinate(Employee employee) {
        return null;
    }

    @Override
    public Employee removeSubordinate(Employee employee) {
        return null;
    }

    @Override
    public List<Employee> getSubordinates() {
        return null;
    }
}
