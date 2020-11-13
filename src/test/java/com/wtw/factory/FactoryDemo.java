package com.wtw.factory;

import com.wtw.factory.beans.Phone;
import com.wtw.factory.method.AppleFactory;
import com.wtw.factory.method.HwFactory;
import com.wtw.factory.method.MiFactory;
import com.wtw.factory.simple.SimpleFactory;
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
        mi.call();
        hw.call();
        apple.call();
    }

    @Test
    public void TestMethod() {
        MiFactory miFactory = new MiFactory();
        HwFactory hwFactory = new HwFactory();
        AppleFactory appleFactory = new AppleFactory();
        Phone mi = miFactory.getPhone();
        Phone hw = hwFactory.getPhone();
        Phone apple = appleFactory.getPhone();

         mi.call();
         hw.call();
         apple.call();
         //相比简单工厂模式，需要更多的代码
    }
}
