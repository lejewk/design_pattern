package factory.store;

import factory.pizza.KoreaCheesePizza;
import factory.pizza.KoreaClamPizza;
import factory.pizza.Pizza;

public class TaiwanPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new KoreaCheesePizza();
        } else if (type.equals("clam")) {
            return new KoreaClamPizza();
        }

        return null;
    }
}
