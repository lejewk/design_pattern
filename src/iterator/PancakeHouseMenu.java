package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("팬케이크", "일반", true, 2.99);
        addItem("햄 케이크", "햄이 있음", true, 2.99);
        addItem("채소 팬케이크", "채소 전용", false, 4.0);
    }

    public void addItem(String name, String desc, Boolean vegetarian, Double price) {
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
