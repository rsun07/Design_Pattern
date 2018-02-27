package StructuralPattern.CompositePattern;

import com.google.common.base.Strings;

import java.util.List;

public class PrintEmployees {
    public static void printEmployees(Employee employee, int level) {

        if (employee.getName() == null) {
            return;
        }

        printEmployee(employee, level);

        List<Employee> subordinates = employee.getSubordinates();
        if (subordinates == null) {
            return;
        }

        for (Employee subordinate : subordinates) {
            printEmployees(subordinate, level+1);
        }
        System.out.println();
    }

    private static void printEmployee(Employee employee, int level) {
        System.out.printf(
                "%s %s from %s Team\n",
                Strings.repeat("--", level-1),
                employee.getName(),
                employee.getTeam().getTeamName()
        );
    }
}
