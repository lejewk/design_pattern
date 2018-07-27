package command.commands;

import command.Option.Light;

public class RightOffCommand implements Command {
    private Light light;

    public RightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
