package com.wtw.factory.method;

import com.wtw.factory.beans.Phone;
import com.wtw.factory.beans.XiaoMi;
import com.wtw.factory.method.PhoneFatory;

/**
 * 工厂方法模式实现
 */
public class MiFactory implements PhoneFatory {
    public Phone getPhone() {
        return new XiaoMi();
    }
}
