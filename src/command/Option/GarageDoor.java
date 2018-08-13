package command.Option;

public class GarageDoor extends Options{
    public GarageDoor(String name) {
        super(name);
    }

    public void up() {
        System.out.println("차고 문이 올라간다");
    }
    public void down() {
        System.out.println("차고 문이 내려간다");
    }
    public void stop() {

    }
    public void lightOn() {

    }
    public void lightOff() {

    }
}
