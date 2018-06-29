package decorate.Drink;

import decorate.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        desc = "하우스 블랜드";
    }
    @Override
    public double cost() {
        return 12;
    }
}
