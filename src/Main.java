import observer.observer.display.CurrentCondition;
import observer.subject.WeatherData;

public class Main {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();

        CurrentCondition cco = new CurrentCondition(wd);

        wd.setMeasurements(0,0,1);
    }
}
