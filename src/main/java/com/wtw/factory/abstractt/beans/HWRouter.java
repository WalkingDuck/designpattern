package com.wtw.factory.abstractt.beans;

public class HWRouter implements IRouterProduct {
    public void open() {
        System.out.println("华为路由器开机");
    }

    public void close() {
        System.out.println("华为路由器关机");
    }
}
