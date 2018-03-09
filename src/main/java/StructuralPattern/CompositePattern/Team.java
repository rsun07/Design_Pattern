package StructuralPattern.CompositePattern;

import lombok.Getter;

public enum Team {
    Engineer("Engineer"),
    Finance("Finance"),
    HR("HR"),
    Sales("Sales"),
    Leadership("Leadership");

    @Getter
    private String teamName;

    Team(String teamName) {
        this.teamName = teamName;
    }
}
