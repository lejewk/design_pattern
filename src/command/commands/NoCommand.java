package command.commands;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No Command");
    }
}
