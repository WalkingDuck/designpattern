package com.wtw.factory;

import com.wtw.factory.beans.Apple;
import com.wtw.factory.beans.HuaWei;
import com.wtw.factory.beans.Phone;
import com.wtw.factory.beans.XiaoMi;

/**
 * 简单(静态)工厂模式实现
 * 缺点：要增加产品必须修改代码
 * 不适合产品经常变化的场景
 */
public class SimpleFactory {
    public Phone getPhone(String name) {
        Phone phone = null;
        if(name.equals("小米"))  {
            phone = new XiaoMi();
        } else if(name.equals("华为")) {
            phone = new HuaWei();
        } else if (name.equals("苹果")) {
            phone = new Apple();
        }
        //增加产品会很繁琐
        return phone;
    }
}
