package command.Option;

public class Light extends Options{
    public Light(String name) {
        super(name);
    }

    public void on() {
        System.out.println("불이 빛난다");
    }

    public void off() {
        System.out.println("불이 꺼진다");
    }
}
