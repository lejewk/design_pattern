package factory.ingredients;

public class TaiwanPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new CamariDough();
    }

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }
}
