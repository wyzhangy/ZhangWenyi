package other.singleton;

/**
 * 懒汉式加载 线程不安全
 * 在类加载时不初始化。
 */
public class Singleton4 {
    private static Singleton4 singleton4;

    private Singleton4(){}

    public static Singleton4 getSingleton4(){
        if(singleton4!=null){
            singleton4 = new Singleton4();
        }
        return singleton4;
    }
}
