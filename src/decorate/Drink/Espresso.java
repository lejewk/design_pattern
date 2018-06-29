package decorate.Drink;

import decorate.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        desc = "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
