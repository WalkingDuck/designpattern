package com.wtw.observer;

/**
 * 测试观察者模式
 */
public class TestObserver {
    public static void main(String[] args) {
        WeatherData sub = new WeatherData();
        Observer baidu = new Baidu();
        sub.registerObserver(baidu);
        sub.setData(1,2,3);
    }
}
