package factory.pizza;

import factory.ingredients.PizzaIngredientFactory;

public class KoreaClamPizza extends Pizza {
    private PizzaIngredientFactory factory;

    public KoreaClamPizza(PizzaIngredientFactory factory) {
        this.setName("한국산 조개 피자");
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.printf("%s 피자(을)를 준비중입니다.", getName());
        dough = factory.createDough();
        cheese = factory.createCheese();
    }
}
