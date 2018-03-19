package behavioralpattern.commandpattern;

// Invoker
public class Waiter {
    private Command command;

    Waiter(Command command) {
        this.command = command;
    }

    public void order() {
        this.command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
