package StructuralPattern.CompositePattern;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager implements Employee {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private Team team;

    private Map<String, Employee> subordinates;

    public Manager(String name, Team team) {
        this.name = name;
        this.team = team;
        this.subordinates = new HashMap<>();
    }

    @Override
    public Employee addSubordinate(Employee employee) {
        return subordinates.put(employee.getName(), employee);
    }

    @Override
    public Employee removeSubordinate(Employee employee) {
        return subordinates.remove(employee.getName());
    }

    @Override
    public List<Employee> getSubordinates() {
        return new ArrayList<>(subordinates.values());
    }
}
