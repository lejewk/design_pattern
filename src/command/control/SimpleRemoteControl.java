package command.control;

import command.commands.Command;

public class SimpleRemoteControl {
    private Command slot;
    public SimpleRemoteControl() {}
    public void setCommand(Command command) {
        this.slot = command;
    }
    public void buttonWasPressed() {
        slot.execute();
    }
}
