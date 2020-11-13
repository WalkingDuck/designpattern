package com.wtw.factory.method;

import com.wtw.factory.beans.Phone;

/**
 * 工厂方法模式
 * 工厂方法模式就是每一个产品都拥有自己的工厂，需要哪个产品就去找对应的工厂生产
 * 虽然满足了开闭原则，但是当需要的产品很多时要创建很多工厂类
 *
 * 和简单工厂模式进行比较，
 * 工厂方法模式结构更为复杂，代码量更大，并且相比较于简单工厂更难于管理
 * 所以工厂方法模式虽然满足设计原则，但并不适合实际运用，实际中简单工厂更加实用
 */
public interface PhoneFatory {
    Phone getPhone();
}
