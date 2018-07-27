package command.control;

import command.commands.Command;
import command.commands.NoCommand;

public class RemoteControl {
    private Command onCommand[];
    private Command offCommand[];

    public RemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < onCommand.length; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommand[slot].execute();
    }
    public void offButtonWasPushed(int slot) {
        this.offCommand[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----------Remote Control------------\n");

        for (int i = 0; i < onCommand.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommand[i].getClass().getName() + " / " + onCommand[i].getClass().getName() + "\n");
        }

        return stringBuffer.toString();
    }
}
