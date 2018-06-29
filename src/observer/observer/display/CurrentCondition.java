package observer.observer.display;

import observer.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentCondition implements Observer, Display {
    private float temp;
    private float humidity;
    private float pressure;
    private Observable ob;

    public CurrentCondition(Observable ob) {
        this.ob = ob;
        ob.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        // subject로 부터 데이터가 갱신됨을 알렸고(push),
        // observer가 원하는 데이터는 제공하는 getter를 통해 획득한다(pull)
        if (o instanceof WeatherData) {
            WeatherData wd = (WeatherData) o;
            this.temp = wd.getTemp();
            this.humidity = wd.getHumidify();
            this.pressure = wd.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.printf(
                "Current condition: temp (%s), hum(%s), pres(%s)",
                this.temp,
                this.humidity,
                this.pressure
        );
    }
}
