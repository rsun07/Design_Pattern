package BehavioralPattern.CommandPattern;

abstract class Command {
    Restaurant restaurant;

    Command(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    abstract void execute();
}
