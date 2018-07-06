package factory.pizza;

import factory.ingredients.PizzaIngredientFactory;

public class KoreaCheesePizza extends Pizza {
    private PizzaIngredientFactory factory;

    public KoreaCheesePizza(PizzaIngredientFactory factory) {
        this.setName("한국산 치즈 피자");
        this.factory = factory;
    }

    public void prepare() {
        System.out.printf("%s (을)를 준비중입니다.", getName());
        dough = factory.createDough();
        cheese = factory.createCheese();
    }
}
