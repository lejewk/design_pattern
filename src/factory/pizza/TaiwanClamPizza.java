package factory.pizza;

import factory.ingredients.PizzaIngredientFactory;

public class TaiwanClamPizza extends Pizza {
    private PizzaIngredientFactory factory;
    public TaiwanClamPizza(PizzaIngredientFactory factory) {
        this.setName("대만산 조개 피자");
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.printf("%s 피자(을)를 준비중입니다.", getName());
        dough = factory.createDough();
        cheese = factory.createCheese();
    }
}
