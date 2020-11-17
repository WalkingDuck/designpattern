package com.wtw.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private double temprature;
    private double pressure;
    private double humidity;
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    /**
     * 当数据又改变时会通知所有的观察者
     */
    public void setData(double temprature, double pressure, double humidity) {
        this.temprature = temprature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this.temprature, this.pressure, this.humidity);
        }
    }
}
