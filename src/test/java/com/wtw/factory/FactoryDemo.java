package com.wtw.factory;

import com.wtw.factory.beans.Phone;
import org.junit.Test;

/**
 * 工厂模式测试类
 */
public class FactoryDemo {
    /**
     * 测试简单工厂
     */
    @Test
    public void testSimple() {
        SimpleFactory simpleFactory = new SimpleFactory();
        Phone mi = simpleFactory.getPhone("小米");
        Phone hw = simpleFactory.getPhone("华为");
        Phone apple = simpleFactory.getPhone("苹果");
        mi.Call();
        hw.Call();
        apple.Call();
    }
}
