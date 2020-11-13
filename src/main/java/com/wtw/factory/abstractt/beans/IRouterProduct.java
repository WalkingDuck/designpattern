package com.wtw.factory.abstractt.beans;

/**
 * 抽象工厂模式
 * 定义产品接口
 * 不负责增加产品，只需要增加产品接口之后交给实现类去增加
 * 抽象工厂可以解决一系列的产品生产的需求
 * 当产品多时抽象工厂可以很好的进行管理和扩展
 * 和简单工厂模式比较
 * 如果产品种类比较确定那么应该使用简单工厂模式
 * 如果产品种类多变应该使用抽象工厂模式
 */
public interface IRouterProduct {
    void open();
    void close();
}
