package iterator;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator breakfastItems = pancakeHouseMenu.createIterator();
        Iterator lunchItems = dinerMenu.createIterator();

        printMenu(breakfastItems);
        printMenu(lunchItems);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menu = (MenuItem) iterator.next();
            System.out.println(menu.getName() + ", " + menu.getDesc() + ", " + menu.getPrice());
        }
    }
}
