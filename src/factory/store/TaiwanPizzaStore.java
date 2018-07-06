package factory.store;

import factory.ingredients.PizzaIngredientFactory;
import factory.ingredients.TaiwanPizzaIngredientFactory;
import factory.pizza.KoreaCheesePizza;
import factory.pizza.KoreaClamPizza;
import factory.pizza.Pizza;

public class TaiwanPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new TaiwanPizzaIngredientFactory();
        if (type.equals("cheese")) {
            return new KoreaCheesePizza(ingredientFactory);
        } else if (type.equals("clam")) {
            return new KoreaClamPizza(ingredientFactory);
        }

        return null;
    }
}
