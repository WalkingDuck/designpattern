package com.wtw.single;

/**
 * 单例模式 -> 静态内部类实现
 * 该方法既保证线程安全也确保只有一个对象创建
 * 仍然无法避免通过反射创建对象
 */
public class SingleInner {

    private static class InnerClass {
        private static SingleObject obj = new SingleObject();
    }

    private SingleInner() {

    }

    /**
     * 只有当运行该方法时才会去加载InnerClass类并且初始化对象
     * 这样保证了线程安全：
     * 虚拟机会保证一个类的类初始化阶段在多线程环境中被正确地加锁、同步，如果多个线程同时去初始化一个类，
     * 那么只会有一个线程去执行这个类的类初始化方法，其他线程都需要阻塞等待，直到活动线程执行完毕。
     * 同一个加载器下，一个类型只会类初始化一次。
     */
    private static SingleObject getInstance() {
        return InnerClass.obj;
    }

}
