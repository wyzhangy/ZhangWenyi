package other.singleton.factory;

/**
 * 抽象类工厂
 *
 */
public abstract class AbstructFactory {
    public abstract C1 createC1();

    public abstract C2 createC2();

    public abstract C3 createC3();
}

class Factory1 extends AbstructFactory{
    @Override
    public C1 createC1() {
        return new C1();
    }

    @Override
    public C2 createC2() {
        return new C2();
    }

    @Override
    public C3 createC3() {
        return new C3();
    }

    public static void main(String[] args) {
        Factory1 factory1 = new Factory1();
        factory1.createC1();
        factory1.createC2();
        factory1.createC3();
    }
}