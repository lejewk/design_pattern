package command.control;

import command.commands.Command;

public class RemoteControl {
    Command onCommand[];
    Command offCommand[];

    public RemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];
        
    }
}
