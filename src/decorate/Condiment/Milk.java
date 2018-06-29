package decorate.Condiment;

import decorate.Beverage;
import decorate.CondimentDecorator;

public class Milk extends CondimentDecorator {
    private Beverage b;

    public Milk(Beverage b) {
        this.b = b;
    }

    @Override
    public String getDesc() {
        return b.getDesc() + ", 우유";
    }

    @Override
    public double cost() {
        return 2 + b.cost();
    }
}
