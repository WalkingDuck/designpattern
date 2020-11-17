package com.wtw.observer;

public class Baidu implements Observer {

    private double temprature;
    private double pressure;
    private double humidity;

    public void update(double temprature, double pressure, double humidity) {
        this.temprature = temprature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("-----------Baidu-----------");
        System.out.println("now temprature is " + temprature);
        System.out.println("now pressure is " + pressure);
        System.out.println("now humidity is " + humidity);
    }
}
