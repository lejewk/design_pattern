package iterator;


import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("소고기 볶음밥", "일반", true, 5.99);
        addItem("라따뚜이", "가정식", false, 6.99);
        addItem("사골국", "국물음식", false, 1.0);
    }

    public void addItem(String name, String desc, Boolean vegetarian, Double price) {
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sor, 메뉴가 꽉찻음다.");
            return;
        }

        menuItems[numberOfItems] = menuItem;
        numberOfItems++;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
