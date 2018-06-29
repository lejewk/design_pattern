package decorate.Condiment;

import decorate.Beverage;
import decorate.CondimentDecorator;

public class Moka extends CondimentDecorator {
    private Beverage b;

    public Moka(Beverage b) {
        this.b = b;
    }

    @Override
    public String getDesc() {
        return b.getDesc() + ", 모카";
    }

    @Override
    public double cost() {
        return 1 + b.cost();
    }
}
