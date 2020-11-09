package com.wtw.single;

/**
 * 单例模式 -> 懒汉式实现
 * 采用了延迟加载方式避免了空间的浪费
 * 该方法需要加锁来保证线程安全
 * 该方式同样无法防止其他人用反射创建对象
 */
public class SingleLazy {

    //延迟加载
    private static SingleObject obj = null;

    private SingleLazy() {

    }

    /**
     * 双重检查所来确保线程安全并且之创建一个对象
     */
    public static SingleObject getInstance() {

        if(obj == null) {
            synchronized (SingleLazy.class) {
                if(obj == null) {
                    obj = new SingleObject();
                }
            }
        }

        return obj;
    }
}
