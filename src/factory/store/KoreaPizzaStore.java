package factory.store;

import factory.ingredients.KoreaPizzaIngredientFactory;
import factory.pizza.KoreaCheesePizza;
import factory.pizza.KoreaClamPizza;
import factory.pizza.Pizza;

public class KoreaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        KoreaPizzaIngredientFactory ingredientFactory = new KoreaPizzaIngredientFactory();
        if (type.equals("cheese")) {
            return new KoreaCheesePizza(ingredientFactory);
        } else if (type.equals("clam")) {
            return new KoreaClamPizza(ingredientFactory);
        }

        return null;
    }
}
