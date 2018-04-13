package other.singleton;

/**
 * 使用内部类实现单例
 */
public class Singleton3 {
    private Singleton3(){

    }
    private static class Inner{
        private static Singleton3 single = new Singleton3();
    }

    public Singleton3 getSingle(){
        return Inner.single;
    }
}
