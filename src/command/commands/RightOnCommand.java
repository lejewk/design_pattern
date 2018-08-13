package command.commands;

import command.Option.Light;

public class RightOnCommand implements Command {
    private Light light;

    public RightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
