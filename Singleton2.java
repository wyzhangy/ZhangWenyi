package other.singleton;

/**
 * 懒汉
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁synchronized才能保证单例（两个线程同时调用getInstance方法）但加锁会影响效率。
 */

public class Singleton2 {

    //私有的构造方法
    private Singleton2(){}

    private static Singleton2 single;

    //处理多线程不安全
    public static Singleton2 getSingel(){
        if(single==null){
            synchronized (Singleton2.class){
                if(single==null)
                    single = new Singleton2();
            }
        }
        return single;
    }
}
