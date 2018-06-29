import decorate.Beverage;
import decorate.Condiment.Milk;
import decorate.Condiment.Moka;
import decorate.Drink.Espresso;
import decorate.Drink.HouseBlend;
import observer.observer.display.CurrentCondition;
import observer.subject.WeatherData;

public class Main {

    public static void main(String[] args) {
//        WeatherData wd = new WeatherData();
//        CurrentCondition cco = new CurrentCondition(wd);
//        wd.setMeasurements(0,0,1);


        Beverage b = new Espresso();
        System.out.printf("커피이름 : %s | 커피 가격 : %s \n", b.getDesc(), b.cost());

        Beverage c = new HouseBlend();
        c = new Milk(new Moka(c));

        System.out.printf("커피이름 : %s | 커피 가격 : %s", c.getDesc(), c.cost());
    }
}
