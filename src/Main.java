import decorate.Beverage;
import decorate.Condiment.Milk;
import decorate.Condiment.Moka;
import decorate.Drink.Espresso;
import decorate.Drink.HouseBlend;
import decorate.LowerCaseInputStream;
import observer.observer.display.CurrentCondition;
import observer.subject.WeatherData;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        // 옵저버
//        WeatherData wd = new WeatherData();
//        CurrentCondition cco = new CurrentCondition(wd);
//        wd.setMeasurements(0,0,1);


        // 데코레이터
//        Beverage b = new Espresso();
//        System.out.printf("커피이름 : %s | 커피 가격 : %s \n", b.getDesc(), b.cost());
//
//        Beverage c = new HouseBlend();
//        c = new Milk(new Moka(c));
//
//        System.out.printf("커피이름 : %s | 커피 가격 : %s", c.getDesc(), c.cost());


        // 데코레이터 실전
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
