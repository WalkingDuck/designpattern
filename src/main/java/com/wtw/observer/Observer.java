package com.wtw.observer;

/**
 * 观察者类接口
 */
public interface Observer {
    void update(double temprature, double pressure, double humidity);
}
