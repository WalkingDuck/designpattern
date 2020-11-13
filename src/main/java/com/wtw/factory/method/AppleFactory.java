package com.wtw.factory.method;

import com.wtw.factory.beans.Apple;
import com.wtw.factory.beans.Phone;
import com.wtw.factory.method.PhoneFatory;

public class AppleFactory implements PhoneFatory {
    public Phone getPhone() {
        return new Apple();
    }
}
