package com.wtw.factory.abstractt.beans;

public class MIRouter implements IRouterProduct {
    public void open() {
        System.out.println("小米路由器开机");
    }

    public void close() {
        System.out.println("小米路由器关机");
    }
}
