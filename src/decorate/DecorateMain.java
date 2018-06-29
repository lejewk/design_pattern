package decorate;

import decorate.Condiment.Milk;
import decorate.Condiment.Moka;
import decorate.Drink.Espresso;
import decorate.Drink.HouseBlend;

import java.io.FileInputStream;
import java.io.InputStream;

public class DecorateMain {
    public static void test() {
        // 데코레이터
        Beverage b = new Espresso();
        System.out.printf("커피이름 : %s | 커피 가격 : %s \n", b.getDesc(), b.cost());

        Beverage c = new HouseBlend();
        c = new Milk(new Moka(c));

        System.out.printf("커피이름 : %s | 커피 가격 : %s", c.getDesc(), c.cost());
    }

    public static void test2() {
        try {
            InputStream is = new LowerCaseInputStream(new FileInputStream("test.txt"));
            int c;
            while((c = is.read()) >= 0) {
                System.out.print((char)c);
            }

            is.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
