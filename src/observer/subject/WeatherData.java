package observer.subject;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temp;
    private float humidify;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidify, float pressure) {
        this.temp = temp;
        this.humidify = humidify;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidify() {
        return humidify;
    }

    public float getPressure() {
        return pressure;
    }
}
