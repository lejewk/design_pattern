package factory;

import factory.pizza.Pizza;
import factory.store.KoreaPizzaStore;
import factory.store.PizzaStore;

public class FactoryMain {
    public static void test() {
        PizzaStore ps = new KoreaPizzaStore();
        Pizza pizza = ps.orderPizza("clam");
    }
}
