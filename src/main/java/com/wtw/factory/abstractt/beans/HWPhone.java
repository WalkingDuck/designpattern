package com.wtw.factory.abstractt.beans;

public class HWPhone implements IPhoneProduct{

    public void open() {
        System.out.println("华为开机");
    }

    public void close() {
        System.out.println("华为关机");
    }

    public void call() {
        System.out.println("华为打电话");
    }
}
