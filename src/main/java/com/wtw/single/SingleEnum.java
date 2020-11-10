package com.wtw.single;

/**
 * 单例模式 -> 使用枚举实现
 * 保证了线程安全且只创建一个对象
 * 避免了被反射攻击
 */
public class SingleEnum {

    //创建内部枚举类
    private enum EnumSingle {
        SINGLETON;

        private SingleObject single;

        private EnumSingle() {
            single = new SingleObject();
        }

        public SingleObject getInstance() {
            return single;
        }
    }

    public static SingleObject getInstance() {
        return EnumSingle.SINGLETON.getInstance();
    }
}
