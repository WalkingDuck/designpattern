package com.wtw.factory.abstractt.beans;

public class MIFactory implements IProductFactory {
    public IPhoneProduct getPhone() {
        return new MIPhone();
    }

    public IRouterProduct getRouter() {
        return new MIRouter();
    }
}
