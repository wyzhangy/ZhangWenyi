package other.singleton;

/**
 * 饿汉式单例
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 */


public class Singleton1 {
    //私有的构造方法
    private Singleton1(){}
    private static Singleton1 singel = new Singleton1();

    public static Singleton1 getSingel(){
        return singel;

    }
}