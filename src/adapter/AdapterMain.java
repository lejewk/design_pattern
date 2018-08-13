package adapter;

import adapter.duck.Duck;
import adapter.duck.MallardDuck;
import adapter.duck.TurkeyAdapter;
import adapter.turkey.WildTurkey;

public class AdapterMain {
    public static void main() {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey Say~");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
