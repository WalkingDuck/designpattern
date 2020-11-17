package com.wtw.observer;

/**
 * 观察者模式主类，管理观察者
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
