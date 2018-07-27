package command;

import command.Option.GarageDoor;
import command.Option.Light;
import command.commands.GarageDoorOpenCommand;
import command.commands.RightOnCommand;
import command.control.SimpleRemoteControl;

public class CommandMain {
    public static void test() {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        RightOnCommand rightOnCommand = new RightOnCommand(new Light());
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());

        remote.setCommand(rightOnCommand);
        remote.buttonWasPressed();

        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();

    }
}
