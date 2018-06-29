package observer;

import observer.observer.display.CurrentCondition;
import observer.subject.WeatherData;

public class ObserverMain {
    public static void test() {
        WeatherData wd = new WeatherData();
        CurrentCondition cco = new CurrentCondition(wd);
        wd.setMeasurements(0,0,1);
    }
}
