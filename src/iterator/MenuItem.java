package iterator;

public class MenuItem {
    String name;
    String desc;
    Boolean vegetarian;
    Double price;

    public MenuItem(String name, String desc, Boolean vegetarian, Double price) {
        this.name = name;
        this.desc = desc;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Boolean isVegetarian() {
        return vegetarian;
    }

    public Double getPrice() {
        return price;
    }
}
