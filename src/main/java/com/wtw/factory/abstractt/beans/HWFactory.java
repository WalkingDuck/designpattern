package com.wtw.factory.abstractt.beans;

public class HWFactory implements IProductFactory {
    public IPhoneProduct getPhone() {
        return new HWPhone();
    }

    public IRouterProduct getRouter() {
        return new HWRouter();
    }
}
