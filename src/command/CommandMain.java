package command;

import command.Option.GarageDoor;
import command.Option.Light;
import command.commands.*;
import command.control.RemoteControl;
import command.control.SimpleRemoteControl;

public class CommandMain {
    public static void test() {
        RemoteControl remote = new RemoteControl();

        Light kitchenLight = new Light("부억 등");
        RightOnCommand kitchenLightOnCommand = new RightOnCommand(kitchenLight);
        RightOffCommand kitchenLightOffCommand = new RightOffCommand(kitchenLight);

        Light livingRoomLight = new Light("내방 등");
        RightOnCommand livingRoomLightOnCommand = new RightOnCommand(livingRoomLight);
        RightOffCommand livingRoomLightOffCommand = new RightOffCommand(livingRoomLight);

        GarageDoor garageDoor = new GarageDoor("차고 문");
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        remote.setCommand(0,kitchenLightOnCommand, kitchenLightOffCommand);
        remote.setCommand(1,livingRoomLightOnCommand, livingRoomLightOffCommand);
        remote.setCommand(2, garageDoorOpenCommand, garageDoorCloseCommand);

        System.out.println(remote.toString());

        remote.onButtonWasPushed(0);
        remote.onButtonWasPushed(1);
        remote.onButtonWasPushed(2);

        remote.offButtonWasPushed(0);
        remote.offButtonWasPushed(1);
        remote.offButtonWasPushed(2);
    }
}
