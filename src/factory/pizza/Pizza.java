package factory.pizza;

import factory.ingredients.Cheese;
import factory.ingredients.Dough;

public abstract class Pizza {
    private String name;
    public Dough dough;
    public Cheese cheese;

    public abstract void prepare();
    public void cut() {
        System.out.println("컷팅합니다.");
    }
    public void box() {
        System.out.println("포장했습니다");
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
