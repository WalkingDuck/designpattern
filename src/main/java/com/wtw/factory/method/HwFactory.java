package com.wtw.factory.method;

import com.wtw.factory.beans.HuaWei;
import com.wtw.factory.beans.Phone;
import com.wtw.factory.method.PhoneFatory;

public class HwFactory implements PhoneFatory {
    public Phone getPhone() {
        return new HuaWei();
    }
}
