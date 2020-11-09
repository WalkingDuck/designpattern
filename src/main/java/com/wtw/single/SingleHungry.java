package com.wtw.single;

/**
 * 单例模式 -> 饿汉式实现
 * 饿汉式顾名思义就是在类加载时就初始化完成创建一个对象供外部使用
 * 该方法线程安全
 * 但无法防止反射创建新对象
 */
public class SingleHungry {

    private static SingleObject obj = new SingleObject();

    /**
     * 注意：单例模式的构造方法必须是private
     */
    private SingleHungry() {

    }

    public static SingleObject getInstance() {
        return obj;
    }

    public static void main(String[] args) {
        SingleObject instance = getInstance();
        SingleObject instance2 = getInstance();
        System.out.println(instance == instance2);
    }
}
